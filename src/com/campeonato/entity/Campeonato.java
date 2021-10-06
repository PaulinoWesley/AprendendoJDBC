package com.campeonato.entity;

import java.time.LocalDate;

public class Campeonato {
	private Integer id;
	private LocalDate inicio;
	private LocalDate fim;

	public Campeonato() {
	}

	public Campeonato(Integer id, LocalDate inicio, LocalDate fim) {
		this.id = id;
		this.inicio = inicio;
		this.fim = fim;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getInicio() {
		return inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFim() {
		return fim;
	}

	public void setFim(LocalDate fim) {
		this.fim = fim;
	}

}
