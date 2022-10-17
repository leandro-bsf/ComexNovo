package br.com.comex.PedidoMain;



import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ClienteDao.ClienteDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estados;
import br.com.comex.pedidoDao.PedidoDao;



public class inserePedido {

	
		public static void main(String[] args) throws SQLException {
			
			
			
			Connection conexao = new ConnectionFactory().testaConexao();
			
			Cliente Dioavana = 
					new Cliente("Leandro","09052425555", "422626256544", "Rua tenente camargo", "S/N", 
							"predio branco", "centro","Francisco beltrao", Estados.PR );
			
			ClienteDao clienteDao = new ClienteDao(conexao);
			clienteDao.insereCliente(Dioavana);
		
		
			PedidoDao P1 = new  PedidoDao(conexao);
			P1.inserePedido("17/10/2022", Dioavana);
			
			conexao.close();
			
		
			
			
			
	}
}
