package com.studentapp.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class DeleteStudent extends TestBase {
	
	@DisplayName("delete existing Student")
	@Test
	void deleteStudent() {
		
		given()
		   .when()
		   .delete("/1")
		   .then()
		   .statusCode(204);
		
	}
}
