package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Date;

public class EquipeRepository {
	public void getEquipes() {

	}

	public static void listaEquipes() throws SQLException {
		Connection con = MyConnection.getInstance();
		Statement stmt = con.createStatement();
		String SQL = "SELECT * FROM Futebol.Equipe";
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("nome") + " " + rs.getString("cidadeSede"));
		}
	}

	public static void listaEquipesOndeNomeComecaCom(String termo) throws SQLException {
		Connection con = MyConnection.getInstance();
		Statement stmt = con.createStatement();

		String SQL = "SELECT * FROM Futebol.Equipe where nome like '" + termo + "%'";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("nome") + " " + rs.getString("cidadeSede"));
		}
	}

	public static void listaEquipesOndeCidadeSedeComecaCom(String termo) throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();

		String SQL = "SELECT * FROM Futebol.Equipe where cidadeSede like '" + termo + "%'";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("nome") + " " + rs.getString("cidadeSede"));
		}
	}

	public static void insereEquipe(String nome, String cidadeSede, LocalDate dataCriacao) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert  = "INSERT INTO FUTEBOL.EQUIPE (NOME, CIDADESEDE, DATACRIACAO ) values (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);
		
		preparedStatement.setString(1, nome);
		preparedStatement.setString(2, cidadeSede);
		preparedStatement.setDate(3, Date.valueOf(dataCriacao));
		
		int linhasAfetas = preparedStatement.executeUpdate();
		
		System.out.println("Objeto Criado " + linhasAfetas + " linhas Afetadas");
	}
}
