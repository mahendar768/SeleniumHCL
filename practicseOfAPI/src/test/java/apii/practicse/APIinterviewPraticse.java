package apii.practicse;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;


public class APIinterviewPraticse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void createio()
	{
		try {
			//RestAssured.baseURI="";
			
			Response res = given().log().all().accept(ContentType.TEXT).and().body("").post().andReturn();
			
//			Response res = given().log().all().accept(ContentType.TEXT).and().
//					body("{\"page\":2,\"per_page\":6,\"total\":12,\"total_pages\":2,\"data\":[{\"id\":7,\"email\":\"michael.lawson@reqres.in\",\"first_name\":\"Michael\",\"last_name\":\"Lawson\",\"avatar\":\"https://reqres.in/img/faces/7-image.jpg\"},{\"id\":8,\"email\":\"lindsay.ferguson@reqres.in\",\"first_name\":\"Lindsay\",\"last_name\":\"Ferguson\",\"avatar\":\"https://reqres.in/img/faces/8-image.jpg\"},{\"id\":9,\"email\":\"tobias.funke@reqres.in\",\"first_name\":\"Tobias\",\"last_name\":\"Funke\",\"avatar\":\"https://reqres.in/img/faces/9-image.jpg\"},{\"id\":10,\"email\":\"byron.fields@reqres.in\",\"first_name\":\"Byron\",\"last_name\":\"Fields\",\"avatar\":\"https://reqres.in/img/faces/10-image.jpg\"},{\"id\":11,\"email\":\"george.edwards@reqres.in\",\"first_name\":\"George\",\"last_name\":\"Edwards\",\"avatar\":\"https://reqres.in/img/faces/11-image.jpg\"},{\"id\":12,\"email\":\"rachel.howell@reqres.in\",\"first_name\":\"Rachel\",\"last_name\":\"Howell\",\"avatar\":\"https://reqres.in/img/faces/12-image.jpg\"}],\"support\":{\"url\":\"https://reqres.in/#support-heading\",\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}").
//					post("https://reqres.in/api/users?page=2").andReturn();
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

