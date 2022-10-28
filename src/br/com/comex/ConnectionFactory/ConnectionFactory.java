package br.com.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
     
	public Connection inicarConexao() {
		
		
		try {
			
			 return   DriverManager.getConnection("jdbc:oracle:thin:@//0.0.0.0:1521/xe", "system", "1710");
			
		}catch (SQLException e ) {
			 throw new RuntimeException(e);
		}
		
	}
}
