package com.campeonato.entity;

public class Estadio {
	private Integer id;
	private String nome;
	private Integer capacidade;
	private Integer cidade;

	public Estadio() {
	}

	public Estadio(Integer id, String nome, Integer capacidade, Integer cidade) {
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
		this.cidade = cidade;
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

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Integer getCidade() {
		return cidade;
	}

	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}
}
