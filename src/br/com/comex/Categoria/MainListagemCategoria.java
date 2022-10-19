package br.com.comex.Categoria;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Categoria;


public class MainListagemCategoria {

	public static void main(String[] args) throws SQLException {
		 
		Connection conexao = new ConnectionFactory().testaConexao();
		
		CategoriaDao  categoriaDao = new CategoriaDao(conexao);
		
	   List<Categoria> listacat = categoriaDao.listaCategorias();
	   	System.out.println(listacat);
		
	}

}
