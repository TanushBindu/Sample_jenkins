package Generic_classes;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Response_and_Request_spec_builder 
{
	public static RequestSpecification Request_spec()
	{
		RequestSpecBuilder req = new RequestSpecBuilder();
		RequestSpecification req1 = req.setBaseUri("https://covidtracking.com/").setContentType(ContentType.JSON).build();
		return req1;
	}
	
	public static ResponseSpecification Response_spec()
	{
		ResponseSpecBuilder res = new ResponseSpecBuilder();
		ResponseSpecification res1 = res.expectContentType(ContentType.JSON).build();
		return res1;
	}
}
