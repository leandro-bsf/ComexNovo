package MainCategoria;


import java.sql.Connection;
import java.sql.SQLException;

import CategoriaDao.CategoriaDao;
import ConnectionFactory.ConnectionFactory;
import modelo.Categoria;

public class MainAtualizaCategoria {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		 Connection  connection  = connectionFactory.testaConexao();
		CategoriaDao categoriaDao = new CategoriaDao(connection);
		
		Categoria  categoria = categoriaDao.buscaPorId(208);
		categoria.setDescricao("Materia de Limpesa");
		categoria.setStatus("ATIVA");
		categoriaDao.altera(categoria);
		connection.close();
		
		
		
		
	}

	}


