package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JogadorRepository {

	public static void insereJogador(String inscricao, String nome, String posicao, Integer equipe)
			throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "INSERT INTO FUTEBOL.JOGADOR (inscricao, nome, posicao, equipe) VALUES (?,?,?,?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setString(1, inscricao);
		preparedStatement.setString(2, nome);
		preparedStatement.setString(3, posicao);
		preparedStatement.setInt(4, equipe);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("INSERT O objeto afetou " + linhasAfetadas + " linhas");
	}

	public static void updatePosicaoJogador(String inscricao, String posicao) throws SQLException {
		Connection conn = MyConnection.getInstance();

		String update = "UPDATE FUTEBOL.JOGADOR SET posicao = ? WHERE inscricao = ?;";
		PreparedStatement preparedStatement = conn.prepareStatement(update);

		preparedStatement.setString(1, posicao);
		preparedStatement.setString(2, inscricao);

		int linhasAfetadas = preparedStatement.executeUpdate();

		System.out.println("UPDATE O objeto afetou " + linhasAfetadas + " linhas");
	}

	public static void deleteJogador(String inscricao) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "DELETE FROM FUTEBOL.JOGADOR WHERE inscricao = ?;";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);

		preparedStatement.setString(1, inscricao);

		int linhasAfetadas = preparedStatement.executeUpdate();
		System.out.println("O objeto afetou " + linhasAfetadas + " linhas");
	}

	public static void listarTodosJogadores() throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();
		String SQL = "SELECT * FROM FUTEBOL.JOGADOR";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("inscricao") + " | " + rs.getString("nome") + " | "
					+ rs.getString("posicao") + " | " + rs.getInt("equipe"));
		}
	}

	public static void listarJogadorPorInscricao(String inscricao) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String sql = "SELECT INSCRICAO, NOME, POSICAO FROM FUTEBOL.JOGADOR WHERE inscricao = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, inscricao);

		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			System.out.println(
					rs.getString("inscricao") + " | " + rs.getString("nome") + " | " + rs.getString("posicao"));
		}
		System.out.println();
	}

}
