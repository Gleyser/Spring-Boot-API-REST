package br.com.gleyser.forum.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class UserDto {
	private Long id;
	
	@Size(min = 2, max = 100)
	@NotEmpty
	private String name;
	
	@Enumerated(EnumType.STRING)
	private String type;
			
	public UserDto(Long id, String name, String type) {		
		this.id = id;		
		this.name = name;		
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public Long getId() {
		return id;
	}
	
	
	
	

}
