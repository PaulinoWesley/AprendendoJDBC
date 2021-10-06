package com.campeonato.entity;

import java.time.LocalDate;

public class Equipe {
	private Integer id;
	private String nome;
	private LocalDate dataCriacao;
	private String cidadeSede;

	public Equipe() {
	}

	public Equipe(Integer id, String nome, LocalDate dataCriacao, String cidadeSede) {
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.cidadeSede = cidadeSede;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCidadeSede() {
		return cidadeSede;
	}

	public void setCidadeSede(String cidadeSede) {
		this.cidadeSede = cidadeSede;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
