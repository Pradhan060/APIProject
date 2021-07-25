package com.pratice.restAssured;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class DempPOSTThroughMap {

	@Test
	public void checkPostMap() {
		
		// create payload
		HashMap<String , Object> payLoad = new HashMap<String , Object>();
		
		payLoad.put("name", "Rohit");
		payLoad.put("gender", "male");
		payLoad.put("age", 32);
		payLoad.put("contact", 1564895623);
		
		// set precondition
		RequestSpecification rs = RestAssured.given();
		rs.body(payLoad);
		rs.contentType(ContentType.JSON);
		
		// send request along with precondition
		RequestSender sender = rs.when();
		Response resp = sender.post("http://localhost:3000/students");
		
		// print all complete response
		ValidatableResponse vr = resp.then();
		vr.log().all();
	}
}
















