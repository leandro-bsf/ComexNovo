package br.com.comex.Pedido;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.Produto.ProdutoDao;

public class RemovePedido {

	

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
		PedidoDao pedidodao = new PedidoDao(connection);
		pedidodao.removePedido(9);
		
		
		

	}

}
