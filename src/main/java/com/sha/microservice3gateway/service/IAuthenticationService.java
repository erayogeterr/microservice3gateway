package com.sha.microservice3gateway.service;

import com.sha.microservice3gateway.model.User;

public interface IAuthenticationService {

	String signInAndReturnJWT(User signInRequest);
}
