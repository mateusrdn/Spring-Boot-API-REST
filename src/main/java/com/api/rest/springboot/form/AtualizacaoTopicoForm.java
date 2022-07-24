package com.api.rest.springboot.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.api.rest.springboot.model.Topico;
import com.api.rest.springboot.repository.TopicoRepository;

public class AtualizacaoTopicoForm {

	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	
	@NotNull @NotEmpty @Length(min = 5)
	private String mensagem;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public Topico atualizar(Long id, TopicoRepository repository) {
		
		Topico topico = repository.getOne(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		
		return topico;
	}
	
	
}
