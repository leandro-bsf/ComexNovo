package br.com.comex.ClienteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estados;


public class ClienteDao {
		private Connection conexao;
		
		
		public ClienteDao(Connection conexao) {
			this.conexao = conexao; 
		}
	public void insereCliente(Cliente cliente) throws SQLException {
		String sql ="INSERT INTO COMEX.CLIENTE (NOME, CPF, TELEFONE , RUA , NUMERO, COMPLEMENTO,BAIRRO, CIDADE, UF)"+
	"VALUES(?,?,?,?,?,?,?,?,?)";
		String[] colunaparaRetornar = {"id"};
		PreparedStatement comando = conexao.prepareStatement(sql , colunaparaRetornar);
		comando.setString(1, cliente.getNome());
		comando.setString(2, cliente.getCpf());
		comando.setString(3, cliente.getTelefone());
		comando.setString(4, cliente.getRua());
		comando.setString(5, cliente.getNumero());
		comando.setString(6, cliente.getComplemento());
		comando.setString(7, cliente.getBairro());
		comando.setString(8, cliente.getCidade());
		comando.setString(9, cliente.getUfs().name());
		comando.execute();
		ResultSet rs = comando.getGeneratedKeys();
		rs.next();
		cliente.setId(rs.getInt(1));
		System.out.println("Cliente  "+ cliente.getNome()+ " Inserido com sucesso");
		comando.close();
		
	}
	
	
	public List<Cliente> listaTodas() throws SQLException{
		
		PreparedStatement comandoPreparado = conexao.prepareStatement("select *from comex.cliente");
   	 List<Cliente> clientes = new ArrayList<Cliente>();
   	 ResultSet registro = comandoPreparado.executeQuery();
   	 while(registro.next()) {
   		 clientes.add(this.populaListaClientes(registro));
   	 }
   	 
   	registro.close();
   //	comandoPreparado.close();
	return clientes;
   	 
   }
	private Cliente populaListaClientes(ResultSet registro) throws SQLException {
		 
		try {Cliente cliente = new Cliente (
				  registro.getString("Nome"),
				  registro.getString("cpf"),
				  registro.getString("telefone"),
				  registro.getString("rua"),
				  registro.getString("numero"),
				  registro.getString("complemento"),
				  registro.getString("bairro"),
				  registro.getString("cidade"),
				  Estados.valueOf((registro.getString("UF")))
				  );
				cliente.setId(registro.getInt("id"));  
		return cliente;} catch (Exception erro) {
			System.out.println("Erro "+ erro);
			return null;
		}
	}
	public void ExcluirCliente(int id) throws SQLException {
		String sql = "DELETE FROM COMEX.Cliente WHERE id = ? ";
		 PreparedStatement stm = conexao.prepareStatement(sql);
		    stm.setInt(1, id);
	 		stm.execute();
	 		Integer linhasModificada = stm.getUpdateCount();
	 		System.out.println(linhasModificada+" Registro excluidos!");
	 		stm.close();
		
	}
	public void atualizar(Cliente cliente) throws SQLException {
   	 String sql = "update comex.categoria set descricao = ?  status = ?";
   	 PreparedStatement ps = conexao.prepareStatement(sql);
   	 ps.setString(1, cliente.getNome());
   	 ps.setString(2, cliente.getTelefone());
   	 ps.execute();
   	 ps.close();
   			 
   	
   }
	public Cliente buscarPorID(int id) throws SQLException {
		String sql = "select *from comex.cliente where id = ?";
		try(PreparedStatement ps = this.conexao.prepareStatement(sql)){
			ps.setInt(1, id);
			
				try(ResultSet registro = ps.executeQuery()){
					Cliente cliente = null;
					if(registro.next()) {
						cliente = this.populaListaClientes(registro);
					}
					return cliente;
				}
			
		}
		 
		
	}
	public void altera(Cliente cliente) throws SQLException {
		 String sql = "update comex.cliente set nome = ?, telefone = ? where id = ?";

		 PreparedStatement ps = conexao.prepareStatement(sql);
		 ps.setString(1, cliente.getNome());
		 ps.setString(2, cliente.getTelefone());
		 ps.setInt(3, cliente.getId());
		 ps.execute();
		 ps.close();
		 System.out.println("Cliente atualizado com sucesso!");
		
	}


}
