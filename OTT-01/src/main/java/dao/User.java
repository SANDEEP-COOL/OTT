package dao;

public class User {
	private String email;
	private String contact;
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(String email, String contact, String username, String password) {
		super();
		this.email = email;
		this.contact = contact;
		this.username = username;
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
