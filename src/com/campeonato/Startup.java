package com.campeonato;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.campeonato.repository.jdbc.ArbitroRepository;
import com.campeonato.repository.jdbc.CampeonatoRepository;
import com.campeonato.repository.jdbc.CidadeRepository;
import com.campeonato.repository.jdbc.EquipeRepository;
import com.campeonato.repository.jdbc.EstadioRepository;
import com.campeonato.repository.jdbc.JogadorRepository;
import com.campeonato.repository.jdbc.PartidaRepository;
import com.campeonato.repository.jdbc.TipoEventoRepository;

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
//			EstadioRepository.listaEstadioComecadosCom("P");
//			EstadioRepository.updateEstadio(1,"E o Laion");
//			EstadioRepository.deleteEstadio(8);
//			EstadioRepository.listaTodosEstadios();
//			JogadorRepository.insereJogador("888000","Alterado","Atacante",22);			
//			JogadorRepository.listarJogadorPorInscricao("888000");
//			JogadorRepository.updatePosicaoJogador("888000", "Meia");
//			JogadorRepository.listarJogadorPorInscricao("888000");
//			JogadorRepository.deleteJogador("888000");
//			JogadorRepository.listarTodosJogadores();
//			JogadorRepository.listarJogadorPorInscricao("888000");
//			CampeonatoRepository.insereCampeonato("Campeonato Cearense", LocalDate.of(2022,02,01), LocalDate.of(2022,05,30));
//			CampeonatoRepository.listaTodosCampeonatos();
//			CampeonatoRepository.updateCampeonato(3, "Campeonato Estadual");
//			CampeonatoRepository.listaCampeonatosPorId(3);
//			CampeonatoRepository.deleteCampeonato(3);
//			CampeonatoRepository.listaTodosCampeonatos();
//			LocalDateTime horarioMarcado = LocalDateTime.of(2022,02,03,18,00,00);
//			Integer estadio = 2;
//			Integer campeonato = 2;
//			Integer timeVisitante = 18;
//			Integer timeMandante = 3;
//			Integer golsTimeVisitante = 1;
//			Integer golsTimeMandante = 1;
//			String arbitro = "1018";
//			PartidaRepository.inserePartida(
//					horarioMarcado, estadio, campeonato, timeVisitante, 
//					timeMandante, golsTimeVisitante, golsTimeMandante, arbitro);
//			PartidaRepository.listaTodasPartidas();
//			PartidaRepository.updatePartida(19, "1020");
//			PartidaRepository.listaPartidaPorId(19);
//			PartidaRepository.deletePartida(19);
//			PartidaRepository.listaTodasPartidas();
			TipoEventoRepository.insereTipoEvento("Tiro Livre Direito", 20);
			TipoEventoRepository.listaTodoTipoEvento();
			TipoEventoRepository.updateTipoEvento(20, "Tiro livre indireto");
			TipoEventoRepository.listaTipoEventoPorCodigo(20);
			TipoEventoRepository.deleteTipoEvento(20);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
