package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstadioRepository {

	public static void insereEstadio (String nome,Integer capacidade, Integer cidade) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert = "INSERT INTO FUTEBOL.ESTADIO (NOME, CAPACIDADE, CIDADE) values (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);
		
		preparedStatement.setString(1, nome);
		preparedStatement.setInt(2, capacidade);
		preparedStatement.setInt(3, cidade);
		
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
	
	
}
