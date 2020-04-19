package com.qa.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestTC001 {
	@Test
	void getRequest()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification request = RestAssured.given();
		Response response = request.request(Method.GET,"/Hyderabad");
	    String body=	response.getBody().asString();
	    System.out.print("the body is::"+body);
	    
	    Headers allheader= response.headers();
	
	for(Header head: allheader)
	{
		System.out.println(head.getName()+"  "+head.getValue());
	}
		
	}
	
	

}
