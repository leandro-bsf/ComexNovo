package br.com.comex.csv;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

public class TotalCategorias extends PedidoCsv {
     int TotalCategoria =0;
     String nome;
     ArrayList <String> cat = new ArrayList<String>();
     
    public void TotalCategoria(String categoria) {
    	 this.nome = categoria;	
     	cat.add(nome);
 		
 	}
	

	public void somacat()
	{
	Set<String>outra   = new HashSet<String>(cat);	
		for(String it: outra) {
			TotalCategoria++;
	}
	System.out.println("Total  de Categorias unicas: "+ TotalCategoria);
	}
	
	
     
     



	
}
