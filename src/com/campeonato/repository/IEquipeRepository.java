package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.Equipe;

public interface IEquipeRepository {
	void insert(Equipe equipe);
	void update(Integer id);
	List<Equipe> findAll();
	Equipe findById(Integer id);
	List<Equipe> findEquipeStartingWith(String nome);
	void delete(Equipe equipe);
	void deleteById(Integer id);
}
