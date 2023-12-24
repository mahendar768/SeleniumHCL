package apii.practicse;

import org.testng.annotations.Test;


import io.restassured.response.Response;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;


import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;


/*imp Note: chaining(passing output of one method to other) of API is important(need to pratice)*/

public class Api_trail {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	
	
	
	
	

	
	
//	void PostApi()
//	{
//		Response res = given().log().all().accept(ContentType.TEXT).when().and().body("{\r\n" + 
//				"    \"name\": \"morpheus\",\r\n" + 
//				"    \"job\": \"zion resident\",\r\n" + 
//				"    \"updatedAt\": \"2022-12-23T10:20:31.809Z\"\r\n" + 
//				"} ").put("https://reqres.in/api/users/2").andReturn().thenReturn();
//		
//		long resptime = res.getTimeIn(TimeUnit.SECONDS);
//		System.out.println("time"+resptime);
//		
//		String response = res.asString();
//		System.out.println("res"+response);
//		
//		int code = res.getStatusCode();
//		System.out.println("code"+code);
//		
//		if( code==HttpStatus.SC_OK)
//		{
//			System.out.println("pass");
//		}
//		JsonPath js = new JsonPath(response);
//		
//		String id = js.getString("id");
//		System.out.println(id);
//		
//	}
//	
	
	
	
//	void kjl() {
//	Response dfdf = given().log().all().when().delete("https://reqres.in/api/users/2").thenReturn().andReturn();	
//		String sdd = dfdf.asString();
//		int lj= dfdf.getStatusCode();
//		System.out.println("response=="+lj+"=="+sdd);
//		
//
//		if (lj==HttpStatus.SC_NO_CONTENT)
//		{
//			if(sdd.contains("updatedAt")) {
//				System.out.println("pass");
//				
//				JsonPath ou = new JsonPath(sdd);
//				String oud = ou.getString("id");
//				System.out.println(oud);
//			}
//			else 
//			{
//				System.out.println("fail");
//			}
//		}
//		
//		
//		
//		
//	}
//	public static void cre() {
//		Response as  = given().log().all().accept(ContentType.TEXT).and().
//				body("{\\\"page\\\":2,\\\"per_page\\\":6,\\\"total\\\":12,\\\"total_pages\\\":2,\\\"data\\\":[{\\\"id\\\":7,\\\"email\\\":\\\"michael.lawson@reqres.in\\\",\\\"first_name\\\":\\\"Michael\\\",\\\"last_name\\\":\\\"Lawson\\\",\\\"avatar\\\":\\\"https://reqres.in/img/faces/7-image.jpg\\\"},{\\\"id\\\":8,\\\"email\\\":\\\"lindsay.ferguson@reqres.in\\\",\\\"first_name\\\":\\\"Lindsay\\\",\\\"last_name\\\":\\\"Ferguson\\\",\\\"avatar\\\":\\\"https://reqres.in/img/faces/8-image.jpg\\\"},{\\\"id\\\":9,\\\"email\\\":\\\"tobias.funke@reqres.in\\\",\\\"first_name\\\":\\\"Tobias\\\",\\\"last_name\\\":\\\"Funke\\\",\\\"avatar\\\":\\\"https://reqres.in/img/faces/9-image.jpg\\\"},{\\\"id\\\":10,\\\"email\\\":\\\"byron.fields@reqres.in\\\",\\\"first_name\\\":\\\"Byron\\\",\\\"last_name\\\":\\\"Fields\\\",\\\"avatar\\\":\\\"https://reqres.in/img/faces/10-image.jpg\\\"},{\\\"id\\\":11,\\\"email\\\":\\\"george.edwards@reqres.in\\\",\\\"first_name\\\":\\\"George\\\",\\\"last_name\\\":\\\"Edwards\\\",\\\"avatar\\\":\\\"https://reqres.in/img/faces/11-image.jpg\\\"},{\\\"id\\\":12,\\\"email\\\":\\\"rachel.howell@reqres.in\\\",\\\"first_name\\\":\\\"Rachel\\\",\\\"last_name\\\":\\\"Howell\\\",\\\"avatar\\\":\\\"https://reqres.in/img/faces/12-image.jpg\\\"}],\\\"support\\\":{\\\"url\\\":\\\"https://reqres.in/#support-heading\\\",\\\"text\\\":\\\"To keep ReqRes free, contributions towards server costs are appreciated!\\\"}}").
// post("https://reqres.in/api/users?page=2").andReturn();
//			
//		Response kl = given().get("https://reqres.in/api/users?page=2").andReturn();
//		int kld = kl.getStatusCode();
//		
//		String ljl = kl.asString();
//		System.out.println(ljl);
//		System.out.println(kld);
//	
//	long asdwe = as.getTimeIn(TimeUnit.SECONDS);
//	System.out.println("responsetime"+asdwe);
//	
//	int  sd = as.getStatusCode();
//	System.out.println("statuccode"+sd);
//	
//	String sfd = as.asString();
//	System.out.println(sfd);
//
//	
//	if(sd==HttpStatus.SC_CREATED)
//	{
//		
//		JsonPath jd = new JsonPath(sfd);
//		if(sfd.contains("CreatedAt"))
//		{
//			System.out.println("passed");
//			String jl = jd.getString("id");
//			System.out.println(jl);
//		}
//		
//	}
//	else
//	{
//		System.out.println("failed");
//	}
//	}
	
public static void Create_api() {
	
	try {
		//RestAssured.baseURI="";
		
		Response res = given().log().all().accept(ContentType.TEXT).and().
				body("{\"page\":2,\"per_page\":6,\"total\":12,\"total_pages\":2,\"data\":[{\"id\":7,\"email\":\"michael.lawson@reqres.in\",\"first_name\":\"Michael\",\"last_name\":\"Lawson\",\"avatar\":\"https://reqres.in/img/faces/7-image.jpg\"},{\"id\":8,\"email\":\"lindsay.ferguson@reqres.in\",\"first_name\":\"Lindsay\",\"last_name\":\"Ferguson\",\"avatar\":\"https://reqres.in/img/faces/8-image.jpg\"},{\"id\":9,\"email\":\"tobias.funke@reqres.in\",\"first_name\":\"Tobias\",\"last_name\":\"Funke\",\"avatar\":\"https://reqres.in/img/faces/9-image.jpg\"},{\"id\":10,\"email\":\"byron.fields@reqres.in\",\"first_name\":\"Byron\",\"last_name\":\"Fields\",\"avatar\":\"https://reqres.in/img/faces/10-image.jpg\"},{\"id\":11,\"email\":\"george.edwards@reqres.in\",\"first_name\":\"George\",\"last_name\":\"Edwards\",\"avatar\":\"https://reqres.in/img/faces/11-image.jpg\"},{\"id\":12,\"email\":\"rachel.howell@reqres.in\",\"first_name\":\"Rachel\",\"last_name\":\"Howell\",\"avatar\":\"https://reqres.in/img/faces/12-image.jpg\"}],\"support\":{\"url\":\"https://reqres.in/#support-heading\",\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}").
				post("https://reqres.in/api/users?page=2").andReturn();
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
			System.out.println("id"+s);
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


