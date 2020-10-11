package com.apiautomation.restframework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequestAutomation {
  
	@Test
  public void getrequestAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		
//		RestAssured.given().param("page", "2")
//		.when()
//		.get()
//		.then()
//		.assertThat()
//		.log()
//		.all()
//		.statusCode(200);
		
		Response response  = RestAssured.given().param("page", "2").when().get();
		System.out.println("\n \t "+response.getBody().asString());
		System.out.println("\n \t Get Status Code \t"+response.getStatusCode());
		System.out.println("\n \t Get Content Type \t"+response.getContentType());
		System.out.println("\n \t Get Time \t"+response.getTime());
		System.out.println("\n \t Get cookies \t"+response.getCookies());
		
		System.out.println("\n \t"+response.prettyPrint());
		
		
		
	}
  
  
  
}
