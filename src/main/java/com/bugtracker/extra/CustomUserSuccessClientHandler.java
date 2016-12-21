package com.bugtracker.extra;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.web.client.RestTemplate;

import com.bugtracker.model.CurrentUser;
import com.bugtracker.urls.UrlConstants;

public class CustomUserSuccessClientHandler extends
		SimpleUrlAuthenticationSuccessHandler {
	private Logger logger = Logger
			.getLogger(CustomUserSuccessClientHandler.class);

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		logger.info("***************** onAuthenticationSuccess ********************");
		RestTemplate restTemplate = new RestTemplate();
		String url = UrlConstants.GETUSERBYNAME + "?name="
				+ authentication.getName();
		CurrentUser currentUser = restTemplate.getForObject(url,
				CurrentUser.class);
		request.getSession().setAttribute("currentUser", currentUser);
		Set<String> roles = AuthorityUtils.authorityListToSet(authentication
				.getAuthorities());

		if (roles.contains("ROLE_ADMIN")) {
			logger.info("***************** Authentication Success ROLE_ADMIN ********************");
			String url1 = "/showAdminHome";
			getRedirectStrategy().sendRedirect(request, response, url1);
		}

	}
}
