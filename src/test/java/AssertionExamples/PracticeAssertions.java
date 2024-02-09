package AssertionExamples;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import com.studentapp.tests.TestBase;

public class PracticeAssertions extends TestBase {
	@Test
	void Assertion01() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0].id", equalTo(1));
	}
	
	@Test
	void Assertion02() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0].firstName", equalTo("Vernon"));
	}
	
	@Test
	void Assertion03() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0].courses", hasItem("Accounting"));
	}
	
	@Test
	void Assertion04() {
		given()
		.when()
		.get("/list")
		.then()
		.body("firstName", hasItem("Vernon"));
	}
	
	@Test
	void Assertion05() {
		given()
		.when()
		.get("/list")
		.then()
		.body("id", hasItem(5));
	}
	
	@Test
	void Assertion06() {
		given()
		.when()
		.get("/list")
		.then()
		.body("id", hasItems(5,10,15));
	}
	
	@Test
	void Assertion07() {
		given()
		.when()
		.get("/list")
		.then()
		.body("lastName", hasItems("Holmes","Jacob","Vernon"));
	}
	
	@Test
	void Assertion08() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0].courses", hasItem("Accounting"))
		.body("[0].courses", hasItem("Statistics"));
	}
	
	@Test
	void Assertion09() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0]", hasKey("programme"));
	}
	
	@Test
	void Assertion10() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0]", hasEntry("email", "egestas.rhoncus.Proin@massaQuisqueporttitor.org"));
	}
	
	@Test
	void Assertion11() {
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200)
		.body("[0].id", equalTo(1))
		.body("[0].firstName", equalTo("Vernon"))
		.body("[0].courses", hasItems("Accounting", "Statistics"))
		.body("[0]", hasEntry("email", "egestas.rhoncus.Proin@massaQuisqueporttitor.org"));
	}
	
	@Test
	void Assertion12() {
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200)
		.body("size()", equalTo(100))
		.body("size()", greaterThanOrEqualTo(50))
		.body("size()", lessThanOrEqualTo(150));
		
	}
}
