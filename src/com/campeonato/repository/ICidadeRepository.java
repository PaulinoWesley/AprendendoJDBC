package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.Cidade;

public interface ICidadeRepository {
	void insert(Cidade cidade);
	void update(Integer id);
	List<Cidade> findAll();
	Cidade findById(Integer id);
	List<Cidade> findCidadeStartingWith(String nome);
	void delete(Cidade cidade);
	void deleteById(Integer id);
}
