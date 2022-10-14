package br.com.comex.MainProduto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.ProdutoDao.ProdutoDao;

public class MainRemocaoProduto {

	public MainRemocaoProduto() throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		ProdutoDao produtoDao = new ProdutoDao(connection);
		produtoDao.ExcluirItem(15);
		//categoriaDao.listaCategorias();
		connection.close();
	}

}
