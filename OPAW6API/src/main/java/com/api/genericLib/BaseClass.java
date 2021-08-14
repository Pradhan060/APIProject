package com.api.genericLib;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseClass {

	@BeforeSuite
	public void configBaseURL() {
		RestAssured.baseURI = "http://localhost:3000/";
	}
}
