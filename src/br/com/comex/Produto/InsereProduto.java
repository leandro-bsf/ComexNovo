package br.com.comex.Produto;


import java.sql.Connection;

import java.sql.SQLException;

import br.com.comex.Categoria.CategoriaDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class InsereProduto {

	public static void main(String[] args) throws SQLException {
		Categoria informatica = new Categoria("notebook","ATIVA");
		Produto Notebook = new Produto("Monitor 227", " I5 8gb gtx1060", (float)4.500, 5 ,informatica, "ISENTO");
		
		Connection conexao = new ConnectionFactory().inicarConexao();
		ProdutoDao produtodao = new ProdutoDao(conexao);
		CategoriaDao categoriadao = new CategoriaDao(conexao);
		categoriadao.insere(informatica);
		
		
		produtodao.insere(Notebook );
		
		conexao.close();
	}
	 
}
