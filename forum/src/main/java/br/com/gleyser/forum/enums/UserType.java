package br.com.gleyser.forum.enums;

public enum UserType {
	CREATOR("Creator"),
	PARTICIPANT("Participant");
	
	private final String description;
	
	UserType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
