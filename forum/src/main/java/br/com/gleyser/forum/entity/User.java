package br.com.gleyser.forum.entity;

import br.com.gleyser.forum.enums.UserType;

public class User {
	
	private String name;
	
	private String email;
	
	private UserType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getType() {
		return type;
	}
	
	public void changeToCreator() {
		this.type = UserType.CREATOR;
	}
	
	public void changeToParticipant() {
		this.type = UserType.PARTICIPANT;
	}
	
	
	

}
