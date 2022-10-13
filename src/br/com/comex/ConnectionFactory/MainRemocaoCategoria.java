package br.com.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		PreparedStatement stm = connection.prepareStatement("DELETE FROM COMEX.CATEGORIA WHERE STATUS = 'INATIVA' ");
		stm.execute();
		Integer linhasModificada = stm.getUpdateCount();
		System.out.println(linhasModificada+" Registro excluidos!");
		

	}

}
