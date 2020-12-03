package Response;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ResponeLogging {
	
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

	@Then("^validate response code received$")
	public void validate_response_code_received() throws Throwable {
		
		int statusCode = response.getStatuscode();
		Assert.assertEquals(statusCode,200,"Incorrect status code returned");
	    // Write code here that turns the phrase above into concrete actions
		String contentType = response.getContentType();
		Assert.assertTrue(contentType,"application/json");
		
		RestAssured.requestSpecification = new RequestSpecBuilder().
		        setBaseUri("https://https://api.ratesapi.io/api/latest").
		        setContentType(ContentType.JSON).
		        build().
		        log().all();
		RestAssured.responseSpecification = new ResponseSpecBuilder().
		        build().
		        log().all();
		
		
		public void validate_response_code_received_incorrectUrl() throws Throwable
		{
			response = RestAssured.get("/api/lest");
			
			int statusCode = response.getStatuscode();
			Assert.assertEquals(statusCode,400,"Bad Request");
			
			RestAssured.requestSpecification = new RequestSpecBuilder().
			        setBaseUri("https://https://api.ratesapi.io/api/latest").
			        setContentType(ContentType.JSON).
			        build().
			        log().all();
			RestAssured.responseSpecification = new ResponseSpecBuilder().
			        build().
			        log().all();
			
		}
		
		
		public void validate_response_code_serverUnavailable() throws Throwable
		{
			response = RestAssured.get("/api/latest");
			response.invalidate();
			
			int statusCode = response.getStatuscode();
			Assert.assertEquals(statusCode,500,"Internal Server Error");
			
			RestAssured.requestSpecification = new RequestSpecBuilder().
			        setBaseUri("https://https://api.ratesapi.io/api/latest").
			        setContentType(ContentType.JSON).
			        build().
			        log().all();
			RestAssured.responseSpecification = new ResponseSpecBuilder().
			        build().
			        log().all();
			
		}
		
		
	

	

}
