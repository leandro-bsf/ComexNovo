package br.com.comex.MainCategoria;

import java.sql.Connection;


import java.sql.SQLException;

import br.com.comex.CategoriaDao.CategoriaDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainAtualizaCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		 Connection  connection  = connectionFactory.testaConexao();
		CategoriaDao categoriaDao = new CategoriaDao(connection);
		
		Categoria  categoria = categoriaDao.buscaPorId(179);
		categoria.setDescricao("livros Tecnicos");
		categoria.setAtiva("INATIVA");
		categoriaDao.altera(categoria);
		connection.close();
		System.out.println("Categoria alterada com sucesso!");
		
		
		
	}

	}


