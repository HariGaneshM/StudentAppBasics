package JaywayJsonPath;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.studentapp.tests.TestBase;

public class JaywayExamples extends TestBase {
	static String Response = given().when().get("/list").asString();
	
	@DisplayName("Getting Root Element ($)")
	@Test
	public void getRootElement() {
		List<Map<String,?>> rootElement = JsonPath.read(Response, "$");
		System.out.println("Getting Root Element ($)");
		System.out.println(rootElement);
	}
	
	@DisplayName("Getting Student by Id")
	@Test
	public void getStudent() {
		Map<String,?> student = JsonPath.read(Response,"$[0]");
		System.out.println("Getting Student by Id");
		System.out.println(student);
	}
	
	@DisplayName("Getting Student Name by Id")
	@Test
	public void getStudentName() {
		String studentName = JsonPath.read(Response,"[0].firstName");
		System.out.println("Getting Student Name by Id");
		System.out.println(studentName);
	}
	
	@DisplayName("Getting Student Coursers by Id")
	@Test
	public void getStudentCourses() {
		List<String> courses = JsonPath.read(Response,"$[0].courses");
		System.out.println("Getting Student Coursers by Id");
		System.out.println(courses);
	}
}