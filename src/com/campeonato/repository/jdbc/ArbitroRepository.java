package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArbitroRepository {

	public static void insereArbitro (String matricula, String nome, Integer cidade) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert  = "INSERT INTO FUTEBOL.ARBITRO (MATRICULA, NOME, CIDADE ) values (?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);
		
		preparedStatement.setString(1, matricula);
		preparedStatement.setString(2, nome);
		preparedStatement.setInt(3, cidade);
		
		int linhasAfetadas = preparedStatement.executeUpdate();
		
		System.out.println("O objeto " + linhasAfetadas + "linhas afetadas");
	}
	
	public static void listaArbitrosComecadosCom(String termo) throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();

		String SQL = "SELECT * FROM Futebol.Arbitro where nome like '" + termo + "%'";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("matricula") + " " + rs.getString("nome"));
		}
	}
}
