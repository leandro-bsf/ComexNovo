package br.com.comex.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.comex.modelo.Categoria;



public class MainInsercaoCategoria {

	

	public static void main(String[] args) throws SQLException {
		ConnectionFactory   connectionFactory = new ConnectionFactory();
		Connection  connection  = connectionFactory.testaConexao();
	
        
	   
	  String sql = "INSERT INTO  comex.categoria (NOME, STATUS) values(?, ?)";
	   PreparedStatement comando =  connection.prepareStatement(sql);
	 
	 insereCategoria("INFORMÁTICA" ,"ATIVA", comando ); 
	  //insereCategoria("MÓVEIS","INATIVA", comando );
	//  insereCategoria("LIVROS", "ATIVA", comando );
    //ver com o professor pq nao insere todas de uma vez quando esta descomentadas
	  
	   
	}

	private static void insereCategoria(String descricao , String status , PreparedStatement comando) throws SQLException {
		Categoria cat1 = new Categoria("Informatica", "ATIVA");
		 
		comando.setString(1,cat1.getDescricao());
		  comando.setString(2,status);
		  comando.execute();
		  ResultSet rst = comando.getGeneratedKeys();
		  while(rst.next()) {
			  Integer id = rst.getInt(1);
			  System.out.println("O id Criado foi: " + id);
		  }
		   comando.close();
	}

}
