package AssertionExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.studentapp.tests.TestBase;

import io.restassured.RestAssured;

public class SkyScreamer_JSONassert extends TestBase{
	@Test
	void assertCompleteResponse() throws IOException, JSONException {
		String ExpectedResponse = new String(Files.readAllBytes(Paths.get("Expected2.txt")));
		String ActualResponse = RestAssured.given().when().get("/list").asString();
		JSONAssert.assertEquals(ExpectedResponse, ActualResponse, JSONCompareMode.LENIENT);
	}
	
	@Test
	void StrictAssertCompleteResponse() throws IOException, JSONException {
		String ExpectedResponse = new String(Files.readAllBytes(Paths.get("Expected2.txt")));
		String ActualResponse = RestAssured.given().when().get("/list").asString();
		JSONAssert.assertEquals(ExpectedResponse, ActualResponse, JSONCompareMode.STRICT);
	}
}
