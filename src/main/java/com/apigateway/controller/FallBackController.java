package com.apigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apigateway.entity.ResponseBean;

@RestController
public class FallBackController {
	
	@GetMapping("/userServiceFallBack")
	public ResponseEntity<?> userServiceFallback(){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseBean("UserService is down"));
	}
	
	@GetMapping("/encryptionServiceFallBack")
	public ResponseEntity<?> encryptionServiceFallback(){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseBean("EncryptDecryptService is down"));
	}
	
	@GetMapping("/userPanelFallBack")
	public ResponseEntity<?> userPanelFallback(){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseBean("UserPanelFrontend is down"));
	}
	
	@GetMapping("/adminPanelFallBack")
	public ResponseEntity<?> frontEndPanelFallback(){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ResponseBean("AdminPanelFrontend is down"));
	}
	
	

}
