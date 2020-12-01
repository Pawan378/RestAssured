package parameterization;

import java.io.FileInputStream;
import java.io.IOException;


import org.junit.Test;

import Response.RequestSpecBuilder;
import Response.ResponseSpecBuilder;
import StepDefinitions.Given;
import StepDefinitions.Response;
import StepDefinitions.Then;
import StepDefinitions.When;
import cucumber.api.PendingException;

public class TestParameterizationDemo {
	
	
	Response response;
	
	@Given("^Customer has API for foreign exchange rates$")
	public void customer_has_API_for_foreign_exchange_rates() throws Throwable {
		
		
		
		RestAssured.baseURI("https://https://api.ratesapi.io/api/latest");
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^posted with correct information$")
	public void posted_with_correct_information() throws Throwable {
		
		response = RestAssured.get("/api/latest");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Test
	public void user() throws IOException
	{
		String path = "E://get.xlsx";
	
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i = 1; i <= rowcount; i++)
		{
			String id = sheet.getRow(i).getCell(0).getStringCellValue();
			
			response = RestAssured.get("https://https://api.ratesapi.io/api/latest");
			
			String responseBody  = response.getBody().asString();
		}
		
		
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

}
