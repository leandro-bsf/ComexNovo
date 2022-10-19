package br.com.comex.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;

public class MainRemocaoCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.inicarConexao();
		CategoriaDao categoriaDao = new CategoriaDao(connection);
		categoriaDao.ExcluirCategoria(228);
		categoriaDao.listaCategorias();
		connection.close();

	}

}
