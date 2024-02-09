package Test;
import com.studentapp.tests.TestBase;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
public class testc extends TestBase {
	@Test
	void Test() {
		RestAssured
		.given()
		.when()
		.get("/1")
		.then()
		.statusCode(200);
	}
}