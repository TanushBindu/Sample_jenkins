package Step_definition;

import Generic_classes.Response_and_Request_spec_builder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ABC 
{
	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://covidtracking.com/";
		RequestSpecification req = RestAssured.given();
		Response res = req.get("api/v1/states/info.json");
		System.out.println(res.asString());
	}
}
