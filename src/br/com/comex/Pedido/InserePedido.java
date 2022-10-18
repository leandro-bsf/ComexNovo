package br.com.comex.Pedido;



import java.sql.Connection;
import java.sql.SQLException;

import ClienteDao.ClienteDao;
import ConnectionFactory.ConnectionFactory;
import modelo.Cliente;
import modelo.Estados;

public class InserePedido {

	
		public static void main(String[] args) throws SQLException {
			
			
			
			Connection conexao = new ConnectionFactory().testaConexao();
			
			Cliente Dioavana = 
					new Cliente("Diovana","020552659556", "422626256555", "Rua tenente camargo", "S/N", 
							"predio branco", "centro","Francisco beltrao", Estados.PR );
			
			ClienteDao clienteDao = new ClienteDao(conexao);
			clienteDao.insereCliente(Dioavana);
		
		
			pediodoDao P1 = new  PedidoDao(conexao);
			P1.inserePedido("17/10/2022", Dioavana);
			
			conexao.close();
			
		
			
			
			
	}
}
