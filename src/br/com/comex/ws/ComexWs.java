package br.com.comex.ws;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.Categoria.CategoriaDao;
import br.com.comex.modelo.Categoria;



@WebService
public class ComexWs {
	private CategoriaDao categoriaDao = new CategoriaDao(null);

	 
		 public List<Categoria> getCategoria() throws SQLException{
		 System.out.println("chamando getCategoria");
		 List<Categoria> lista = categoriaDao.listaCategorias();
		 return lista;
		 }
		 
	}


