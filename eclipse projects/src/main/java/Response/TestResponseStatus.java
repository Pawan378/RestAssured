package Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestResponseStatus {
	
	@Test
	public void user()
	{
		Response response;
		
		response = RestAssured.get("http://10.82.48.225:8081/EDUBank/ExchangeRate?currency=dollar");
		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code :" +statusCode);
		
		String statusLine = response.getStatusLine();
		System.out.println("Status Line :"+statusLine);
	}
	
	

}
