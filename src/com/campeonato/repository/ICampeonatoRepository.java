package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.Campeonato;

public interface ICampeonatoRepository {
	void insert(Campeonato campeonato);
	void update(Integer id);
	List<Campeonato> findAll();
	Campeonato findById(Integer id);
	List<Campeonato> findCampeonatoStartingWith(String nome);
	void delete(Campeonato campeonato);
	void deleteById(Integer id);
}
