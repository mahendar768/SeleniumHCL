package apii.practicse;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;


public class Api_Trail1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}


@Test
public static void Create_api() {
	
	try {
		//RestAssured.baseURI="";
		
		Response res = given().log().all().delete();
		long responsetime = res.getTimeIn(TimeUnit.SECONDS);
		
		System.out.println("responsetime"+responsetime);
		
		
		System.out.println("============result==========");
		int st = res.getStatusCode();
		System.out.println(st);
		
		String resString = res.asString();
		
		
		System.out.println("response=="+resString);
		
		
		
		if(st==HttpStatus.SC_CREATED)
		{
			
			JsonPath js = new JsonPath(resString);
			
			
			if(resString.contains("createdAt"))
			{
				System.out.println("sucess");
			String s =	js.getString("id");
			System.out.println("Totla pages"+s);
			}
			
		}
		else
		{
			System.out.println("failed");
		}
		
	}
	catch(Exception e){
		
	}
}
}

