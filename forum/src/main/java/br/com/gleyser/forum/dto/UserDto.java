package br.com.gleyser.forum.dto;

public class UserDto {
	
	private String name;
	private String type;
			
	public UserDto(String name, String type) {		
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	
	

}
