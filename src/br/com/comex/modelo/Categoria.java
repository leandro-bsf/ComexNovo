package br.com.comex.modelo;

public  class Categoria {

      private int Id;
	  private String Descricao;
      private String Status = "inativa" ;
	  private static int cont = 0;
	public  Categoria(String descricao, String status) {
		
		status = status.toUpperCase();
		
		  ++cont;
		  if(descricao.length() <= 3 || descricao == null) {
			  throw new IllegalArgumentException("Descricao deve ter mais que 3 caracteres e nao pode ser NULL");
			  
		  }
		  if(status != "ATIVA" &&  status != "INATIVA") {
			  throw new IllegalArgumentException("Status da Cetegoria deve ser apenas ATIVA OU INATIVA!"); 
		  }
		  
		Descricao = descricao;
		Status = status;
		Id = cont;
	  
		//System.out.println("Cadastrou com Sucesso!");
	}

	
	public Categoria(int id, String descricao, String status) {
		status = status.toUpperCase();
	
		  ++cont;
		  if(descricao.length() <= 3 || descricao == null) {
			  throw new IllegalArgumentException("Descricao deve ter mais que 3 caracteres e nao pode ser NULL");
			
			  
		  }
		  if(status != "ATIVA" &&  status != "INATIVA") {
			  throw new IllegalArgumentException("Status da Cetegoria deve ser apenas ATIVA OU INATIVA!"); 
		  }
		  if(id != cont) {
			  throw new IllegalArgumentException("Numero do id nao pode ser menor que "+cont); 
		  }
		  
		Descricao = descricao;
		Status = status;
		Id = cont;
	  
		System.out.println("Cadastrado com sucesso!");
	}


	public int getId() {
		return Id;
	}
    public void setId(int id) {
		this.Id = id;
	}
	

	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public String getAtiva() {
		return Status;
	}
	public void setAtiva(String ativa) {
		Status = ativa;
	}
	public void  print () {
		System.out.printf("id: %d - Descricao: %s  - Situacao: %s \n ", getId() , getDescricao() , getAtiva());
	}


	 
}
