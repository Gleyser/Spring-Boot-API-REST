package br.com.webproject.cp.cp.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private Long id;
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private StatusCurso status = StatusCurso.ABERTO;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();	
	
	public Curso(String nome) {
		this.nome = nome;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}
	public StatusCurso getStatus() {
		return status;
	}
	public void setStatus(StatusCurso status) {
		this.status = status;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	
	
	
	

}
