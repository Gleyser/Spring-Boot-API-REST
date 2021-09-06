package br.com.gleyser.forum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.gleyser.forum.enums.UserType;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 2, max = 100)
	@NotEmpty
	@Column(nullable = false)
	private String name;	
	
	@NotEmpty
	@Column(nullable = false, unique = true)
	@Email
	private String email;
	
	@Enumerated(EnumType.STRING)
	private UserType type;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
