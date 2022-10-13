package br.com.comex.main.copy;

import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.Pedido;

public class MainPedido {

	public static void main(String[] args) {
		Cliente ana = new Cliente("Ana", "090524555" , "4691255555", "Rua antonina", "520", "Proximo a Sorveteria", "CEntro", "FC. Beltrao", "Parana");
		Cliente eli = new Cliente("Eli", "090524556" , "4691255566", "Rua alagoas", "1550", "Proximo a mercado", "CEntro", "FC. Beltrao", "Parana");
		Cliente gabi = new Cliente("Gabi", "090524557" , "4691255577", "Rua argentina", "1350", "Proximo a bar", "CEntro", "FC. Beltrao", "Parana");
        
		Pedido P1 = new Pedido ("09/09/2022" , ana);
        Pedido P2 = new Pedido ("25/10/2022" , eli);
        Pedido P3 = new Pedido ("15/06/2022" , gabi);
        P1.printPedido();
        P2.printPedido();
        P3.printPedido();
    
  
	  
		
	}

}