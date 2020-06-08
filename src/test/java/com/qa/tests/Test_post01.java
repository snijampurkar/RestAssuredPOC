package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import com.qa.util.RestUtil;
import io.restassured.RestAssured;



public class Test_post01 {
	
	public static HashMap map = new HashMap();
	
	String name = RestUtil.getName();
	String sal = RestUtil.getSalary();
	String age = RestUtil.getage();

	@BeforeClass
	public void Data() {
	
		map.put("name",name);
		map.put("salary",sal);
		map.put("age",age);
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/create";	
	}
	
	@Test
	public void testput() {
		
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	
	
	
	
	

}
