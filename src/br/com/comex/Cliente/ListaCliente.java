package br.com.comex.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class ListaCliente {

	

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.inicarConexao();
		
		ClienteDao clienteDao = new  ClienteDao(connection);
		
		List<Cliente> listadeCliente = clienteDao.listaTodas();
		for(Cliente cliente: listadeCliente) {
			System.out.println("Nome:"+cliente.getNome()+"  CPF: " + cliente.getCpf() + 
					"TELEFONE: "+ cliente.getTelefone() + "RUA:"+cliente.getRua() +"Complemento:"+ cliente.getComplemento()
					+ "Bairro: " +cliente.getBairro()+ "  UF: "+ cliente.getUfs());
		}
		
		
		connection.close();

	}

}
