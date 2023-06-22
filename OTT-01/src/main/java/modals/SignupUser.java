package modals;
import java.sql.*;

import utills.DBConnection;

public class SignupUser {
	
//	PreparedStatement - declaration
	private static PreparedStatement ps, ps1;
	
//	static block - runs - class is used at first
	static {
		
		try {
			ps = DBConnection.getConnection().prepareStatement("insert into user (email, contact, username, password, date) values (?, ?, ?, ?, ?)");
		}
		catch(SQLException e) {
			System.out.println("SignupUser - static block");
			e.printStackTrace();
		}
		
	}

	
//	user - signup
	public static boolean resisterUser(String email, String contact, String password, String username, java.sql.Date sqlDate) throws SQLException{
		
//		replace placeholders
		ps.setString(1, email);
		ps.setString(2, contact);
		ps.setString(4, password);
		ps.setString(3, username);
		ps.setDate(5, sqlDate);
		
//		execute - preparedStatement - query
		int x = ps.executeUpdate();
		
		if(x > 0)
			return true;	
		return false;
		
	}
//	user - signup
	
}
