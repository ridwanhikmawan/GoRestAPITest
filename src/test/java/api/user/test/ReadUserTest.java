package api.user.test;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class ReadUserTest {

	@Test
	void testGettUser()
	{	
		given()
			.headers("Authorization","Bearer 96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38")
	
		.when()
			.get("https://gorest.co.in/public/v2/users/6929206")
			
		
		.then()
			.statusCode(200)
			.body("name",equalTo("iwaanaja"))
			.body("email",equalTo("iwaanaja@gmail.com"))
			.log().all();
	}
	
}
