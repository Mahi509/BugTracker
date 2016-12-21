package com.bugtracker.extra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.bugtracker.model.CurrentUser;
import com.bugtracker.urls.UrlConstants;

@Service("customUserDetailsService1")
@Transactional(readOnly = true)
public class CustomUserDetailsClientService implements UserDetailsService {
	private Logger logger = Logger
			.getLogger(CustomUserDetailsClientService.class);

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		logger.info("****************Inside CustomUserDetailsClient*****************");
		logger.info("Current UserName is" + " " + userName);
		UserDetails user = null;
		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setContentType(MediaType.APPLICATION_JSON);
		 * HttpEntity<String> request = new HttpEntity<String>(headers);
		 */
		try {
			RestTemplate restTemplate = new RestTemplate();
			String url = UrlConstants.GETUSERBYNAME + "?name=" + userName;
			CurrentUser currentUser = restTemplate.getForObject(url,
					CurrentUser.class);
			user = new User(currentUser.getFirstName(),
					currentUser.getPassword(), currentUser.isStatus(), true,
					true, true, getAuthorities(currentUser.getRoles()
							.getRoleId()));
		} catch (Exception e) {
			logger.info("Error in retrieving user");
		}
		return user;
	}

	public Collection<GrantedAuthority> getAuthorities(Integer roleId) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>();
		if (roleId.intValue() == 1) {
			logger.info("Grant RoleAdmin for the user");
			authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		}

		return authList;
	}

}
