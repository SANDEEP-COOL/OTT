package modals;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import utills.DBConnection;

public class LoginUser {

	/* creating a private and static preparedStatement... */ 
	private static PreparedStatement ps1; 
	/* creating a private and static preparedStatement... */
	
//	instantiate PreparedStatement - static block - executes very firstly when a class is load...
	static {
		
		try {
			ps1 = DBConnection.getConnection().prepareStatement("select username from user where username = ? and password = ?");
		}
		
		catch(SQLException e) {
			System.out.println("LoginUser - static block");
			e.printStackTrace();
		}
		
	}
//	instantiate PreparedStatement - static block - executes very firstly when a class is load...	
	
//	excute ps1
	public static int getUserType(String username, String password) throws SQLException{
		
//		replacing placeholders by username and password...
		ps1.setString(1, username);
		ps1.setString(2, password);
//		replacing placeholders by username and password...
		
//		creating ResultSet object...
		ResultSet rs = ps1.executeQuery();
		
		String name = "";
		
//		getting name of user...
		if(rs.next()) {
			name = rs.getString(1);
		}
		
//		if no user of this username and password exist...
		else {
			return -1;
		}
		
		
//		check wheter user is admin or another user...
		if(name.equalsIgnoreCase("sandeep patel"))
			return 1;
		else
			return 0;
		
	}
//	excute ps1	
	
}
