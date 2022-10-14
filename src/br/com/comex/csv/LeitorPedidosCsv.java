package br.com.comex.csv;

import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import br.com.comex.modelo.Pedido;
import java.util.ArrayList;

import java.io.File;

public class LeitorPedidosCsv {
	 public static void main(String[] args) throws Exception {
		 
		  List<PedidoCsv> pedidos =  new ArrayList<PedidoCsv>();
		
		  TotalProdutosVendidos ProdV = new TotalProdutosVendidos();
		  TotalCategorias tc = new TotalCategorias();
		  Scanner scanner = new Scanner(new File("pedidos.csv"));
		  MontanteTotalVendas tv = new MontanteTotalVendas();
		 
		  
		  
		 
		  scanner.nextLine();
		  while(scanner.hasNext()) {
			  String linha = scanner.nextLine();
			  
			  Scanner linhaScanner = new Scanner(linha);
			  linhaScanner.useDelimiter(",");
			  String Categoria = linhaScanner.next();
			  String Produto  = linhaScanner.next();
			  String Preco  = linhaScanner.next();
			  String Quantidade = linhaScanner.next();
			  String data  = linhaScanner.next();
			  String Cliente = linhaScanner.next();
			 PedidoCsv pedido = new PedidoCsv( Categoria, Produto,Cliente, Preco, Quantidade, data );
			 pedidos.add(pedido);
		
			 ProdV.TotalProdutosVendidos(Quantidade);
			 tc.TotalCategoria(Categoria);
			 tv.MontanteTotalVendas(Preco, Quantidade);
			
		
			
			
		  }
		  
		  scanner.close();
		  
		PedMaxMin  comparator = new PedMaxMin();
		
		 tc.somacat();
		 ProdV.calcTotal();
         tv.printTV();
         pedidos.sort(comparator);
         
        
         Double produto1 = Double.parseDouble(pedidos.get(0).getPreco());
         System.out.println("Pedido mais caro: "+ NumberFormat.getCurrencyInstance().format(produto1)+"("+pedidos.get(0).getProduto()+")");
         System.out.println("Pedido mais caro: "+ pedidos.get(pedidos.size()-1).getPreco()+"("+pedidos.get(pedidos.size()-1).getProduto() +")");
         
     
         
		
		  
		  
		
		
}
}
