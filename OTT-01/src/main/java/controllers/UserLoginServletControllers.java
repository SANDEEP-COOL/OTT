package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modals.LoginUser;
import java.sql.SQLException;
import org.json.JSONObject;

@WebServlet("/user_login")
public class UserLoginServletControllers extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		get username and password of the User...
		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		get username and password of the User...
		
//		if ans is
//		1 - admin
//		0 - user
//		-1 - not exist
		
//		creating json object...
		JSONObject response_to_client = new JSONObject();
		response_to_client.put("source", "user_login");
		
//		creating json object...
		
		try {
			
			int userType = LoginUser.getUserType(username, password);
			System.out.println(userType);
			if(userType == 0) {
				response_to_client.put("result", "user");
			}
			else if(userType == 1) {
				response_to_client.put("result", "admin");
			}
			else if(userType == -1) {
				response_to_client.put("result", "none");
			}

		}
		catch(SQLException s) {
			System.out.println("user-login-SQLException");
			s.printStackTrace();
		}
		
//		convert JSONObject - jsonString - send response
		response.getWriter().print(response_to_client.toString());
	}

}
