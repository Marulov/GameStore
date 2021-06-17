package Entities;

import java.time.LocalDate;

public class Gamer extends Customer {
	private String userName;
	
	public Gamer() {
		
	}

	public Gamer(String userName, int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
		super(id, firstName, lastName, dateOfBirth, nationalityId);
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
