package apii.practicse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloSucces {
	
	
	//(working correctly)
//	public Map<String,String> sd()
//	{
//		Map<String,String> ss = new HashMap<String,String>();
//		ss.put("99", "98");
//		ss.put("101","102");
//		return ss;
//		
//	}
	@Test//(working correctly)
	public void sdfd() throws FilloException, IOException
	{
		Map<String,String> ol;
		
		ol=Fetchfillo();
		
		
	System.out.println(ol.get("pond"));
	System.out.println(ol.get("hi"));
	System.out.println(ol.get("nahi"));
	}	
	
	
	
	
	
	//@Test//(working fine combination of fillo and apache poi)
	public Map<String, String>  Fetchfillo() throws FilloException, IOException {
		Map<String,String> ms = new  HashMap<String,String>();
		 int colval = 0;
		 int i=0;
		String query = "Select * From  Sheet1";// where TOKEN ='123'
		//String query2 = "Select * From "+SheetName+" where"+colval+ ""+i;
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("F:\\SOFTWARES1\\Framwork Details\\excel2.xlsx");
			
			Recordset recordset = connection.executeQuery(query);
			ArrayList<String> count = recordset.getFieldNames();
		  System.out.println("ccc"+count.size());
		
		
		
		String url;
		String json;
		String token;
			File src = new File("F:\\SOFTWARES1\\Framwork Details\\excel2.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new  XSSFWorkbook(fis);
			XSSFSheet sh  =  wb.getSheetAt(0);
			
			int rowcount = sh.getLastRowNum();
			int colcount = sh.getRow(1).getLastCellNum();
			
			
			for(int k=0;k<rowcount;k++)
			{
				for(int j=0;j<colcount;j++)
				{
//				XSSFRow Row = sh.getRow(i);
//					String rowval = Row.toString();
					
					 
					 url = sh.getRow(1).getCell(0).toString();
					 json = sh.getRow(1).getCell(1).toString();
					 token= sh.getRow(1).getCell(2).toString();
					//System.out.println(url);
					
					  while(recordset.next()) {
							
							
							ms.put(recordset.getField(sh.getRow(j).getCell(k).toString()), recordset.getField(sh.getRow(0).getCell(1).toString()));//sh.getRow(k).getCell(k).toString()
						
					  }
					
					//	System.out.println(ms);
						
					
						  break;
					
					
					
					
					
					//String value= sh.getRow(1).getCell(j).toString();
					
					
			}
			
		}
		
		
		
		
		
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	return ms;
	}
	
//	@Test(working correctly)
	public   void readandwriteExcel2() throws IOException {
		
		String url;
		String json;
		String token;
			File src = new File("F:\\SOFTWARES1\\Framwork Details\\excel2.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new  XSSFWorkbook(fis);
			XSSFSheet sh  =  wb.getSheetAt(0);
			
			int rowcount = sh.getLastRowNum();
			int colcount = sh.getRow(1).getLastCellNum();
			
			
			for(int i=0;i<rowcount;i++)
			{
				for(int j=0;j<colcount;j++)
				{
//				XSSFRow Row = sh.getRow(i);
//					String rowval = Row.toString();
					 
					
					 url = sh.getRow(j).getCell(i).toString();
					 json = sh.getRow(j).getCell(i).toString();
					 token= sh.getRow(1).getCell(2).toString();
					System.out.println(url);
				//	System.out.println("-"+json);
					break;
					
					//String value= sh.getRow(1).getCell(j).toString();
					
					
			}
			
		}
//			return readandwriteExcel2() ;
//			
			
			
		}



}
