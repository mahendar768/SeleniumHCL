package apii.practicse;

import java.awt.AWTException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.ImageUtils;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class CommonUtils {
	
	public static WebDriver driver;
	static Object dest;
	
	
	

	

	
	

	
	
	
	
	
	
	
	
	
	
	
@Test//working in progress
public void addimagetoexcel() throws Throwable
{

		Workbook workbook = new XSSFWorkbook();
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Avengers");
	
			InputStream inputStream1 = new FileInputStream(screenshot());
			InputStream inputStream2 = new FileInputStream("F:\\SOFTWARES1\\Framwork Details\\screenshots\\SCREESHOT"+".png");
			    
			byte[] inputImageBytes1 = IOUtils.toByteArray(inputStream1);
			byte[] inputImageBytes2 = IOUtils.toByteArray(inputStream2);
			int inputImagePictureID1 = workbook.addPicture(inputImageBytes1, Workbook.PICTURE_TYPE_PNG);
			int inputImagePictureID2 = workbook.addPicture(inputImageBytes2, Workbook.PICTURE_TYPE_PNG);
			XSSFDrawing drawing = (XSSFDrawing) sheet.createDrawingPatriarch();
			XSSFClientAnchor ironManAnchor = new XSSFClientAnchor();
			XSSFClientAnchor spiderManAnchor = new XSSFClientAnchor();
			ironManAnchor.setCol1(3); // Sets the column (0 based) of the first cell.
			ironManAnchor.setCol2(4); // Sets the column (0 based) of the Second cell.
			ironManAnchor.setRow1(3); // Sets the row (0 based) of the first cell.
			ironManAnchor.setRow2(4); // Sets the row (0 based) of the Second cell.
			spiderManAnchor.setCol1(4);
			spiderManAnchor.setCol2(5);
			spiderManAnchor.setRow1(4);
			spiderManAnchor.setRow2(5);
		drawing.createPicture(ironManAnchor, inputImagePictureID1);
		drawing.createPicture(spiderManAnchor, inputImagePictureID2);
			
			 Map<String, Object[]> data = new TreeMap<String, Object[]>();
		        data.put("1", new Object[] {"ID", "NAME", "LASTNAME",});
		        data.put("2", new Object[] {1, "Amit", "Shukla",});
		        data.put("3", new Object[] {2, "Lokesh", "Gupta",});
		        data.put("4", new Object[] {3, "John", "Adwards"});
		        data.put("5", new Object[] {4, "Brian","peter"	});
		          
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
		                else if(obj instanceof Object)
		                    cell.setCellValue("");
		                
		            }
		        }
			try (FileOutputStream saveExcel = new FileOutputStream("target/baeldung-apachepoi.xlsx")) {
			    workbook.write(saveExcel);
			   
			
			}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void  Initialization() throws IOException, AWTException
	{
		
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\com.idibi\\drivers\\chromedriver109.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
}


	public static File screenshot() throws Exception
	{
		Initialization();
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\SOFTWARES1\\Framwork Details\\screenshots\\SCREESHOT"+".png");
		FileHandler.copy(source, dest);
		return dest;
	}

	public static void DeleteOldReports()
	{
		 String filePath = "F:\\SOFTWARES1\\Framwork Details\\results\\results.zip";
	      //Creating the File object
	      File file = new File(filePath);
	      FileHandler.delete(file);
	      System.out.println("Old Files deleted");
	}
	public static void FolderToZipFolder()//need to folder also (currently only excel files)
	{
		try
		  {
		    File inFolder=new File("F:\\SOFTWARES1\\Framwork Details\\tryzip");
		    File outFolder=new File("F:\\SOFTWARES1\\Framwork Details\\results\\results.zip");
		 
		    ZipOutputStream out = new ZipOutputStream(new  BufferedOutputStream( new FileOutputStream(outFolder))); 
		                                                 
		   BufferedInputStream in = null;
		   byte[] data  = new byte[1000];
		   String files[] = inFolder.list();
		 
		  for (int i=0; i<files.length; i++)
		  {
		     in = new BufferedInputStream(new FileInputStream(inFolder.getPath() + "/" + files[i]), 1000);  
		                                             
		     out.putNextEntry(new ZipEntry(files[i])); 
		     int count;
		              while((count = in.read(data,0,1000)) != -1)
		               {
		                    out.write(data, 0, count);
		               }
		              out.closeEntry();
		  }
		 out.flush();
		 out.close();
		  }
		 catch(Exception e)
		 {
		  e.printStackTrace();
		  }

		
		
		
	}
	
	
	public static void SendMail() {
	// Create object of Property file
			Properties props = new Properties();

			// this will set host of server- you can change based on your requirement 
			props.put("mail.smtp.host", "smtp.gmail.com");

			// set the port of socket factory 
			props.put("mail.smtp.socketFactory.port", "587");

	
					
			// set socket factory
		//	props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

			// set the authentication to true
			props.put("mail.smtp.auth", "true");

			// set the port of SMTP server
			props.put("mail.smtp.port", "587");
			
			props.put("mail.smtp.starttls.enable","true");  

			// This will handle the complete authentication
			Session session = Session.getDefaultInstance(props,

					new javax.mail.Authenticator() {

						protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("mahendar768@gmail.com", "qguiffahozksdtku");

						}

					});

			try {

				// Create object of MimeMessage class
				Message message = new MimeMessage(session);

				// Set the from address
				message.setFrom(new InternetAddress("mahendar768@gmail.com"));

				// Set the recipient address
				message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("mahendar768@gmail.com"));
	            
	                        // Add the subject link
				message.setSubject("Testing Subject");

				// Create object to add multimedia type content
				BodyPart messageBodyPart1 = new MimeBodyPart();

				// Set the body of email
				messageBodyPart1.setText("This is message body");

				// Create another object to add another content
				MimeBodyPart messageBodyPart2 = new MimeBodyPart();

				// Mention the file which you want to send
				String filename = "F:\\SOFTWARES1\\Framwork Details\\results\\results.zip";//F:\\SOFTWARES1\\Framwork Details\\excel2.xlsx";

				// Create data source and pass the filename
				DataSource source = new FileDataSource(filename);

				// set the handler
				messageBodyPart2.setDataHandler(new DataHandler(source));

				// set the file
				messageBodyPart2.setFileName(filename);

				// Create object of MimeMultipart class
				Multipart multipart = new MimeMultipart();

				// add body part 1
				multipart.addBodyPart(messageBodyPart2);

				// add body part 2
				multipart.addBodyPart(messageBodyPart1);

				// set the content
				message.setContent(multipart);

				// finally send the email
				Transport.send(message);

				System.out.println("=====Email Sent=====");

			} catch (MessagingException e) {

				throw new RuntimeException(e);

			}

		}

	
	static String RandomEmail()
	{ 
	Random fd = new Random();
	String email1 = "dhoni"+fd.nextInt()+"@gmail.com";
	return email1;
	
	}
	
	
	static String RandomEmail2()
	{
	Random fdd = new Random();
	String email11 = "dhoni"+fdd.nextInt()+"@gmail.com";
	return email11;
	}

	void DriverIntail(String Name)
	{
		        switch (Name) {
		        case "chrome":
		        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\com.idibi\\drivers\\chromedriver109.exe");
		    		driver  = new ChromeDriver();
		    		driver.get("https://www.instagram.com/");
		    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		    		driver.manage().window().maximize();
		    		driver.manage().deleteAllCookies();
		    		System.out.println("i am from broser selecction");
		            break;
		 
		       
		        case "Firfox":
		        	System.setProperty("","");
		        	
		            break;
		 
		          
		        case "Mozilla":
		        	System.setProperty("", "");
		        	
		            break;
		 
		        
		        default:
		            System.out.println("No browser selected");;
		        }
		       	
	}

	}
