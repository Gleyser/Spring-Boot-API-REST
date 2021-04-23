package br.com.webproject.cp.cp.controller;

import java.util.Arrays;
import java.util.List;

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
		Curso curso = this.cursoRepository.findAll().get(0);
		CursoDto cursodto = new CursoDto(curso);
		return Arrays.asList(cursodto);

	}

}
