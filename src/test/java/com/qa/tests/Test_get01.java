package com.qa.tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_get01 {

	@Test(priority = 1)
public void getrequest() {
	
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/users")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.header("Content-Type", "application/json");
}
//Verifying single content
	@Test(priority = 2)
	public void getList() {
		RestAssured.baseURI = "https://reqres.in/api/unknown";
		
		given()
		.when()
		.get()
		.then()
		.assertThat().body("data.id", equalTo(1))
		.log().all();
		
	}
	//Verifying multiple content
		@Test(priority = 3)
		public void getList001() {
			RestAssured.baseURI = "https://reqres.in/api";
			RestAssured.basePath = "/users";
		
			when()
			.get()
			.then()
			.statusCode(200)
			.log().all()
			.body("data.first_name", hasItems("George", "Janet", "Emma" ))
			.body("data.last_name", hasItems("Wong","Holt", "Morris"), "data.id", hasItems(1, 2, 3, 4, 5));
			
			
		}	
	
}
