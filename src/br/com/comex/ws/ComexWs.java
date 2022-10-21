package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.comex.Categoria.CategoriaDao;
import br.com.comex.Categoria.MainListagemCategoria;
import br.com.comex.Cliente.ClienteDao;
import br.com.comex.ConnectionFactory.ConnectionFactory;
import br.com.comex.Produto.ProdutoDao;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Produto;



@WebService
public class ComexWs {
	 Connection conexao = new ConnectionFactory().inicarConexao();
		CategoriaDao categoriadao = new CategoriaDao(conexao);
		ClienteDao clienteDao = new ClienteDao (conexao);
		ProdutoDao produtoDao  = new ProdutoDao(conexao);
	
		@WebMethod(operationName="listaCategorias")
	    @WebResult(name="categoria")
	 
		 public List<Categoria> getCategoria() throws SQLException{
		 System.out.println ("chamando getCategoria");
		
		List<Categoria> lista = categoriadao.listaCategorias();
		 
		 return lista ;
		 }
		
		@WebMethod(operationName="listaCliente")
	    @WebResult(name="cliente")
		public List<Cliente> getCliente() throws SQLException{
			System.out.println("Chamado GetCliente");
			List<Cliente> listaCliente =  clienteDao.listaTodas();
					
			return listaCliente;
			
		}
		@WebMethod(operationName="listaProduto")
	    @WebResult(name="produto")
		public List<Produto> getProduto() throws SQLException{
			System.out.println("Chamando GetProduto");
			List<Produto> listaProduto = produtoDao.listaTodas();
			return listaProduto;
			
		}
		@WebMethod(operationName="CadastrarCategoria")
	    @WebResult(name="categoria")
	public Categoria insere(@WebParam(name="categoria") Categoria categoria1 ) throws SQLException {
			System.out.println("chamando getInsereCategoria"+ categoria1);
			categoriadao.insere(categoria1);
			return categoria1;
		 
	}
		
		@WebMethod(operationName="CadastraCliente")
	    @WebResult(name="cliente")
		public Cliente  insereCliente(Cliente cliente1) throws SQLException {
			System.out.println("chamando getInsereCliente"+ cliente1);
			clienteDao.insereCliente(cliente1);
			return cliente1;
			
		}
}

