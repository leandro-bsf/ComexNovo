package br.com.comex.MainCliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.ClienteDao.ClienteDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Estados;

public class insereCliente {

	public static void main(String[] args) throws SQLException {
		Cliente leandro = new Cliente("Leandro","09090520", "46916556565", "Rua tenente camargo", "750", "predio branco", "centro",
				"Francisco beltrao", Estados.PR  );
		
		Connection conexao = new ConnectionFactory().testaConexao();
		ClienteDao clienteDao = new ClienteDao(conexao);
		clienteDao.insereCliente(leandro);
		conexao.close();
		
	}

}
