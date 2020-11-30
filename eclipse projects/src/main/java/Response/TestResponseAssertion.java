package Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.retsassured.RestAssured;
import io.restassured.response.Response;

public class TestResponseAssertion {
	
	@Test
	public void user()
	{
		Response response;
		
		response = RestAssured.get("http://10.82.48.225:8081/EDUBank/ExchangeRate?currency=dollar&value = 50");
		
		int statusCode = response.getStatuscode();
		Assert.assertEquals(statusCode,200,"Incorrect status code returned");
		
		String statusLine = response.getStatusLine();
		Assert.assertEquals(statusLine,"http://1.1 200","Incorrect status line returned");
		
		String contentType = response.getContentType();
		Assert.assertEquals(contentType,"application/json");
		
		String responseBody = response.getBody().asString();
		Assert.assertEquals(responseBody.contains("dollar"),true,"Response body does not contain dollar");
		
		
	}

}
