package APIDemo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;   

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given all input details
		//When Submit api
		//Then validate the responce
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type" , "application/json")
		.body("{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Ap2p 12Srinivas New Updated\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://rahulshettyacademy.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "")
		.when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
		
	}

}
