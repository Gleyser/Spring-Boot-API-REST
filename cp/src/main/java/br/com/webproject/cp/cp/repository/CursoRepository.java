package br.com.webproject.cp.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webproject.cp.cp.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
