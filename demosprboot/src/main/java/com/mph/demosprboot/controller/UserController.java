package com.mph.demosprboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mph.demosprboot.entity.User;
import com.mph.demosprboot.service.UserService;

@RestController
@RequestMapping("/demosprboot/api/auth")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders="*",allowCredentials = "true")
public class UserController {
	@Autowired
	private UserService authService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody User user){
		String response = authService.registerUser(user);
		if(response.equals("Username already exists")) {
			return ResponseEntity.badRequest().body(response);
			}
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user){
		User authenticatorUser = authService.authenticator(user);
		if(authenticatorUser!=null) {
			return ResponseEntity.ok(authenticatorUser);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credential");
	}

}
