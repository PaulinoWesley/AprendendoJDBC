package com.campeonato.entity;

public class Evento {
	private Integer id;
	private Integer tipo;
	private Integer minuto;
	private Integer partida;
	private String jogador;
	private String observacao;

	public Evento() {
	}

	public Evento(Integer id, Integer tipo, Integer minuto, Integer partida, String jogador, String observacao) {
		this.id = id;
		this.tipo = tipo;
		this.minuto = minuto;
		this.partida = partida;
		this.jogador = jogador;
		this.observacao = observacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Integer getPartida() {
		return partida;
	}

	public void setPartida(Integer partida) {
		this.partida = partida;
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
