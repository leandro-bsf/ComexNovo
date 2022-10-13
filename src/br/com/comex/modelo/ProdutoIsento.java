package br.com.comex.modelo;

public class ProdutoIsento extends Produto {

	 String Imposto = "Isento";
		
	
		public ProdutoIsento(String nome, String descricao, Float preco, int quantidade, Categoria categoria){
		super(nome, descricao, preco, quantidade, categoria);
		
		
	}



		public void Calcula_Imposto () {
			System.out.printf(
					"|  "+getId()+"|"+ getNome()+"|"+getDescricao()+"|  "+getPreco() +"   |    "+ getQuantidade() +"      |   "+getCategoria().getDescricao()+"  |"+Imposto);
			 System.out.println();

		}

	

}
