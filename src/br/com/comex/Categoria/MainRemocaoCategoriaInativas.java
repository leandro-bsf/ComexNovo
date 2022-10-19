package br.com.comex.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;

public class MainRemocaoCategoriaInativas {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.inicarConexao();
		CategoriaDao categoriaDao = new CategoriaDao(connection);
		categoriaDao.ExcluirCategoriaInativas();
		//categoriaDao.listaCategorias();
		connection.close();

	}

}
