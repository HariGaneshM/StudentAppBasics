package com.studentapp.tests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;
import com.studentapp.pojo.StudentPOJO;

import io.restassured.http.ContentType;

public class UpdateStudentPOJO extends TestBase {
	
	@DisplayName("update New Student with POJO")
	@Test
	void updateStudents() {
		
		StudentPOJO updateStudent = new StudentPOJO();
		
		Faker faker = new Faker();
		
		List<String> courses = new ArrayList<String>();
		courses.add("Refrigiration and Air Conditioning");
		courses.add("Welding Foundation");
		
		updateStudent.setFirstName(faker.name().firstName());
		updateStudent.setLastName(faker.name().lastName());
		updateStudent.setEmail(faker.internet().emailAddress());
		updateStudent.setProgramme("Mechanical");
		updateStudent.setCourses(courses);
		
		given()
		   .when()
		   .contentType(ContentType.JSON)
		   .when()
		   .body(updateStudent)
		   .put("/1")
		   .then()
		   .statusCode(200);
	}
}
