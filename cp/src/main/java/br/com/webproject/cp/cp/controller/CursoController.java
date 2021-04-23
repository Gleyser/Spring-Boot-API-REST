package br.com.webproject.cp.cp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webproject.cp.cp.controller.dto.CursoDto;
import br.com.webproject.cp.cp.modelo.Curso;

@RestController
public class CursoController {
	
	
	  @RequestMapping("/cursos") 
	  public List<CursoDto> retornaCursos(){
		  Curso curso = new Curso("Curso A");
		  CursoDto cursodto = new CursoDto(curso);
		  return Arrays.asList(cursodto);
		  
	  
	  }
	 
	

}
