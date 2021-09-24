package com.campeonato.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CidadeRepository {
	
	public static void insereCidade (String nome) throws SQLException {
		Connection conn = MyConnection.getInstance();
		String insert  = "INSERT INTO FUTEBOL.CIDADE (NOME) values (?)";
		PreparedStatement preparedStatement = conn.prepareStatement(insert);
		
		preparedStatement.setString(1, nome);
		
		int linhasAfetadas = preparedStatement.executeUpdate();
		
		System.out.println("O objeto " + linhasAfetadas + "linhas afetadas");
	
	}
	
	public static void listaCidadesComecadasCom(String termo) throws SQLException {
		Connection conn = MyConnection.getInstance();
		Statement stmt = conn.createStatement();

		String SQL = "SELECT * FROM Futebol.Cidade where nome like '" + termo + "%'";
		System.out.println(SQL);
		ResultSet rs = stmt.executeQuery(SQL);

		while (rs.next()) {
			System.out.println(rs.getString("id") + " " + rs.getString("nome"));
		}
	}
	
	
}
