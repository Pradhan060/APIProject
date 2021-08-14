package com.api.testScripts;

import org.testng.annotations.Test;

import com.api.genericLib.BaseClass;
import com.api.genericLib.EndPoints;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class FetchAllStudentTest extends BaseClass{

	@Test
	public void getAllStudent() {
		Response resp = get(EndPoints.STUDENTAPI);
		resp.then().log().all();
	}
}
