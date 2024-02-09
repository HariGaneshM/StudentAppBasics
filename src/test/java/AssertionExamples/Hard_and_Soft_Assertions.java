package AssertionExamples;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

import com.studentapp.tests.TestBase;

public class Hard_and_Soft_Assertions extends TestBase{
	@Test
	void HardAssertion() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[0].firstName", equalTo("Vernone"))
		.body("[0].lastName", equalTo("Harperr"))
		.body("[0].email", equalTo("egestas.rhoncus.Proin@massaQuisqueporttitor.org"))
		.body("[0].courses", hasItems("Accounting", "Statistics"));
	}
	
	@Test
	void SoftAssertion() {
		given()
		.when()
		.get("/list")
		.then()
		.body("[1].firstName", equalTo("Vernone"),
				"[1].lastName", equalTo("Holmes"),
				"[1].email", equalTo("egestas.rhoncus.Proin@massaQuisqueporttitor.org"),
				"[1].courses", hasItems("Accounting", "Statistics"));
	}
}
