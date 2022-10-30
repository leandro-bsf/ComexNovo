package br.com.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
     
	public Connection inicarConexao() {
		
		
		try {
			
			 return    DriverManager.getConnection("jdbc:oracle:thin:@172.17.0.2:1521:xe", "system","admin");
			
		}catch (SQLException e ) {
			 throw new RuntimeException(e);
		}
		
	}
}
