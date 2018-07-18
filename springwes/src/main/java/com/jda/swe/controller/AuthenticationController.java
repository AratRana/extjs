package com.jda.swe.controller;

import java.util.HashMap;
import java.util.Map;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jda.swe.model.Credentials;
import com.jda.swe.service.IAuthenticationService;

@Controller
public class AuthenticationController {
	@Autowired
	IAuthenticationService authenticationService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public @ResponseBody Map authenticate(Credentials cred, HttpSession ses) {
		Map response = new HashMap<>();
		try {
			String userName = authenticationService.authenticate(cred);
			response.put("success", true);
			response.put("msg", "Welcome " + userName);
		} catch (AuthenticationException e) {
			response.put("success", false);
			response.put("msg", e.getMessage());
		}
		return response;
	}
}