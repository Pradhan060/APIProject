package com.pratice.restAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class AuthIInAPIS {

	@Test
	public void tokenAuthentication() {
				
		Response resp = given()
							.param("client_id", "OAR")
							.param("client_secret", "c024123bfbf47efc2cdfdafae2d3693f")
							.param("grant_type", "client_credentials")
						.when()
							.post("http://coop.apps.symfonycasts.com/token");
		
		Object token = resp.jsonPath().get("access_token");
		
		given().auth().oauth2(token.toString())
		.when().post("http://coop.apps.symfonycasts.com/api/1301/eggs-count")
		.then().log().all();

	}
}
