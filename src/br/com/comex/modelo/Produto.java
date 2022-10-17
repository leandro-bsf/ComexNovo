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
		
		
		
		public Produto(int int1, String string, String string2, float float1, int int2, Categoria categoria2,
				String string3) {
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
	
         
		 
	
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setPreco(Float preco) {
			Preco = preco;
		}
		@Override
		public String toString() {
		
		return "ID " + getId() 
        + "| Nome: " + getNome() + " " 
       + "| Descrição: " + getDescricao() + " "
        + "| Preço: " + this.Preco + " "
        + "| Quantidade: " + this.quantidade + " "
        + "| Categoria: " +  getCategoria() + " "
       +System.lineSeparator();
		}
	
		
		
}
