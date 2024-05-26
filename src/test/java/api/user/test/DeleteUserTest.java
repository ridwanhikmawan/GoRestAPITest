package api.user.test;

import static io.restassured.RestAssured.* ;
import org.testng.annotations.Test;

public class DeleteUserTest {

	@Test
	void testDeletetUser()
	{	
		given()
			.headers("Authorization","Bearer 96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38")
	
		.when()
			.delete("https://gorest.co.in/public/v2/users/6928185")
			
		
		.then()
			.statusCode(204)
			.log().all();
	}
	
}
