package br.com.comex.modelo;

public class Produto {
		protected int id ;
		protected static int cont;
		protected  int quantidade;
		protected String Nome, Descricao;
		protected Float Preco;
		Categoria categoria;
		
		
		public Produto( String nome, String descricao, Float preco,int quantidade , Categoria categoria) {
			++cont;
			this.id = cont;
			 if(id != cont) {
				  throw new IllegalArgumentException("Numero do id nao pode ser diferente que:  " +cont); 
			  }
			 if(quantidade < 1) {
				  throw new IllegalArgumentException("Quantidade deve ser maior que 0!");
				  
			  }
			  if(nome.length() <= 5 || nome == null) {
				  throw new IllegalArgumentException("Descricao deve ter mais que 5 caracteres e nao pode ser NULL");
				  
			  }
			  if(preco == 0.0) {
				  throw new IllegalArgumentException("Valor deve ser maior que 0!");
				  
			  }
			 
			  if(categoria  == null ) {
				  throw new IllegalArgumentException("O Produto deve ter uma categoria!");
				  
			  }
			
			this.quantidade = quantidade;
			Nome = nome;
			Descricao = descricao;
			Preco = preco;
			this.categoria = categoria;
		}
		public Produto(int id, int quantidade, String nome, String descricao, Float preco, Categoria categoria) {
			++cont;
			 if(id != cont) {
				  throw new IllegalArgumentException("Numero do id nao pode ser diferente que:  " +cont); 
			  }
			 if(quantidade < 1) {
				  throw new IllegalArgumentException("Quantidade deve ser maior que 0!");
				  
			  }
			  if(nome.length() <= 5 || nome == null) {
				  throw new IllegalArgumentException("Descricao deve ter mais que 5 caracteres e nao pode ser NULL");
				  
			  }
			  if(preco == 0.0) {
				  throw new IllegalArgumentException("Valor deve ser maior que 0!");
				  
			  }
			 
			  if(categoria  == null ) {
				  throw new IllegalArgumentException("O Produto deve ter uma categoria!");
				  
			  }
			this.id = id;
			this.quantidade = quantidade;
			Nome = nome;
			Descricao = descricao;
			Preco = preco;
			this.categoria = categoria;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public String getNome() {
			return Nome;
		}
		public void setNome(String nome) {
			Nome = nome;
		}
		public String getDescricao() {
			return Descricao;
		}
		public void setDescricao(String descricao) {
			Descricao = descricao;
		}
		public Float getPreco() {
			return Preco;
		}
		public void setPreco(float d) {
			Preco = d;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		public  void calcula_estoque() {
			
			float subtotal =+ getPreco() * getQuantidade();
			System.out.printf( "|"+ getId()+"|  "+getNome() +"|"+ getPreco()+"|   "+ getQuantidade()+ "   |"+subtotal);
			 System.out.println();
		}
		public void calcula_imposto () {
			float imposto;
			imposto = (float) (getPreco()*0.4);
			
			System.out.printf( "|"+ getId()+"|  "+getNome() +"|   "+ getPreco()+"|"+imposto);
			 System.out.println();
		}
		public void print () {
			
			System.out.printf(
					"|  "+getId()+"|"+ getNome()+"|"+getDescricao()+"|  "+getPreco() +"   |    "+ getQuantidade() +"      |   "+getCategoria().getDescricao());
			 System.out.println();

		}
		 
		 
}
