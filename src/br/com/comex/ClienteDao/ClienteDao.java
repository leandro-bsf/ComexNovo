package br.com.comex.ClienteDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Cliente;


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
		System.out.println("Cliente"+ cliente.getNome()+ " Inserido com sucesso");
		comando.close();
		
	}
	public void ExcluirCliente(int id) throws SQLException {
		PreparedStatement stm = conexao.prepareStatement("delete from comex.Cliente where  id = ?");
		stm.setInt(1, id);
		stm.execute();
		Integer linhasModificada = stm.getUpdateCount();
	 	System.out.println(linhasModificada+" Registro excluidos!");
	 	stm.close();
		 
	}
	
	public List<Cliente> listaTodas() throws SQLException{
		PreparedStatement comandoPreparado = conexao.prepareStatement("select *from comex.cliente");
   	 List<Cliente> clientes = new ArrayList<Cliente>();
   	 ResultSet registro = comandoPreparado.executeQuery();
   	 while(registro.next()) {
   		 clientes.add(this.populaListaClientes(registro));
   	 }
   	 
   	registro.close();
   	comandoPreparado.close();
	return clientes;
   	 
   }
	private Cliente populaListaClientes(ResultSet registro) throws SQLException {
		  Cliente cliente = new Cliente (
				  registro.getInt("ID"),
				  registro.getString("NOME"),
				  registro.getString("CPF"),
				  registro.getString("TELEFONE"),
				  registro.getString("RUA"),
				  registro.getString("NUMERO"),
				  registro.getString("COMPLEMENTO"),
				  registro.getString("BAIRRO"),
				  registro.getString("CIDADE"),
				  registro.getString("UF")
				  );
				cliente.setId(registro.getInt("id"));  
		return cliente;
	}
	public void ExcluirCategoria(int i) throws SQLException {
		 PreparedStatement stm = conexao.prepareStatement("DELETE FROM COMEX.CATEGORIA WHERE STATUS = 'INATIVA' ");
	 		stm.execute();
	 		Integer linhasModificada = stm.getUpdateCount();
	 		System.out.println(linhasModificada+" Registro excluidos!");
	 		stm.close();
		
	}


}
