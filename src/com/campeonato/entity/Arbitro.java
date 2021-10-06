package com.campeonato.entity;

public class Arbitro {
	private String matricula;
	private String nome;
	private Integer cidade;

	public Arbitro() {
	}

	public Arbitro(String matricula, String nome, Integer cidade) {
		this.matricula = matricula;
		this.nome = nome;
		this.cidade = cidade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCidade() {
		return cidade;
	}

	public void setCidade(Integer cidade) {
		this.cidade = cidade;
	}

}
