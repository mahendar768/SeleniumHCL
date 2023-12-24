package apii.practicse;

import org.apache.commons.mail.EmailException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.github.fge.jsonschema.main.JsonValidator;
import com.github.javafaker.Faker;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import apii.practicse.ExcelUtils;


public class GoRestApi extends CommonUtils  {
	
	
	
	
	static int  id =0;
	static String name =null;
	static String jsbody = "https://gorest.co.in/public/v2/users";
	static String url = "{\"name\": \"dhoni\",\r\n" + 
			"    \"email\": \"mahi009808@gmail.com\",\r\n" + 
			"    \"gender\": \"male\",\r\n" + 
			"    \"status\": \"active\"}";
	static String newstring = url.replace("mahi009808@gmail.com", RandomEmail());
	static String updatestring = url.replace("mahi009808@gmail.com", RandomEmail2());
	
	
	
	
	
	
	
	@BeforeSuite
	public void beforestart()
	{
	CommonUtils.DeleteOldReports();
	
	}
	
	
	
	
	
	
	//@Test(priority=1)
	public static void createapi() throws IOException
	{
		
		
		String token = "fe332fdb31251e7bb01212e0faf6c8ff5f4f245b41edf4ef7a85f84ebc8b7a23";
	
		System.out.println(RandomEmail());	
		Response resa = given().log().all().header("Authorization","Bearer "+token).contentType(ContentType.JSON).body(newstring).when().post(jsbody).thenReturn().andReturn();
		//
		String response = resa.asString();
		System.out.println(response);
		JsonPath js = new JsonPath(response);
		
		 id = js.get("id");
		 System.out.println("id value"+id);
		
		
		
	}
	
	
	//@Test(priority =2)
	public static void getapi()
	{
		String token = "fe332fdb31251e7bb01212e0faf6c8ff5f4f245b41edf4ef7a85f84ebc8b7a23";
	//id":641621,648554
		
		Response resa = given().log().all().header("Authorization","Bearer "+token).when()
				.get(jsbody+"/"+id).thenReturn().andReturn();
		
		String response = resa.asString();
		System.out.println(response);
		
		
	}
	
	//@Test(priority=3)
	public static void updateapi()
	{
		String token = "fe332fdb31251e7bb01212e0faf6c8ff5f4f245b41edf4ef7a85f84ebc8b7a23";
	//id":641621,648554
		
		Response resa = given().log().all().header("Authorization","Bearer "+token).contentType(ContentType.JSON).body(updatestring).when().put(jsbody+"/"+id).thenReturn().andReturn();
		//
		String response = resa.asString();
		System.out.println(response);
		
		
		
	}
	
	
	
	@Test  //(with excel reading working successfully)
	public static void createapi2() throws IOException, FilloException
	{
		Response resa;
		FilloSucces  fil = new FilloSucces ();
		
			Map<String,String> ol;
		
		ol=fil.Fetchfillo();
		System.out.println(ol.get("pond"));
		//System.out.println(ol.get("JSON"));
		
		
		String token = "fe332fdb31251e7bb01212e0faf6c8ff5f4f245b41edf4ef7a85f84ebc8b7a23";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("F:\\SOFTWARES1\\Framwork Details\\excel2.xlsx");
			Recordset recordset = connection.executeQuery("Select * From Sheet1");
		//	System.out.println(recordset.getCount());
			while (recordset.next()) {
				//System.out.println(recordset.getField("Name") ); 
		System.out.println(RandomEmail());	
		Response res = given().log().all().header("Authorization","Bearer "+token).contentType(ContentType.JSON).body(newstring).when().post(ol.get("URL")).thenReturn().andReturn();
		//
		String response = res.asString();
		System.out.println("er"+response);
		
		

		JsonPath js = new JsonPath(response);
		
		
		
//			
//		 id = js.get("id");  
//		 System.out.println("id value"+id);
//		 
//		 name = js.get("name");
		 
		 XSSFWorkbook workbook = new XSSFWorkbook(); 
	        
	        //Create a blank sheet
	        XSSFSheet sheet = workbook.createSheet("Employee Data");
	        
	        Map<String, Object[]> data = new TreeMap<String, Object[]>();
	        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
	        data.put("2", new Object[] {id, name, "Shukla"});
	        data.put("3", new Object[] {2, "Lokesh", "AddImage()"});
//	        data.put("4", new Object[] {3, "John", "Adwards"});
//	        data.put("5", new Object[] {4, "Brian", "Schultz"});
//	          
	        //Iterate over data and write to sheet
	        Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset)
	        {
	            Row row = sheet.createRow(rownum++);
	            Object [] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr)
	            {
	               Cell cell = row.createCell(cellnum++);
	               if(obj instanceof String)
	                    cell.setCellValue((String)obj);
	                else if(obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }
	        try
	        {
	            //Write the workbook in file system
	            FileOutputStream out = new FileOutputStream(new File("F:\\SOFTWARES1\\writingtoexcel.xlsx"));
	            workbook.write(out);
	            out.close();
	           CommonUtils.FolderToZipFolder();
	            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
		 
	       
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			}
			recordset.close();
			connection.close();
			

			
	///===
				
			
			
			
			
			
		
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// @Test //(working successfully code) using map
     public void sd () throws FilloException, EmailException
     {
     	ExcelUtils sd = new ExcelUtils();
 		Map<String,String > prod = sd.Readfillo("Sheet1");
 		System.out.println(prod);
 		CommonUtils cu = new CommonUtils();
 		cu.SendMail();
 		
     }
     
     
     // @Test
     public void JsonSchemaValidator()
     {
    	 given().
    	 when().
    	 get("https://gorest.co.in/public/v2/users").
    	 then().assertThat().body(io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath("schemavalidator.json"));
    	 
    	 
    	 
    	 
     }

     //@Test
     public void jsonarrayCheck()
     {
    	 Response chde = given().log().all().contentType(ContentType.JSON).body("{\r\n" + 
    	 		"  \"id\": 0,\r\n" + 
    	 		"  \"category\": {\r\n" + 
    	 		"    \"id\": 0,\r\n" + 
    	 		"    \"name\": \"string\"\r\n" + 
    	 		"  },\r\n" + 
    	 		"  \"name\": \"doggie\",\r\n" + 
    	 		"  \"photoUrls\": [\r\n" + 
    	 		"    \"string\"\r\n" + 
    	 		"  ],\r\n" + 
    	 		"  \"tags\": [\r\n" + 
    	 		"    {\r\n" + 
    	 		"      \"id\": 0,\r\n" + 
    	 		"      \"name\": \"string\"\r\n" + 
    	 		"    }\r\n" + 
    	 		"  ],\r\n" + 
    	 		"  \"status\": \"available\"\r\n" + 
    	 		"}").when().post("https://petstore.swagger.io/v2/pet").thenReturn().andReturn();
    	 
    	 String valche = chde.asString();
    	 System.out.println(valche);
    	 
    	 JSONObject js = new JSONObject(valche);
    	 for(int k=0;k<js.getJSONArray("tags").length();k++)
    	 {
    		 String joo = js.getJSONArray("tags").getJSONObject(k).get("name").toString();
    		 System.out.println("----"+joo);
    	 }
    	
     }
     @AfterSuite
 	public void AfterExcecution()
 	{
 	CommonUtils.SendMail();
 	
 	}
  
}
