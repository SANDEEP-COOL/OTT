package utills;
import java.sql.*;

public class DBConnection {

//	connection object 
	private static Connection connection = null;
	
//	establish database connection
	public static void establishConnection(String url, String username, String password) {
		
		try {
			
//			load and register - mySql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			get connection - mySql
			connection = DriverManager.getConnection(url, username, password);
			
			System.out.println("connection opened...");
		}
		catch(ClassNotFoundException e) {
			System.out.println("DBConnection - establishConnection");
			e.printStackTrace();	
		}
		catch(SQLException e) {
			System.out.println("DBConnection - establishConnection");
			e.printStackTrace();
		}
		
	}
	
	
		
//	getConnection
	public static Connection getConnection() {
		return connection;
	}
	
	
		
//	close connection
	public static void close() {
		try {
			connection.close();
		}
		catch(SQLException e) {
			System.out.println("DBConnection - close()");
			e.printStackTrace();
		}
	}
	
}
