package com.bugtracker.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.bugtracker.extra.AuthUtility;
import com.bugtracker.model.Application;
import com.bugtracker.model.Bug;
import com.bugtracker.urls.UrlConstants;

@Controller
@RequestMapping("/adminClient")
public class AdminClientController {
	@Autowired
	private AuthUtility authUtility;
	private Logger logger = Logger.getLogger(AdminClientController.class);

	@RequestMapping(value = "/showBugs/{id}")
	public String showAllBugsByApp(@PathVariable("id") Long id, Model model) {
		logger.info("Method called to show totol bugs for app id" + " " + id);

		HttpEntity<String> request = AuthUtility.getAuthenticated();
		RestTemplate restTemplate = new RestTemplate();
		String url = UrlConstants.GETBUGSBYID + id;
		ResponseEntity<List<Bug>> response = restTemplate.exchange(url,
				HttpMethod.GET, request,
				new ParameterizedTypeReference<List<Bug>>() {
				});
		List<Bug> listBugs = (List<Bug>) response.getBody();
		model.addAttribute("listOfBugs", listBugs);
		model.addAttribute("AppId", id);
		return "bugDetails";
	}

}
