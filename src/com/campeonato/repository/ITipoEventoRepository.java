package com.campeonato.repository;

import java.util.List;

import com.campeonato.entity.TipoEvento;

public interface ITipoEventoRepository {
	void insert(TipoEvento tipoEvento);
	void update(Integer codigo);
	List<TipoEvento> findAll();
	TipoEvento findByCodigo(Integer codigo);
	List<TipoEvento> findByDescription(String descricao);
	void delete(TipoEvento tipoEvento);
	void deleteByCodigo(Integer codigo);
}
