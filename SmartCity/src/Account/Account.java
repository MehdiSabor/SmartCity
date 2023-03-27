package Account;

import java.util.Scanner;

public class Account {
	public String username;
	public String password;
	public String email;
	String name;
	String phone;
	public Account(String username, String password, String email, String name, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.phone = phone;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", email=" + email + ", name=" + name
				+ ", phone=" + phone + "]";
	}
	
	public boolean auth(String pass) {
		return this.password.equals(pass);
	}
		
	public void ChangeUsername(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your new Username: ");
		this.username = sc.next();
		sc.close();
	}
	public void ChangePassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your new Password: ");
		this.password = sc.next();
		sc.close();
	}
	
	
	
	
	
	

	}