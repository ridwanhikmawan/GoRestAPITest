package api.post.test;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;

public class CreatePostTest {

	@Test
	void testPostPost()
	{
		HashMap data=new HashMap();
		
		data.put("title","Hello World!!!");
		data.put("body", "This is my api testing project");
		
		given()
			.headers("Authorization","Bearer 96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38")
			.contentType("application/json")
			.body(data)
		
	
		.when()
			.post("https://gorest.co.in/public/v2/users/6928676/posts")
			
		
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
