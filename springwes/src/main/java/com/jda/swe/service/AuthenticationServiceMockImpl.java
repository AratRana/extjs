package com.jda.swe.service;

import javax.naming.AuthenticationException;

import org.springframework.stereotype.Repository;

import com.jda.swe.model.Credentials;

@Repository(value="authenticationService")
public class AuthenticationServiceMockImpl implements IAuthenticationService {
 private final static Credentials[] creds = new Credentials[] {
   new Credentials("john", "p@zzw0rd")
 };
 
 public String authenticate(Credentials userCredentials) throws AuthenticationException {
  for(Credentials oneCredential : creds) {
   if(oneCredential.equals(userCredentials)) {
    return oneCredential.getLogin();
   }
  }
  throw new AuthenticationException("Sorry, you are not allowed to enter !");
 }

}
