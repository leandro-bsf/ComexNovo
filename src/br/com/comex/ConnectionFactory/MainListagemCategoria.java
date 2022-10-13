package br.com.comex.ConnectionFactory;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		 
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		 Connection  connection  = connectionFactory.testaConexao();
		
		 PreparedStatement stm = connection.prepareStatement("select *from comex.categoria");
		 stm.execute();
		 ResultSet registros = stm.getResultSet();
		
		 while(registros.next()) {
			System.out.printf( "ID: %d - NOME: %s  Status: %s \n",
			registros.getInt("ID"),
			registros.getString("NOME"),
			registros.getString("STATUS"));
			
		 }
		
		 connection.close();
		
	}

}
