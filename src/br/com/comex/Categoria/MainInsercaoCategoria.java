package br.com.comex.Categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Categoria;



public class MainInsercaoCategoria {
	public static void main(String[] args) throws SQLException {

		Categoria informatica =  new Categoria("informatica", "ATIVA");
		
		Connection conexao = new ConnectionFactory().inicarConexao();
		CategoriaDao categoriadao = new CategoriaDao(conexao);
	    categoriadao.insere(informatica);


	}
}
