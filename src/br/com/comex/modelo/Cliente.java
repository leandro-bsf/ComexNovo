package br.com.comex.modelo;

import javax.xml.bind.annotation.XmlRootElement;


public class Cliente {
  int Id ;
  String Nome , Cpf, Telefone , Rua,Numero,Complemento, Bairro, Cidade ;
  Status status;
  Estados ufs;
  
  public void setId(int id) {
	Id = id;
}



public Cliente( String nome, String cpf, String telefone, String rua, String numero, String complemento,
			String bairro, String cidade, Estados estado) {
		super();
		   numero = numero.toUpperCase();
		 
		/*  if(nome.length() <= 5 || nome == null) {
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
			  
		  }*/
		 
		Nome = nome;
		Cpf = cpf;
		Telefone = telefone;
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
		Bairro = bairro;
		Cidade = cidade;
		
		this.ufs = estado;
		this.status= status;
	}




	public String getNome() {
	return Nome;
}
public Cliente (int id) {
	this.Id = id;
}


public void setNome(String nome) {
	Nome = nome;
}



public String getCpf() {
	return Cpf;
}



public void setCpf(String cpf) {
	Cpf = cpf;
}



public String getTelefone() {
	return Telefone;
}



public void setTelefone(String telefone) {
	Telefone = telefone;
}



public String getRua() {
	return Rua;
}



public void setRua(String rua) {
	Rua = rua;
}



public String getNumero() {
	return Numero;
}



public void setNumero(String numero) {
	Numero = numero;
}



public String getComplemento() {
	return Complemento;
}



public void setComplemento(String complemento) {
	Complemento = complemento;
}



public String getBairro() {
	return Bairro;
}



public void setBairro(String bairro) {
	Bairro = bairro;
}



public String getCidade() {
	return Cidade;
}



public void setCidade(String cidade) {
	Cidade = cidade;
}



public Status getStatus() {
	return status;
}



public void setStatus(Status status) {
	this.status = status;
}



public Estados getUfs() {
	return ufs;
}



public void setUfs(Estados ufs) {
	this.ufs = ufs;
}



public int getId() {
	return Id;
}



	public Cliente(int id ,String nome, String cpf, String telefone, String rua, String numero, String complemento, String bairro,
		String cidade) {
	super();
	Nome = nome;
	Cpf = cpf;
	Telefone = telefone;
	Rua = rua;
	Numero = numero;
	Complemento = complemento;
	Bairro = bairro;
	Cidade = cidade;
	//this.ufs = ufs;
}
	

	public Cliente () {
		
	}

@Override
public String toString() {
	return "Cliente [Id=" + Id + ", Nome=" + Nome + ", Cpf=" + Cpf + ", Telefone=" + Telefone + ", Rua=" + Rua
			+ ", Numero=" + Numero + ", Complemento=" + Complemento + ", Bairro=" + Bairro + ", Cidade=" + Cidade
			+ ", status=" + status + ", ufs=" + ufs + "]";
}

}
