package com.api.rest.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.springboot.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
