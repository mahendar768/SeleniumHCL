package apii.practicse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
public class  ExcelUtils  {
	static Workbook wb;
	static XSSFSheet sheet;
//	static String key="jhkjk";
	

	
	

	//@Test//(working successfully code)
		public static void WritingToExcel() {
			
			XSSFWorkbook workbook = new XSSFWorkbook(); 
	        
	        //Create a blank sheet
	        XSSFSheet sheet = workbook.createSheet("Employee Data");
	          
	        //This data needs to be written (Object[])
	        Map<String, Object[]> data = new TreeMap<String, Object[]>();
	        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
	        data.put("2", new Object[] {1, "Amit", "Shukla"});
	        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
	        data.put("4", new Object[] {3, "John", "Adwards"});
	        data.put("5", new Object[] {4, "Brian", "Schultz"});
	          
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
	            FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));
	            workbook.write(out);
	            out.close();
	            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }

	
	
	//@Test //(working successfully code)
	public void Fromfillos() throws FilloException {
		
		String query = "Select * From Maininput";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("F:\\SOFTWARES1\\excel1.xlsx");
			Recordset recordset = connection.executeQuery("Select * From Sheet1");
		//	System.out.println(recordset.getCount());
			while (recordset.next()) {
				System.out.println(recordset.getField("Name") ); 
			}
			recordset.close();
			connection.close();
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	//wroking(in progress)
	public  String Fetchfillo(String SheetName) throws FilloException {
		
		 Map<String,String> ms = new  HashMap<String,String>();
		 int colval = 0;
		 int i=0;
		String query = "Select * From "+SheetName+"";//" where\"+rowcount+\"
		//String query2 = "Select * From "+SheetName+" where"+colval+ ""+i;
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("F:\\SOFTWARES1\\excel2.xlsx");
			
			Recordset recordset = connection.executeQuery(query);
			ArrayList<String> count = recordset.getFieldNames();
		  System.out.println("ccc"+count.size());
		
		  while(recordset.next()) {
			
				
				ms.put(recordset.getField("URL"), recordset.getField("URL"));
			
		  }
			
			recordset.close();
			connection.close();
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Test //(working successfully code) using map
		public  Map<String,String> Readfillo(String SheetName) throws FilloException {
		Fetchfillo("Sheet1");
		 Map<String,String> ms = new  HashMap<String,String>();
		String query = "Select * From "+SheetName+" where Si_no=1";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("F:\\SOFTWARES1\\excel2.xlsx");
			Recordset recordset = connection.executeQuery("Select * From Sheet1");
		
			while (recordset.next()) {
				
				ms.put(recordset.getField("URL"), recordset.getField("URL"));
			}
			
			recordset.close();
			connection.close();
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ms;
	}

	//@Test//(working successfully code)
	public void setColourAndData() throws Exception{

		int row =5;
		int column =4;
		String status = "not executed";
//		
			File src=new File("F:\\SOFTWARES1\\Framwork Details\\tryzip\\toreadandwrite.xlsx");
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
						
		Sheet sh=wb.getSheet("sheet1");
		Row rownum1=sh.getRow(row);
		Cell cell=rownum1.getCell(column);
		cell.setCellValue(status);
		if(status.equalsIgnoreCase("pass")){
		//Create a cell style
		CellStyle style=wb.createCellStyle();
		//create a font
		Font font=wb.createFont();
		//apply color to the text
		font.setColor(IndexedColors.GREEN.getIndex());
		//apply bold to text
		font.setBold(true);
		style.setFont(font);
		rownum1.getCell(column).setCellStyle(style);
		}
		else if(status.equalsIgnoreCase("fail")){
		//Create a cell style
		CellStyle style=wb.createCellStyle();
		//create a font
		Font font=wb.createFont();
		//apply color to the text
		font.setColor(IndexedColors.RED.getIndex());
		//apply bold to text
		font.setBold(true);
		style.setFont(font);
		rownum1.getCell(column).setCellStyle(style);
		}
		else if(status.equalsIgnoreCase("not executed")){
		//Create a cell style
		CellStyle style=wb.createCellStyle();
		//create a font
		Font font=wb.createFont();
		//apply color to the text
		font.setColor(IndexedColors.BLUE.getIndex());
		//apply bold to text
		font.setBold(true);
		style.setFont(font);
		rownum1.getCell(column).setCellStyle(style);
		}
		FileOutputStream fos=new FileOutputStream("F:\\SOFTWARES1\\Framwork Details\\tryzip\\toreadandwrite.xlsx");
		wb.write(fos);
		fos.close();
		}
	
		



	
		
}


























