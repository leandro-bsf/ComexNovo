package br.com.comex.Categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Categoria;



public class MainInsercaoCategoria {
	public static void main(String[] args) throws SQLException {

		Categoria informatica =  new Categoria("CAbos", "INATIVA");
		
		Connection conexao = new ConnectionFactory().testaConexao();
		CategoriaDao categoriadao = new CategoriaDao(conexao);
	    categoriadao.insere(informatica);


	}
}
