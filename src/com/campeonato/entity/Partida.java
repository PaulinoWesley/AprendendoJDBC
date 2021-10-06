package com.campeonato.entity;

import java.time.LocalDateTime;

public class Partida {
	private Integer id;
	private LocalDateTime horarioMarcado;
	private Integer estadio;
	private Integer campoenato;
	private Integer timeVisitante;
	private Integer timeMandante;
	private Integer golsTimeVisitante;
	private Integer golsTimeMandante;
	private String arbitro;

	public Partida() {
	}

	public Partida(Integer id, LocalDateTime horarioMarcado, Integer estadio, Integer campeonato, Integer timeVisitante,
			Integer timeMandante, Integer golsTimeVisitante, Integer golsTimeMandante, String arbitro) {
		this.id = id;
		this.horarioMarcado = horarioMarcado;
		this.estadio = estadio;
		this.campoenato = campeonato;
		this.timeVisitante = timeVisitante;
		this.timeMandante = timeMandante;
		this.golsTimeVisitante = golsTimeVisitante;
		this.golsTimeMandante = golsTimeMandante;
		this.arbitro = arbitro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getHorarioMarcado() {
		return horarioMarcado;
	}

	public void setHorarioMarcado(LocalDateTime horarioMarcado) {
		this.horarioMarcado = horarioMarcado;
	}

	public Integer getEstadio() {
		return estadio;
	}

	public void setEstadio(Integer estadio) {
		this.estadio = estadio;
	}

	public Integer getCampoenato() {
		return campoenato;
	}

	public void setCampoenato(Integer campoenato) {
		this.campoenato = campoenato;
	}

	public Integer getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Integer timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public Integer getTimeMandante() {
		return timeMandante;
	}

	public void setTimeMandante(Integer timeMandante) {
		this.timeMandante = timeMandante;
	}

	public Integer getGolsTimeVisitante() {
		return golsTimeVisitante;
	}

	public void setGolsTimeVisitante(Integer golsTimeVisitante) {
		this.golsTimeVisitante = golsTimeVisitante;
	}

	public Integer getGolsTimeMandante() {
		return golsTimeMandante;
	}

	public void setGolsTimeMandante(Integer golsTimeMandante) {
		this.golsTimeMandante = golsTimeMandante;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}
}
