package br.com.comex.Cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class AtualizarCliente {

	public static void main(String[] args) throws SQLException {
		Connection conexao = new ConnectionFactory().inicarConexao();
		ClienteDao clienteDao = new ClienteDao(conexao);
		Cliente cliente = clienteDao.buscarPorID(90);
		cliente.setNome("Leandro Silva ");
		cliente.setTelefone("4691417577");
		clienteDao.altera(cliente);
		
	}

}
