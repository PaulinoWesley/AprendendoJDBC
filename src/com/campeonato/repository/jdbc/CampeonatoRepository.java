package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class CampeonatoRepository {

	public static void insereCampeonato(String nome, LocalDate inicio, LocalDate fim) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "INSERT INTO FUTEBOL.CAMPEONATO (nome, inicio, fim) VALUES (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setString(1, nome);
		preparedStatement.setDate(2, Date.valueOf(inicio));
		preparedStatement.setDate(3, Date.valueOf(fim));

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("Insert: " + linhasAfetadas + " linhas afetadas");
	}

	public static void updateCampeonato(Integer id, String nome) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "UPDATE FUTEBOL.CAMPEONATO SET nome = ? WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, nome);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("Update: " + linhasAfetadas + " linhas afetadas.");
	}

	public static void deleteCampeonato(Integer id) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "DELETE FROM FUTEBOL.CAMPEONATO WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setInt(1, id);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("Delete: " + linhasAfetadas + " linhas.");
	}

	public static void listaTodosCampeonatos() throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();
		String SQL = "SELECT * FROM FUTEBOL.CAMPEONATO";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " | " + rs.getString("nome") + " | " + rs.getDate("inicio") + " | "
					+ rs.getDate("fim"));
		}
	}

	public static void listaCampeonatosPorId(Integer id) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String sql = "SELECT NOME, ID FROM FUTEBOL.CAMPEONATO WHERE id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);

		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("id") + " | " + rs.getString("nome"));
		}
	}
}
