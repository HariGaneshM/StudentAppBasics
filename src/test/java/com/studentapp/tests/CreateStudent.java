package com.studentapp.tests;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.http.ContentType;

public class CreateStudent extends TestBase {
	
	@DisplayName("Create New Student")
	@Test
	void createStudents() {
		
		String Body = "{\"firstName\":\"Student01\",\"lastName\":\"RestAssured\",\"email\":\"Student@RestAssured.co.uk\",\"programme\":\"Computer Science\",\"courses\":[\"Calculus\",\"Algorithms\",\"Software Development\",\"Ethics\"]}";
		
		given()
		   .when()
		   .contentType(ContentType.JSON)
		   .when()
		   .body(Body)
		   .post()
		   .then()
		   .statusCode(201);
	}
}
