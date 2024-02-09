package com.studentapp.loggingresponseinfo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.studentapp.pojo.StudentPOJO;
import com.studentapp.tests.TestBase;

import io.restassured.http.ContentType;

public class LoggingResponseInfo extends TestBase {
	
	@DisplayName("Print Headers")
	@Test
	void PrintHeaders() {
		
		System.out.println("-------Printing Headers-------");
		given()
		   .when()
		   .get("/1")
		   .then()
		   .log()
		   .headers()
		   .statusCode(200);
	}
	
	@DisplayName("Print Status")
	@Test
	void PrintStatus() {
		
		System.out.println("-------Printing Status-------");
		given()
		   .when()
		   .get("/1")
		   .then()
		   .log()
		   .status()
		   .statusCode(200);
	}
	
	@DisplayName("Print Status")
	@Test
	void PrintResponse() {
		
		System.out.println("-------Printing Response body for get-------");
		given()
		   .when()
		   .get("/1")
		   .then()
		   .log()
		   .body()
		   .statusCode(200);
	}
	
	@DisplayName("Printing Response body")
	@Test
	void PrintBody() {
		
		System.out.println("-------Printing Response body-------");
		StudentPOJO newStudent = new StudentPOJO();

		Faker faker = new Faker();

		List<String> courses = new ArrayList<String>();
		courses.add("Refrigiration and Air Conditioning");
		courses.add("Welding Foundation");

		newStudent.setFirstName(faker.name().firstName());
		newStudent.setLastName(faker.name().lastName());
		newStudent.setEmail(faker.internet().emailAddress());
		newStudent.setProgramme("Mechanical");
		newStudent.setCourses(courses);
		
		given()
		   .when()
		   .contentType(ContentType.JSON)
		   .when()
		   .body(newStudent)
		   .post()
		   .then()
		   .log()
		   .body()
		   .statusCode(201);
	}

	@DisplayName("Printing Request Details incase error")
	@Test
	void PrintIncaseError() {
		
		System.out.println("-------Printing Request Details incase error-------");
		
		given()
		   .when()
		   .param("limit", -1)
		   .get("/list")
		   .then()
		   .log()
		   .ifError();
	}
}
