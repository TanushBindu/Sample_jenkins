package Step_definition;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import Generic_classes.Response_and_Request_spec_builder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Step1 
{
	private RequestSpecification req;
	private Response res;

	@Given("user enters the url")
	public void user_enters_the_url() 
	{
		req = given().spec(Response_and_Request_spec_builder.Request_spec());
	}

	@When("user enter the endpoint")
	public void user_enter_the_endpoint() 
	{
		res = req.when().get("api/v1/states/info.json").then().spec(Response_and_Request_spec_builder.Response_spec()).extract().response();
	}
	
	@Then("The status code should be {int}")
	public void the_status_code_should_be(Integer int1) 
	{
		int a = int1;
		assertEquals(res.getStatusCode(),a);
		System.out.println(res.getStatusCode());
	}

}
