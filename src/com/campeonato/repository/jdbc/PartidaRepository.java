package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class PartidaRepository {

	public static void inserePartida(LocalDateTime horarioMarcado, Integer estadio, Integer campeonato,
			Integer timeVisitante, Integer timeMandante, Integer golsTimeVisitante, Integer golsTimeMandante,
			String arbitro) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "INSERT INTO FUTEBOL.PARTIDA (HORARIOMARCADO,ESTADIO,CAMPEONATO,TIMEVISITANTE,"
				+ "TIMEMANDANTE,GOLSTIMEVISITANTE,GOLSTIMEMANDANTE,ARBITRO)" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setTimestamp(1, Timestamp.valueOf(horarioMarcado));
		preparedStatement.setInt(2, estadio);
		preparedStatement.setInt(3, campeonato);
		preparedStatement.setInt(4, timeVisitante);
		preparedStatement.setInt(5, timeMandante);
		preparedStatement.setInt(6, golsTimeVisitante);
		preparedStatement.setInt(7, golsTimeMandante);
		preparedStatement.setString(8, arbitro);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("Insert: " + linhasAfetadas + " linhas afetadas");
	}

	public static void updatePartida(Integer id, String arbitro, LocalDateTime horarioMarcado,
			Integer estadio, Integer campeonato, Integer timeVisitante, Integer timeMandante,
			Integer golsTimeVisitante, Integer golsTimeMandante) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "UPDATE FUTEBOL.PARTIDA SET arbitro = ?, horarioMarcado = ?, estadio = ?,"
				+ "campeonato = ?, timeVisitante = ?, timeMandante = ?,"
				+ "golsTimeVisitante = ?, golsTimeMandate = ? WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setString(1, arbitro);
		preparedStatement.setTimestamp(2, Timestamp.valueOf(horarioMarcado));
		preparedStatement.setInt(3, estadio);
		preparedStatement.setInt(4, campeonato);
		preparedStatement.setInt(5, timeVisitante);
		preparedStatement.setInt(6, timeMandante);
		preparedStatement.setInt(7, golsTimeVisitante);
		preparedStatement.setInt(8, golsTimeMandante);
		preparedStatement.setInt(9, id);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("Update: " + linhasAfetadas + " linhas afetadas.");
	}

	public static void deletePartida(Integer id) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "DELETE FROM FUTEBOL.PARTIDA WHERE id =?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setInt(1, id);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("Delete: " + linhasAfetadas + " linhas afetadas");
	}

	public static void listaTodasPartidas() throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();
		String SQL = "SELECT * FROM FUTEBOL.PARTIDA";
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(
					rs.getInt("id") + " | " + rs.getTimestamp("horarioMarcado") + " | " + rs.getInt("timeVisitante")
							+ " | " + rs.getInt("timeMandante") + " | " + rs.getInt("golsTimeVisitante") + " | "
							+ rs.getInt("golsTimeMandante") + " | " + rs.getString("arbitro"));
		}
	}

	public static void listaPartidaPorId(Integer id) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String SQL = "SELECT TIMEMANDANTE, TIMEVISITANTE FROM FUTEBOL.PARTIDA WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(SQL);

		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("timeMandante") + " | " + rs.getInt("timeVisitante"));
		}

	}
}
