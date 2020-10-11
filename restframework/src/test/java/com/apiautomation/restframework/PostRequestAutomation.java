package com.apiautomation.restframework;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostRequestAutomation {
  @Test
  public void postApiAutomation() {
	  RestAssured.baseURI = "https://reqres.in/api/users";
	  
	  String json = "{\n" + 
	  		"    \"name\": \"morpheus\",\n" + 
	  		"    \"job\": \"leader\"\n" + 
	  		"}";
	  
	  RestAssured.given().body(json).post().then()
	  			.log()
	  			.all()
	  			.assertThat()
	  			.statusCode(201);
	  
	  
	  
  }
}
