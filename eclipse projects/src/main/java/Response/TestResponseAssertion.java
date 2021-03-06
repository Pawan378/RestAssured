package Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import cucumber.api.PendingException;
import io.retsassured.RestAssured;
import io.restassured.response.Response;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResponeAssertions {
	
	@Given("^Customer has API for foreign exchange rates$")
	public void customer_has_API_for_foreign_exchange_rates() throws Throwable {
		
		Response response;
		
		@Test
		@Given("^Customer has API for foreign exchange rates$")
		public void customer_has_API_for_foreign_exchange_rates() throws Throwable {
			
				RestAssured.baseURI("https://https://api.ratesapi.io/api/latest");
		    
		  
		}

		@Test
		@When("^posted with correct information$")
		public void posted_with_correct_information() throws Throwable {
			
			response = RestAssured.get("/api/latest");
		    // Write code here that turns the phrase above into concrete actions
		    
		}

	@Test
	@Then("^validate response code received$")
	public void validate_response_code_received() throws Throwable {
		
		int statusCode = response.getStatuscode();
		Assert.assertEquals(statusCode,200,"Incorrect status code returned");
	    // Write code here that turns the phrase above into concrete actions
		String contentType = response.getContentType();
		Assert.assertTrue(contentType,"application/json");
	}

}
