package com.pratice.restAssured;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class AuthenticationInAPIs {

	@Test
	public void basicAuthentication() {
		// https://postman-echo.com/basic-auth
		// username :- postman
		// password :- password
		
		given().auth().basic("postman", "password")
		.when().get("https://postman-echo.com/basic-auth")
		.then().log().all();
		
		
//		Response resp = get("https://postman-echo.com/basic-auth");
//		resp.then().log().all(); 401 Unauthorized
	}

	
}
























// 