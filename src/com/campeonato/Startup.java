package com.campeonato;

import java.sql.SQLException;
import java.time.LocalDate;

import com.campeonato.repository.jdbc.ArbitroRepository;
import com.campeonato.repository.jdbc.CidadeRepository;
import com.campeonato.repository.jdbc.EquipeRepository;
import com.campeonato.repository.jdbc.EstadioRepository;

public class Startup {
	public static void main(String[] args) {
		try {
//			EquipeRepository.insereEquipe("Zuric 01", "Zuric", LocalDate.of(1915, 1, 15));
//			EquipeRepository.listaEquipesOndeNomeComecaCom("Z");
////			EquipeRepository.listaEquipesOndeCidadeSedeComecaCom("Z");
//			CidadeRepository.insereCidade("Quixadá");
//			CidadeRepository.insereCidade("Quixeramobim");
//			CidadeRepository.insereCidade("Quixelo");
//			CidadeRepository.insereCidade("Columbina");
//			CidadeRepository.insereCidade("Campos Belos");
//			CidadeRepository.insereCidade("Campos Elisios");
//			CidadeRepository.listaCidadesComecadasCom("C");
//			EstadioRepository.insereEstadio("Castelinho", 50000, 12);
//			EstadioRepository.insereEstadio("Castelo de Areia", 76389, 11);
//			EstadioRepository.insereEstadio("Guadalajara", 100000, 9);
//			EstadioRepository.insereEstadio("Piamarta", 50000, 5);
//			EstadioRepository.insereEstadio("Maracanã", 230000, 6);
//			EstadioRepository.insereEstadio("Sofa la de Casa", 120000, 8);
			EstadioRepository.listaEstadioComecadosCom("P");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
