package studentApiTest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import apiConfigs.APIPath;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest{

	@Test
	public void getAPITest() {
		
	//	RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_USERS).then().log().all().statusCode(200);
		
		Response response  = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_USERS);
		
		System.out.println("\n \t "+response.getBody().asString());
//		
//		System.out.println("\n \t "+response.getStatusCode());
//		
//		System.out.println("\n \t "+response.getStatusLine());
//	
//		System.out.println("\n \t "+response.getCookies());
//		
//		System.out.println("\n \t "+response.getTime());
	
//		JsonArray array = new JsonArray(response.getBody().asString());
//		
//		for (int i=0; i<array.length();i++) {
//			JsonObject obj = array.getAsJsonObject(i);
//			System.out.println(obj.get("title"));
//			
//			
//		}
//		 
		
		// 15 Number of video is Pending 


//		JSONArray array = new JSONArray(response.getBody().asString());
//		
//		for(int i=0; i<array.length();i++) {
//			//System.out.println(array.get(i));
//			
//			JSONObject obj = array.getJSONObject(i);
//			System.out.println(obj.get("title"));
//		}
//		
		
	}
	
}
