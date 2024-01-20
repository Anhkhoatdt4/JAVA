package Data;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDatabase {
	public static void main(String[] args) {
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://LAPTOP-RDTLIIIQ/MSSQLSERVER1:1433;databaseName=a";
			String userName = "sa";
			String password = "041004";
			
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
