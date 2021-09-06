package br.com.gleyser.forum.enums;

public enum UserType {
	CRIADOR("Criador"),
	PARTICIPANTE("Participante");
	
	private final String description;
	
	UserType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	

}
