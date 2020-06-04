package br.uniamerica.cis.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 80)
	private String nome;
	
	@Column(length = 18)
	private String cnpj;
	
	private String latitude;
	private String longitude;
	private String logradouro;
	private String bairro;
	
	@OneToMany
	private List<Usuario> equipe = new ArrayList<>();
}
