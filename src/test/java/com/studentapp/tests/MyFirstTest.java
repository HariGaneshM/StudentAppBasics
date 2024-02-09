package com.studentapp.tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class MyFirstTest extends TestBase {
	
	@DisplayName("All Student")
	@Test
	void getAllStudents() {
		
		given()
		   .when()
		   .get("/list")
		   .then()
		   .statusCode(200);
	}
	
	@Disabled
	@DisplayName("All Computer Science Student")
	@Test
	void getComputerScienceStudents() {
		
		Response response = 
		given()
		   .queryParam("programme", "Computer Science")
		   .when()
		   .get("/list");
		   
		   response.prettyPrint();
	}
	
	@DisplayName("All Computer Science Student")
	@Test
	void studentById() {
		
		Response response = 
		given()
		   .pathParam("id", 9)
		   .when()
		   .get("/{id}");
		   
		   response.prettyPrint();
	}
}
