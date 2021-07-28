package utils;

import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import base.BaseClass;







public class TestUtils extends BaseClass {
	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	   public static String dateTimeGenerate(){ 
		   Format formatter = new SimpleDateFormat("ddMMYYYY_HHmmss");
		   Date date = new Date(System.currentTimeMillis()); 
	   return formatter.format(date); 
	   }
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static int IMPLICITY_WAIT = 40;
	public static long IMPLICITY_WAIT_N =10;

}

