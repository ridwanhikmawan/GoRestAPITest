package api.post.test;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class ReadPostTest {

	@Test
	void testGetPost()
	{	
		given()
			.headers("Authorization","Bearer 96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38")
	
		.when()
			.get("https://gorest.co.in/public/v2/users/6928676/posts")
			
		
		.then()
			.statusCode(200)
			.log().all();
	}
	
}
