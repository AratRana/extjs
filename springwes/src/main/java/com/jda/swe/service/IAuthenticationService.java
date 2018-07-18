package com.jda.swe.service;

import javax.naming.AuthenticationException;

import com.jda.swe.model.Credentials;

public interface IAuthenticationService {
	/**
	  * Authenticates a user against its credentials
	  * 
	  * @param userCredentials
	  *            login and password
	  * @return user's identity
	  * @throws AuthenticationException raised if authentication failed.
	  */
	 String authenticate(Credentials userCredentials) throws AuthenticationException;
}
