package com.api.rest.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.rest.springboot.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);
	
}
