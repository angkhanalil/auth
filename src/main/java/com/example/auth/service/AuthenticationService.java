package com.example.auth.service;

import com.example.auth.dto.JwtAuthenticationResponse;
import com.example.auth.dto.LoginRequest;

public interface AuthenticationService {

    JwtAuthenticationResponse signin(LoginRequest request);
}
 