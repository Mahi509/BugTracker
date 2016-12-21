package com.bugtracker.extra;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.codec.Base64;
import org.springframework.stereotype.Component;

@Component
public class AuthUtility {

	public static HttpEntity<String> getAuthenticated() {

		String plainCreds = Constants.USERNAME + ":" + Constants.PASSWORD;
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encode(plainCredsBytes);
		String base64Cred = new String(base64CredsBytes);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Cred);
		/*headers.setContentType(MediaType.APPLICATION_JSON);*/
		HttpEntity<String> request = new HttpEntity<String>(headers);

		return request;

	}
}
