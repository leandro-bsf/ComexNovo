package br.com.comex.modelo;

public  class Categoria {

      private int Id;
	  private String Descricao;
      private String Status = "inativa" ;
	  
	public  Categoria(String descricao, String status) {
		
		status = status.toUpperCase(); 
		Descricao = descricao;
		Status = status;
		
		
	}
  public Categoria(int id) {
	  
  }
	public Categoria(int id, String descricao, String status) {
		status = status.toUpperCase();  
		Descricao = descricao;
		Status = status;
		this.Id = id;
		
	}

 @Override
   public String toString() {
	   return String.format("ID: %s - Nome: %S -  Status :%S \n", 
			   this.Id , this.Descricao , this.Status);
   }

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getDescricao() {
	return Descricao;
}

public void setDescricao(String descricao) {
	Descricao = descricao;
}

public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
}





	 
}
