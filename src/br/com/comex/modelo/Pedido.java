package br.com.comex.modelo;

public class Pedido {
   private static int cont;
   private int Id;
   private String dt_emissao;
   Cliente cliente;
public static int getCont() {
	return cont;
}

public int getId() {
	return Id;
}

public String getDt_emissao() {
	return dt_emissao;
}

public Cliente getCliente() {
	return cliente;
}

public Pedido( String dt_emissao, Cliente cliente) {
	++cont;
	Id = cont;
	this.dt_emissao = dt_emissao;
	this.cliente = cliente;
}


public  void printPedido () {
	System.out.println("|"+ getId()+"|"+ getCliente().Nome+"|"+ getDt_emissao() );
	System.out.println();
}
   
   
}
