package br.com.webproject.cp.cp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.webproject.cp.cp.controller.dto.CursoDto;
import br.com.webproject.cp.cp.modelo.Curso;
import br.com.webproject.cp.cp.repository.CursoRepository;

@RestController
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@RequestMapping("/cursos")
	public List<CursoDto> retornaCursos() {
		List<Curso> cursos = this.cursoRepository.findAll();
		List<CursoDto> cursosDto = converteParaCursoDto(cursos);				
		return cursosDto;

	}
	
	private List<CursoDto> converteParaCursoDto(List<Curso> cursos){
		return cursos.stream().map(CursoDto::new).collect(Collectors.toList());
	}

}
