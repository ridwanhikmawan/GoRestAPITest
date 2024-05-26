package api.post.test;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class AuthenticationsPostTest {

	@Test
	void testBearerTokenAuthenticationPost ()
	{
		String bearerToken="96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38";
		
		given()
			.headers("Authorization","Bearer "+bearerToken)
			
		
		.when()
			.get("https://gorest.co.in/public/v2/posts")
			
		
		.then()
			.statusCode(200)
			.log().all();
	}
	
}
