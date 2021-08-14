package com.pratice.restAssured;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DemoPostThroughFile {

	@Test
	public void checkPostJsonFile() {
		
		File payLoad = new File("StudentData.json");
		
		given().body(payLoad).contentType(ContentType.JSON)
		.when().post("http://localhost:3000/student")
		.then().log().all();
	}
}
