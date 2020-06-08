package com.qa.tests;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_Delete {

	@Test
	public void deleteEmployee() {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/delete/20";
	Response response=	
	given()
	.when()
	.delete()
	.then()
	.statusCode(200)
	.statusLine("HTTP/1.1 200 OK")
	.log().all()
	.extract().response();
	
	String jsonresponse=response.asString();
		AssertJUnit.assertEquals(jsonresponse.contains("Error! Not able to delete record"), true);
		
	}
	
	
	
	
	
}
