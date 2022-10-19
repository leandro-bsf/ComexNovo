package br.com.comex.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Produto;

public class ProdutoDao {

	private Connection conexao;
	
	public ProdutoDao(Connection conexao) {
	 	this.conexao =  conexao;
	}
	public void insere(Produto produto, Categoria categoria ) throws SQLException {
		String sql = "INSERT INTO COMEX.PRODUTO (NOME, DESCRICAO, PRECO_UNITARIO, QUANTIDADE_ESTOQUE, CATEGORIA_ID, TIPO)"
				+ "VALUES (?,?,?,?,?,?)";
		String[] colunaparaRetornar = {"id"};
		PreparedStatement comando = conexao.prepareStatement(sql , colunaparaRetornar);
		comando.setString(1,produto.getNome());
		comando.setString(2, produto.getDescricao());
		comando.setFloat(3,produto.getPreco());
		comando.setInt(4, produto.getQuantidade());
		comando.setInt(5, categoria.getId());
		comando.setNString(6, produto.getStatus());
		comando.execute();
		ResultSet rs = comando.getGeneratedKeys();
		rs.next();
		produto.setId(rs.getLong(1));
		System.out.println("Produto" + produto.getNome()+" Inserido com sucesso!");
		comando.close();
	}		
		public List<Produto> listaTodas() throws SQLException{
			
			PreparedStatement comandoPreparado = conexao.prepareStatement("select *from comex.produto");
	    	 List<Produto> produtos = new ArrayList<Produto>();
	    	 ResultSet registros = comandoPreparado.executeQuery();
	    	 while(registros.next()) {
	    		Produto produto = this.populaLista(registros);
	    		produtos.add(produto);
	    	 
	    	 }
	    	 System.out.println( produtos);
	    	 registros.close();
	    	 comandoPreparado.close();
	    	 return produtos;
	    	 	
	    }
		public void ExcluirItem(int id) throws SQLException {
			PreparedStatement stm = conexao.prepareStatement("delete from comex.produto where  id = ?");
			stm.setInt(1, id);
			stm.execute();
			Integer linhasModificada = stm.getUpdateCount();
		 	System.out.println(linhasModificada+" Registro excluidos!");
		 	stm.close();
			 
		}
		
		private Produto populaLista(ResultSet registro) throws SQLException {
			Produto produto = new Produto(
					
					registro.getString("nome"),
					registro.getString("Descricao"),
					registro.getFloat("Preco_unitario"),
					registro.getInt("Quantidade_estoque"),
					new Categoria(registro.getInt("categoria_id")),
					registro.getString("Tipo"));
			
			produto.setId(registro.getInt("id"));
			return produto;
		}


		
		
	}

