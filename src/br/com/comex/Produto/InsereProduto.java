package br.com.comex.MainProduto;


import java.sql.Connection;

import java.sql.SQLException;


import br.com.comex.CategoriaDao.CategoriaDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;

import br.com.comex.ProdutoDao.ProdutoDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class InsereProduto {

	public static void main(String[] args) throws SQLException {
		Categoria informatica = new Categoria("notebook","ATIVA");
		Produto Notebook = new Produto("mouse sen fui", " I5 8gb gtx1060", (float)4.500, 5 ,informatica, "ISENTO");
		
		Connection conexao = new ConnectionFactory().testaConexao();
		ProdutoDao produtodao = new ProdutoDao(conexao);
		CategoriaDao categoriadao = new CategoriaDao(conexao);
		
		categoriadao.insere(informatica);
		produtodao.insere(Notebook,informatica );
		
		conexao.close();
	}
	 
}
