package com.studentapp.tests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;
import com.studentapp.pojo.StudentPOJO;

import io.restassured.http.ContentType;

public class CreateStudentPOJO extends TestBase {
	
	@DisplayName("Create New Student with POJO")
	@Test
	void createStudents() {
		
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
		   .statusCode(201);
	}
}
