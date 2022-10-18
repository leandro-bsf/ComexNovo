package br.com.comex.PedidoDao;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class PedidoDao {
  private Connection conexao;

			public PedidoDao(Connection conexao) {
				this.conexao =  conexao;
			}
			public PedidoDao(String string, int int1) {
				// TODO Auto-generated constructor stub
			}
			public void  inserePedido(String data , Cliente cliente) throws SQLException {
				System.out.println("TEste");
				 String sql = "INSERT INTO  comex.pedido (data, cliente_id) values(?, ?)";
				
				 String[] colunaParaRetornar = { "id" };
			      	PreparedStatement comando = conexao.prepareStatement(sql, colunaParaRetornar);
				 comando.setString(1, data);
				 comando.setInt(2,cliente.getId());
				 
				comando.execute();
			    ResultSet rs = comando.getGeneratedKeys();
				rs.next();
				cliente.setId(rs.getInt(1));
				comando.close();
				System.out.println("Pedido inserido com sucesso!");
			}
			public  List<Pedido> listaPedidos() throws SQLException {
				PreparedStatement comandoPreparado = conexao.prepareStatement("select *from comex.pedido");
			   	 List<Pedido> p = new ArrayList<Pedido>();
			   	 ResultSet registro = comandoPreparado.executeQuery();
			   	 while(registro.next()) {
			   		 p.add(this.populaListaClientes(registro));
			   	 }
			   	 
			   	registro.close();
			  
				return p;
				
			}
			private Pedido populaListaClientes(ResultSet registro) throws SQLException {
				Pedido pedidos = new Pedido (
						registro.getString("data"),
					new Cliente(registro.getInt("cliente_id"))
						);
				pedidos.setId(registro.getInt("id"));
						
				return pedidos;
			}
			public void removePedido(int id) throws SQLException {
				 String sql = "delete from  comex.pedido where id = ?";
				 PreparedStatement stm = conexao.prepareStatement(sql);
				 stm.setInt(1, id);
				 stm.execute();
				 Integer linhasModificada = stm.getUpdateCount();
				 System.out.println(linhasModificada+" Registro execluidos!");
				 stm.close();
				 
				 
				 
				
			}
		
	
	}


