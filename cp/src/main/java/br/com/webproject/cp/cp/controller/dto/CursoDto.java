package br.com.webproject.cp.cp.controller.dto;

import java.time.LocalDate;

import br.com.webproject.cp.cp.modelo.Curso;

public class CursoDto {
	private Long id;
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	
	public CursoDto(Curso curso){
		this.id = curso.getId();
		this.nome= curso.getNome();
		this.dataInicio = curso.getDataInicio();
		this.dataFinal = curso.getDataFinal();
	}	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
	
	
	
	

}
