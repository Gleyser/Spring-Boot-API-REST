package br.com.gleyser.forum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gleyser.forum.dto.UserDto;
import br.com.gleyser.forum.entity.User;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	@GetMapping
	public String iniciando() {
		return "iniciando";
	}
	
	@GetMapping("/{id}")
	public UserDto getUser(@PathVariable Long id) {
		User user = new User();
		user.setName("Gleyser");
		user.setEmail("g@gmail.com");
		user.changeToCreator();
		UserDto userdto = new UserDto(user.getName(), user.getType().toString());
		return userdto;
	}
	
	

}
