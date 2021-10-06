package com.campeonato.entity;

public class Jogador {
	private String inscricao;
	private String nome;
	private String posicao;
	private Integer equipe;
	
	public Jogador () {  }
	
	public Jogador(String inscricao, String nome, String posicao, Integer equipe) {
		this.inscricao = inscricao;
		this.nome = nome;
		this.posicao = posicao;
		this.equipe = equipe;
	}
		
	public String getInscricao() {
		return inscricao;
	}
		
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
		
	public String getNome() {
		return nome;
	}
		
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getPosicao() {
		return posicao;
	}
		
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
		
	public Integer getEquipe() {
		return equipe;
	}
		
	public void setEquipe(Integer equipe) {
		this.equipe = equipe;
	}
}
