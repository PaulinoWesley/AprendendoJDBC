package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.Arbitro;

public interface IArbitroRepository {
	void insert(Arbitro arbitro);
	
	void update(Arbitro arbitro);
	
	List<Arbitro> findAll();
	
	Arbitro findByMatricula(String matricula);
	
	void delete(Arbitro arbitro);
	
	void delete(String matricula);
	
	List<Arbitro> findByNomeStartingWith(String nome);
}
