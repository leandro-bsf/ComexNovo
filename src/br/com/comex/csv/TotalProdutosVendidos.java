package br.com.comex.csv;

import java.text.NumberFormat;

public class TotalProdutosVendidos extends PedidoCsv {
	   int total;
		 
		 public void  TotalProdutosVendidos(String  Quantidade) {
			
			 int qtd =  Integer.parseInt(Quantidade);
			 total += qtd;
			 
		 }
		 
		 public void calcTotal() {
			 System.out.println("Total de Produtos Vendido: " +total);
		 }

		
		
		

}
