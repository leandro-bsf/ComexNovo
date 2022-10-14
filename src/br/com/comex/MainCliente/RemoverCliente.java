package br.com.comex.MainCliente;

import java.sql.Connection;

import br.com.comex.CategoriaDao.CategoriaDao;
import br.com.comex.ClienteDao.ClienteDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;

public class RemoverCliente {

	public RemoverCliente() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		ClienteDao clienteDao = new ClienteDao(connection);
		clienteDao.ExcluirCategoria(0);
		
		connection.close();
	}

}
