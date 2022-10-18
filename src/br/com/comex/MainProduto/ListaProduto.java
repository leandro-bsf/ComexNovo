package br.com.comex.MainProduto;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.ProdutoDao.ProdutoDao;
import br.com.comex.modelo.Produto;

public class ListaProduto {

	public static void main(String[] args) throws SQLException {
		  Connection conexao = new ConnectionFactory(). testaConexao();
		
	
		 ProdutoDao produtodao = new ProdutoDao(conexao);
		 produtodao.listaTodas();
		
		  
    conexao.close();
	}

}
