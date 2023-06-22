package controllers;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import org.json.JSONObject;
import modals.SignupUser;

@WebServlet("/user_signup")
public class UserSignUpServletControllers extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		retriving signup info
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		
//		date
		Date date = new Date();
		long miliSeconds = date.getTime();
		java.sql.Date sqlDate = new java.sql.Date(miliSeconds);
		
		
		try {
			boolean ans = SignupUser.resisterUser(email, contact, password, username, sqlDate);
			
//			creating JSONObject...
			JSONObject response_to_client = new JSONObject();
			response_to_client.put("source", "user_signup");
			response_to_client.put("result", ans);
//			creating JSONObject...			
			
			response.getWriter().print(response_to_client.toString());
		}
		catch(SQLException s) {
			System.out.println("UserSignUpServletControllers");
			s.printStackTrace();
		}
		
	}

	
}
