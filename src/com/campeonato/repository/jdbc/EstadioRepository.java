package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstadioRepository {

	public static void updateEstadio (Integer id, String nome) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "UPDATE FUTEBOL.ESTADIO SET nome = ? where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);
		
		preparedStatement.setString(1, nome);
		preparedStatement.setInt(2,  id);
		
		int linhasAfetadas = preparedStatement.executeUpdate();
		
		System.out.println("O objeto afetou " + linhasAfetadas + " linhas");
	}
	
	public static void listaEstadioComecadosCom(String termo) throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();

		String SQL = "SELECT * FROM Futebol.Estadio where nome like '" + termo + "%'";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("nome") + " " + rs.getString("capacidade"));
		}
	}
	
	public static void listaTodosEstadios() throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();

		String SQL = "SELECT * FROM Futebol.Estadio";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("id") + " | " + rs.getString("nome") + " | " + rs.getString("cidade"));
		}
	}
	
	public static void deleteEstadio (Integer id) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "DELETE FROM FUTEBOL.ESTADIO where id = ?";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);
		
		preparedStatement.setInt(1, id);
		
		int linhasAfetadas = preparedStatement.executeUpdate();
		
		System.out.println("O objeto afetou " + linhasAfetadas + " linha");
	}

	
}
