package com.apiautomation.restframework;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWetherRequest {
  @Test
  public void GetWeatherDetails() {
	  
	  // Specify the base url to the restful web services 
	  RestAssured.baseURI = "https://reqres.in/api";
	  
	  // Get the Request Specification of the Request that you want to sent
	  // to the server. The Server is specified by the base uri that we have 
	  // specified is the above step 
	  
	  RequestSpecification httpRequest = RestAssured.given();
	  
	  // Make a get request call directly by using requestspecification.get() Method 
	  // Make sure you specify the resource name 
	  Response response = httpRequest.get("/users?page=2");
	  
	  // Response.asString method will directly return the content of the body 
	  // as String 
	  
	  
	 // System.out.println("\n \t Response Body is => \t "+response.asString());
	  
	  System.out.println("\n \t Response Body is => \t "+response.prettyPrint());
	  
  }
  
  @Test
  public void ValidateStatusCode() {
	  
	  RestAssured.baseURI = "https://reqres.in/api";
	  RequestSpecification  httpReq = RestAssured.given();
	  Response res = httpReq.get("/users?page=2");
	  
	  // Get the status code from the Response. In case of 
	  // a successful interaction with the web service. we 
	  // should get a status code of  200
	  
	  int statuscode = res.getStatusCode();
	  
	// Assert that correct status code is returned 
	  assertEquals(statuscode, 200);
			  
	 System.out.println("\n \t Status Code :-> \t "+statuscode); 
  
	 // Validate Status Line from the Response and store in a variable called status line 
	 
	 String statusLine = res.statusLine();
	 Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	 
	 System.out.println("\n \t Status Line we get :- > \t "+statusLine);
  
  }
  
  
  
}
