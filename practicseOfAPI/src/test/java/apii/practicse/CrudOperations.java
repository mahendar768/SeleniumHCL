package apii.practicse;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CrudOperations {

	
	
	@Test(priority=1)	
	public static void Post_api() {
		
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

	@Test(priority=2)
public void GetApi()
{
	Response res = given().log().all().when().accept(ContentType.TEXT).get("https://reqres.in/api/users/2").andReturn().thenReturn();
	 String resp = res.asString();
	 System.out.println("response==>"+resp);
	 
	 long time = res.getTimeIn(TimeUnit.SECONDS);
	 System.out.println("time==>"+time);
	 
	 int code = res.statusCode();
	 System.out.println("code==>"+code);
	 
	 
	if( code==HttpStatus.SC_OK)
	{
		System.out.println("GetApi Passed");
	}
	 
	JsonPath js = new  JsonPath(resp);
	
	String info = js.getString("data");
	System.out.println("info in response==>"+info);
	 
	 
	 
	
}

@Test(priority=3)
public void PutApi(){
	
	Response resput = given().log().all().when().accept(ContentType.TEXT).body("{\r\n" + 
			"    \"name\": \"morpheus\",\r\n" + 
			"    \"job\": \"zion resident\",\r\n" + 
			"    \"updatedAt\": \"2022-12-24T09:10:07.049Z\"\r\n" + 
			"}").put("https://reqres.in/api/users/2").andReturn().thenReturn();
	
	String strres = resput.asString();
	System.out.println("response==>"+strres);
	
	long time = resput.timeIn(TimeUnit.SECONDS);
	System.out.println("time==>"+time);
	
	int code = resput.statusCode();
	System.out.println("code==>"+code);
	
	if(code==HttpStatus.SC_OK)
	{
		System.out.println("PutApi Passed");
	}
	
	JsonPath js = new  JsonPath(strres);
	
	String info = js.getString("updatedAt");
	System.out.println("info in response==>"+info);
	 
	
}

@Test(priority=4)
public void DelApi(){
	Response delres = given().log().all().when().delete("https://reqres.in/api/users/2").andReturn().thenReturn();
	
	long time = delres.timeIn(TimeUnit.SECONDS);
	System.out.println("time==>"+time);
	
	int code = delres.statusCode();
	System.out.println("code==>"+code);
	
	if(code ==HttpStatus.SC_NO_CONTENT)
	{
		
		System.out.println("DelApi Passed");
	}
	

}

public static void main(String[] args) {
	// TODO Auto-generated method stub

}
}
