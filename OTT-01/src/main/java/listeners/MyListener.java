package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import utills.DBConnection;

public class MyListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listener Executed...");
		ServletContext sc = sce.getServletContext();
		String url = sc.getInitParameter("url");
		String username = sc.getInitParameter("username");
		String password = sc.getInitParameter("password");
		sc.setAttribute(url, url);
		sc.setAttribute(username, username);
		sc.setAttribute(password, password);
		DBConnection.establishConnection(url, username, password);
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}
	
}
