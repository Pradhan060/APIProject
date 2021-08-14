package com.pratice.restAssured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;

public class DemoPostByPOJO {

	@Test
	public void checkPostPojo() throws JsonProcessingException {
		
		StudentPOJO s1 = new StudentPOJO();
		
		// set data as per requirement
		s1.setName("Bhargav");
		s1.setAge(25);
		s1.setGender("male");
		s1.setContactNum(8888823232l);
		
		ObjectMapper mapper = new ObjectMapper();
		String studentJsonPayload = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s1);
				
		given().body(studentJsonPayload).contentType(ContentType.JSON)
		.when().post("http://localhost:3000/student")
		.then().log().all();
	}
}
