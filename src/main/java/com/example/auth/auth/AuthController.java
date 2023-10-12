package com.example.auth.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.auth.dto.JwtAuthenticationResponse;
import com.example.auth.dto.LoginRequest;
import com.example.auth.service.AuthenticationService;

@RestController
@CrossOrigin
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    private AuthenticationService authenticationService;

    /**
     * @param loginRequest
     * @return
     */
    // @PostMapping("/signin")
    // public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest
    // loginRequest) {
    // System.out.println("loginRequest " + loginRequest);
    // return new ResponseEntity<>(loginRequest, HttpStatus.OK);
    // }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}
