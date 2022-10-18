package br.com.comex.Pedido;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.PedidoDao.PedidoDao;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class ListaPedidos {


	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		
		PedidoDao p1 =  new PedidoDao(connection);
		
		List<Pedido> listadeCliente = p1.listaPedidos();
		
		System.out.println(listadeCliente);
		
		
		System.out.println("teste");
	}

}
