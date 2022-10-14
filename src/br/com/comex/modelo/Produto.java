package br.com.comex.modelo;

public class Produto {
		protected int id ;
	
		protected  int quantidade;
		protected String Nome, Descricao;
		protected Float Preco;
		Categoria categoria;
		 private String tipo = "inativa";
		
		
		public String getStatus() {
			return tipo;
		}
		public void setStatus(String tipo) {
			this.tipo = tipo;
		}
		public Produto( String nome, String descricao, Float preco,int quantidade , Categoria categoria,String status) {
		
			this.quantidade = quantidade;
			Nome = nome;
			Descricao = descricao;
			Preco = preco;
		
			//this.categoria = categoria;
			this.tipo =  status;
		}
		public Produto(int id , String nome, String descricao, Float preco,int quantidade , int id_categoria,String status) {
			this.id = id;
			this.quantidade = quantidade;
			Nome = nome;
			Descricao = descricao;
			Preco = preco;
			//this.categoria = categoria;
			this.tipo =  status;
		}
		
		
		public Produto(int int1, String string, String string2, String string3, String string4, String string5,
				String string6, String string7, String string8, String string9, String string10) {
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(long l) {
			this.id = (int) l;
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
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return String.format("ID: %s  - Nome: %S  - DEscricao: %S - Valor: %f  Quantidade: %s Categoria: %d   Tipo: %s",
				this.id , this.Nome , this.Descricao ,this.Preco,
         this.getCategoria().getId(), this.tipo);

		}
		 
		 
}
