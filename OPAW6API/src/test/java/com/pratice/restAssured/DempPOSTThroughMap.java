package com.pratice.restAssured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DempPOSTThroughMap {

	@Test
	public void checkPostMap() {
		System.out.println("Test Start");
		// create payload
		HashMap<String , Object> payLoad = new HashMap<String , Object>();
		
		payLoad.put("name", "Rohit");
		payLoad.put("gender", "male");
		payLoad.put("age", 32);
		payLoad.put("contact", 1564895623);
		
		
		given().body(payLoad).contentType(ContentType.JSON)
		.when().post("http://localhost:3000/student")
		.then().log().all();
	
	}
}
















