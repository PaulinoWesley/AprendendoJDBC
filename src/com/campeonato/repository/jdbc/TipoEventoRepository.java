package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TipoEventoRepository {

	public static void insereTipoEvento(String descricao, Integer codigo) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "INSERT INTO FUTEBOL.TIPOEVENTO (descricao, codigo) VALUES (?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setString(1, descricao);
		preparedStatement.setInt(2, codigo);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("INSERT: afetou " + linhasAfetadas + " linhas.");
	}

	public static void updateTipoEvento(Integer codigo, String descricao) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "UPDATE FUTEBOL.TIPOEVENTO SET descricao = ? WHERE codigo = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setString(1, descricao);
		preparedStatement.setInt(2, codigo);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("UPDATE: " + linhasAfetadas + " linhas afetadas.");
	}

	public static void deleteTipoEvento(Integer codigo) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "DELETE FROM FUTEBOL.TIPOEVENTO WHERE codigo = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setInt(1, codigo);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("DELETE: " + linhasAfetadas + " linhas afetadas.");
	}

	public static void listaTodoTipoEvento() throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();
		String SQL = "SELECT * FROM FUTEBOL.TIPOEVENTO";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getInt("codigo") + " | " + rs.getString("descricao"));
		}
	}

	public static void listaTipoEventoPorCodigo(Integer codigo) throws SQLException {
			Connection conn = MyConnection.getInstance();
			String SQL = "SELECT codigo FROM FUTEBOL.TIPOEVENTO WHERE codigo = ?";
			PreparedStatement preparedStatement = conn.prepareStatement(SQL);
			
			preparedStatement.setInt(1, codigo);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("codigo"));
			}
		}

}
