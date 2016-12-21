package com.bugtracker.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.bugtracker.extra.AuthUtility;
import com.bugtracker.model.Application;
import com.bugtracker.model.CurrentUser;
import com.bugtracker.urls.UrlConstants;

@Controller
public class HomeController {
	@Autowired
	private AuthUtility authUtility;

	private Logger logger = Logger.getLogger(HomeController.class);

	@RequestMapping(value = { "/", "/login/loadAdminPage" })
	public String showLoginPage(
			@RequestParam(value = "authfailed", required = false) String authFailed,
			@RequestParam(value = "logout1", required = false) String logout,
			Model model) {
		logger.info("Showing LoginPage");
		if (authFailed != null) {
			model.addAttribute("ERROR_MESSAGE",
					"Invalid username or password, try again !");
		}
		if (logout != null) {
			model.addAttribute("SUCCESS_MESSAGE", "Logged out successfully");
			logger.info("Logout successful");
		}
		return "login";

	}

	/*@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		logger.info("Logout Successful");
		session.invalidate();
		return "redirect:/";
	}
*/
	@RequestMapping(value = "/showAdminHome")
	public String showAdminHome(Principal principal, Model model,
			HttpSession session) {
		logger.info("Showing Admin Home Page");
		logger.info("Current admin name is" + principal.getName());
		CurrentUser user = (CurrentUser) session.getAttribute("currentUser");
		HttpEntity<String> request = AuthUtility.getAuthenticated();
		RestTemplate restTemplate = new RestTemplate();
		String url = UrlConstants.GETALLAPPS;
		ResponseEntity<List<Application>> response = restTemplate.exchange(url,
				HttpMethod.GET, request,
				new ParameterizedTypeReference<List<Application>>() {
				});
		List<Application> appList = (List<Application>) response.getBody();
		for (Application app : appList) {
			logger.info("App Names in client service"
					+ app.getApplicationName());
		}
		model.addAttribute("appsList", appList);
		return "adminHome";
	}

}
