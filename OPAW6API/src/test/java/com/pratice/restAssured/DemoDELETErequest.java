package com.pratice.restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoDELETErequest {
	@Test
	public void checkDelete() {
		
		Response resp = RestAssured.delete("http://localhost:3000/student/7");
		
		System.out.println("Status Code : " + resp.getStatusCode());
		System.out.println("Content Type : " + resp.getContentType());
		System.out.println("Response Time : " + resp.getTime() + " ms");
		
		System.out.println("Complete Response body : ");
		
		System.out.println(resp.asString());
	}
}
