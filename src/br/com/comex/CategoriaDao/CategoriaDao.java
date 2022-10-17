package br.com.comex.CategoriaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.comex.modelo.Categoria;

public class CategoriaDao {
    private Connection conexao; 
    
    public CategoriaDao(Connection conexao) {
    	this.conexao = conexao;
    }
    
    public void insere(Categoria categoria) throws SQLException {
    	
    	  String sql = "INSERT INTO  comex.categoria (NOME, STATUS) values(?, ?)";
   	  
     	String[] colunaParaRetornar = { "id" };
      	PreparedStatement comando = conexao.prepareStatement(sql, colunaParaRetornar);
     	comando.setString(1,categoria.getDescricao());
	    comando.setString(2,categoria.getStatus());
	    comando.execute();
	    ResultSet rs = comando.getGeneratedKeys();
		rs.next();
		categoria.setId(rs.getInt(1));
		comando.close();
    }
    public List<Categoria> listaCategorias() throws SQLException{
    	  PreparedStatement comandoPreparado = conexao.prepareStatement("select *from comex.categoria");
    		List<Categoria> categorias = new ArrayList<Categoria>();
    		ResultSet registros = comandoPreparado.executeQuery();
    		while(registros.next()) {
    			categorias.add(this.populaCategoria(registros));
    		}
    	
    		
    	
	  
	   registros.close();
	   return categorias;
    }
    public void ExcluirCategoria(int id ) throws SQLException {
    	
 	 String  sql = "delete from comex.categoria where id = ?";
 	
 	 PreparedStatement ps = conexao.prepareStatement(sql);
 	
 	 ps.setInt(1, id);
 	 ps.execute();
 	 ps.close();
 	 System.out.println("Categoria Excluida!");
 		
    }
    public void atualizar(Categoria categoria) throws SQLException {
    	 String sql = "update comex.categoria set descricao = ?  status = ?";
    	 PreparedStatement ps = conexao.prepareStatement(sql);
    	 ps.setString(1, categoria.getDescricao());
    	 ps.setString(2, categoria.getStatus());
    	 ps.execute();
    	 ps.close();
    			 
    	
    }
    public Categoria populaCategoria(ResultSet registro) throws SQLException {
    	 Categoria categoria  = new Categoria(
    			 	registro.getInt("id"),
    			 	registro.getString("nome"),
    			 	registro.getString("Status")
    			 );
    	 categoria.setId(registro.getInt("id"));
		return categoria;
    			 
    }
    public Categoria buscaPorId(int id) throws SQLException {
    	String sql = "select *from comex.Categoria where id = ?";
    	
    	
    	try(PreparedStatement ps = this.conexao.prepareStatement(sql)){
    		ps.setInt(1,  id);
    		try(ResultSet registro = ps.executeQuery()){
    			 Categoria categoria = null;
    			 if(registro.next()) {
    				 categoria = this.populaCategoria(registro);
    			 }
    			 return categoria;
    		}
    	}
			
    }
    public void  altera(Categoria categoria) throws SQLException {

       String sql = "UPDATE COMEX.CATEGORIA SET NOME = ? , STATUS = ? WHERE ID = ?";
       PreparedStatement ps = conexao.prepareStatement(sql);
       ps.setString(1, categoria.getDescricao());
       ps.setString(2, categoria.getStatus());
       ps.setInt(3, categoria.getId());
       ps.execute();
       ps.close();
    	
    }
   
}
