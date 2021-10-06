package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.Jogador;

public interface IJogadorRepository {
	void insert(Jogador jogador);
	void update(String inscricao);
	List<Jogador> findAll();
	Jogador findByInscricao(String inscricao);
	List<Jogador> findJogadorStartingWith(String nome);
	void delete(Jogador jogador);
	void deleteByInscricao(String inscricao);
}
