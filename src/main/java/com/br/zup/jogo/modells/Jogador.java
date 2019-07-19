package com.br.zup.jogo.modells;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Jogador implements Serializable {
	private static final long serilVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message = "O campo nome não pode ficar em branco")
	@Size(min = 2, message = "O campo nome deve ter no mínimo duas letras")
	private String nome;
	
	private Integer numeroJogado;
	@OneToOne(cascade = CascadeType.ALL)
	private Sorteio sorteio;
	
	public Jogador() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroJogado() {
		return numeroJogado;
	}

	public void setNumeroJogado(Integer numeroJogado) {
		this.numeroJogado = numeroJogado;
	}

	public Sorteio getSorteio() {
		return sorteio;
	}

	public void setSorteio(Sorteio sorteio) {
		this.sorteio = sorteio;
	}
	
	
}
