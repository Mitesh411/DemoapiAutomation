package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.RestAssured;
import utils.ExtentReportListner;
import utils.FileandEnv;



@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner{

//	@Test
//	public void utilsTest() {
//		//System.out.println(FileandEnv.envAndFile().get("ServerUrl"));
//		System.out.println(FileandEnv.envAndFile());
//		
//	}
	
//	@Test
//	public void utilsTest() {
//		
//		int a = 10;
//		int b = 20;
//		int sum = a + b;
//		
//		test.log(LogStatus.INFO, "Test has been Started...");
//		test.log(LogStatus.PASS, "My Test has Passed");
//	
//		test.log(LogStatus.PASS, "My sum Result is :- "+sum);
//	}
	
	@BeforeClass
	public void baseTest() {
	//	RestAssured.baseURI = "http://localhost:3000/";
		
		RestAssured.baseURI = FileandEnv.envAndFile().get("ServerUrl");
		
	}

}
