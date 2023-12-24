package apii.practicse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

/*//=== db details==//
Server: sql10.freemysqlhosting.net
Name: sql10511089
Username: sql10511089
Password: fBJjNKYrPf
Port number: 3306

//===login site==//
https://www.phpmyadmin.co/
*/
public class DbConnection {

	
	 @Test
    public static 	void connectDB() 
 
    {
 
 try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	//oracle.jdbc.driver.OracleDriver"
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10511089", "sql10511089", "fBJjNKYrPf");
	
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery("SELECT * FROM Politicians");//INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME LIKE '%%'");
	
	while(rs.next())	
	{
		int col;
		String nam;
		
		col=rs.getMetaData().getColumnCount();
	//	System.out.println(col);
		for(int i=1;i<=col;i++)
		{
//			String col1=rs.getMetaData().getSchemaName(i);
//			System.out.println(col1+"==");
//			String col2=rs.getMetaData().getTableName(i);
//			System.out.println(col2);
			String st1 = rs.getMetaData().getColumnName(i)+"="+rs.getObject(i).toString();
			System.out.println(st1);
		}
	}
	
	
	
	
	
	
	
	
	} 
	
	
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
} 
 
 
 
 
 catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
}
}

		
		
