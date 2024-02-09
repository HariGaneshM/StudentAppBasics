package com.studentapp.loggingrequestinfo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;
import com.studentapp.pojo.StudentPOJO;
import com.studentapp.tests.TestBase;

import io.restassured.http.ContentType;

public class LoggingRequestInfo extends TestBase {
	
	@DisplayName("Headers Print")
	@Test
	void PrintHeaders() {
		
		System.out.println("-------Printing Headers-------");
		given()
		   .log()
		   .headers()
		   .when()
		   .get("/1")
		   .then()
		   .statusCode(200);
	}
	
	@DisplayName("Parameters Print")
	@Test
	void PrintParameters() {
		
		System.out.println("-------Printing Parameters-------");
		given()
		   .param("programme", "Computer Science")
		   .log()
		   .params()
		   .when()
		   .get("/list")
		   .then()
		   .statusCode(200);
	}
	
	@DisplayName("Printing Request body")
	@Test
	void PrintBody() {
		
		System.out.println("-------Printing Request body-------");
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
		   .log()
		   .body()
		   .when()
		   .body(newStudent)
		   .post()
		   .then()
		   .statusCode(201);
	}
	
	@DisplayName("Printing All Request Details")
	@Test
	void PrintAll() {
		
		System.out.println("-------Printing All Request Details-------");
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
		   .log()
		   .all()
		   .when()
		   .body(newStudent)
		   .post()
		   .then()
		   .statusCode(201);
	}
	
	@DisplayName("Printing All Request Details if test fails")
	@Test
	void PrintAllIfFails() {
		
		System.out.println("-------Printing All Request Details if test fails-------");
		StudentPOJO newStudent = new StudentPOJO();

		Faker faker = new Faker();

		List<String> courses = new ArrayList<String>();
		courses.add("Refrigiration and Air Conditioning");
		courses.add("Welding Foundation");

		newStudent.setFirstName(faker.name().firstName());
		newStudent.setLastName(faker.name().lastName());
		newStudent.setEmail("tincidunt.dui@ultricessit.co.uk");
		newStudent.setProgramme("Mechanical");
		newStudent.setCourses(courses);
		
		given()
		   .when()
		   .contentType(ContentType.JSON)
		   .log()
		   .ifValidationFails()
		   .when()
		   .body(newStudent)
		   .post()
		   .then()
		   .statusCode(201);
	}
}
