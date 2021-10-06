package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.Estadio;

public interface IEstadioRepository {
	void insert(Estadio estadio);
	void update(Estadio estadio);
	List<Estadio> findAll();
	Estadio findById(Integer id);
	List<Estadio> findEstadioStartingWith(String nome);
	void delete(Estadio estadio);
	void deleteById(Integer id);
}
