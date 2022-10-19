package br.com.comex.Produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;

public class MainRemocaoProduto {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		ProdutoDao produtoDao = new ProdutoDao(connection);
		produtoDao.ExcluirItem(48);
		//categoriaDao.listaCategorias();
		connection.close();
	}

}
