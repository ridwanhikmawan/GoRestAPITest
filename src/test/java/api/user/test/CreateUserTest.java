package api.user.test;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;

public class CreateUserTest {

	@Test
	void testPostUser()
	{
		HashMap data=new HashMap();
		
		data.put("name","Ridwaaan");
		data.put("email", "ridwaaan@gmail.com");
		data.put("gender", "male");
		data.put("status", "active");
		
		given()
			.headers("Authorization","Bearer 96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38")
			.contentType("application/json")
			.body(data)
		
	
		.when()
			.post("https://gorest.co.in/public/v2/users")
			
		
		.then()
			.statusCode(201)
			.body("name",equalTo("Ridwaaan"))
			.body("email",equalTo("ridwaaan@gmail.com"))
			.body("gender",equalTo("male"))
			.body("status",equalTo("active"))
			
			.log().all();
	}
	
}
