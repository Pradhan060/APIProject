package com.pratice.restAssured;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import io.restassured.http.ContentType;

public class DemoPatchFromPOJO {
	@Test
	public void checkPostPojo() throws JsonProcessingException {
		

		HashMap<String, Object> map = new HashMap<String , Object>();
		map.put("age", 30);		
		
		given().body(map).contentType(ContentType.JSON)
		.when().patch("http://localhost:3000/student/7")
		.then().log().all();
	}
}
