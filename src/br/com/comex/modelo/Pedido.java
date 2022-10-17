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
public void setId(int id) {
	Id = id;
}
public String getDt_emissao() {
	return dt_emissao;
}

public Cliente getCliente() {
	return cliente;
}

public Pedido( String dt_emissao, Cliente cliente) {


	this.dt_emissao = dt_emissao;
	this.cliente = cliente;
	
}





public  void printPedido () {
	System.out.println("|"+ getId()+"|"+ getCliente().Nome+"|"+ getDt_emissao() );
	System.out.println();
}

  @Override
	public String toString() {
		
		return String.format(" ID pedido:%d ,  Data Emissao: %s , Id Cliente: %d  " ,getId(),getDt_emissao() 
			, getCliente().getId());
	}
   
}
