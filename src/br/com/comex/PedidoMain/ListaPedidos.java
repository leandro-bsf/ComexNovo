package br.com.comex.PedidoMain;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.PedidoDao.pedidoDao;
import br.com.comex.modelo.Pedido;

public class ListaPedidos {


	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		
		pedidoDao p1 =  new pedidoDao(connection);
		
		List<Pedido> listadeCliente = p1.listaPedidos();
		
		System.out.println(listadeCliente);
		
		
		
	}

}
