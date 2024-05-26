package api.comment.test;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import org.testng.annotations.Test;

public class CreateCommentTest {

	@Test
	void testPostComment()
	{
		HashMap data=new HashMap();
		
		data.put("name","iwanaja");
		data.put("email", "iwanaja@gmail.com");
		data.put("body","Good Job!!!");
		
		given()
			.headers("Authorization","Bearer 96db739c30172cad3a4ddf1f4fb4043c8c98767ebfbdd97d94d8c7c29fa75e38")
			.contentType("application/json")
			.body(data)
		
	
		.when()
			.post("https://gorest.co.in/public/v2/posts/127006/comments")
			
		
		.then()
			.statusCode(201)
			.log().all();
	}
	
}
