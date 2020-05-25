package br.uniamerica.cis.controller.dto.input;

import javax.validation.constraints.NotBlank;

public class EspecialidadeInput {
	
	@NotBlank
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}
