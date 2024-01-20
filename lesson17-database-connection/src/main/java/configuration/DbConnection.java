package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbConnection {
	private static Connection conn = null;
	private DbConnection()
	{
		
	}
	public static Connection getConnection()
	{
		if ( conn == null)
		{
			// B0: Doc tham so tu file cau hinh 
			Properties props = DbProvider.getDbProps();
			//B1: Khai bao DRIVER(class) đến mySQL
			try {
				Class.forName(props.getProperty("DRIVER"));
				
				// B2: Khai báo thông tin database connection
				conn = DriverManager.getConnection(
						props.getProperty("URL"),
						props.getProperty("USER"),
						props.getProperty("PASS"));
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void main(String[] args) {
		Connection c1 = getConnection();
		System.out.println("c1 --> " + c1);
	}
}
