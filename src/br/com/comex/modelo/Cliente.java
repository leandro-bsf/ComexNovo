package br.com.comex.modelo;

public class Cliente {
  private int Id ;
  String Nome , Cpf, Telefone , Rua,Numero,Complemento, Bairro, Cidade ;
  Status status;
  Estados ufs;
  
  public Cliente( String nome, String cpf, String telefone, String rua, String numero, String complemento,
			String bairro, String cidade, Estados estado, Status status) {
		super();
		   numero = numero.toUpperCase();
		 
		  if(nome.length() <= 5 || nome == null) {
			  throw new IllegalArgumentException("nome deve ter mais 5 caracteres");
			  
		  }
		  if(cpf.length() <= 11 || cpf.length() >=14) {
			  throw new IllegalArgumentException("Cpf deve ter entre 11 e 15 numeros!");
			  
		  }
		  if(telefone.length() <= 11 || telefone.length() >=16) {
			  throw new IllegalArgumentException("Telefone deve conter de 11 as 16  numeros");
			  
		  }
		  if(rua.length() <=   5 ) {
			  throw new IllegalArgumentException("Rua deve ter mais 5 caracteres");
			  
		  }
		  if( numero.length() < 
				  1   ||  !numero.equals("S/N") ) {
			  throw new IllegalArgumentException("Deve ser numero ou  (S/N).");
			  
		  }
		  if(cidade.length() <=   1 ) {
			  throw new IllegalArgumentException("Cidade deve ter mais  que 1 caracterer");
			  
		  }
		 
		Nome = nome;
		Cpf = cpf;
		Telefone = telefone;
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
		Bairro = bairro;
		Cidade = cidade;
		
		this.ufs = estado;
		this.status = status;
	}

	public Cliente(String string, String string2, String string3, String string4, String string5, String string6,
		String string7, String string8, String string9) {
	// TODO Auto-generated constructor stub
}

	public int getId() {
	return Id;
}

public String getNome() {
	return Nome;
}

public String getCpf() {
	return Cpf;
}

public String getTelefone() {
	return Telefone;
}

public String getRua() {
	return Rua;
}

public String getNumero() {
	return Numero;
}

public String getComplemento() {
	return Complemento;
}

public String getBairro() {
	return Bairro;
}

public String getCidade() {
	return Cidade;
}



public Estados getUfs() {
	return ufs;
}

public void setUfs(Estados ufs) {
	this.ufs = ufs;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public void PrintCliente() {

	System.out.printf("|"+ getId()+"|"+ getNome() +"|"+  getCpf() +"|"+ getTelefone() +"|"+  getRua() +"|"+  getNumero() +"|"+ 
			getComplemento()+"|"+ getBairro() +"|"+ getCidade() +"|"+ getUfs());
	
	System.out.println();
	System.out.println("Cliente Inserido!\n");
	
}

}
