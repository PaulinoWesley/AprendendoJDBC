package com.campeonato.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.campeonato.entity.Partida;

public interface IPartidaRepository {
	void insert(Partida partida);
	void update(Integer id);
	List<Partida> findAll();
	Partida findById(Integer id);
	List<Partida> findPartidaWithDate(LocalDateTime horarioMarcado);
	void delete(Partida partida);
	void deleteById(Integer id);
}
