package com.studentapp.tests;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public class TestBase {
	
	@BeforeAll
	public static void Base() {
		
		baseURI = "http://localhost";
		port = 8080;
		basePath = "/student";
	}

}
