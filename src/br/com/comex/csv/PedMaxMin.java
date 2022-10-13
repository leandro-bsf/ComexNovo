package br.com.comex.csv;

import java.util.Comparator;

public class PedMaxMin implements Comparator<PedidoCsv> {
		PedidoCsv ped = new  PedidoCsv();
	
	@Override
	public int compare(PedidoCsv p1, PedidoCsv p2) {
		 double totalPd1 = Double.parseDouble(p1.getPreco()) * Integer.parseInt(p1.getQuantidade());
		 double totalPd2 = Double.parseDouble(p2.getPreco()) * Integer.parseInt(p2.getQuantidade());
		  if(totalPd1 == totalPd2){
			  return 0;
		  }
		  if(totalPd1 > totalPd2){
			  return 1;
		  }else {
			  return -1;
		  }
	}
}
