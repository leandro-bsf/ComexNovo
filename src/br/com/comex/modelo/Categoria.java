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

	
	public Categoria(int id, String descricao, String status) {
		status = status.toUpperCase();  
		Descricao = descricao;
		Status = status;
		
		System.out.println("Cadastrado com sucesso!");
	}


	public int getId() {
		return Id;
	}
    public void setId(long l) {
		this.Id = (int) l;
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
   public String toString() {
	   return String.format("ID: %s - Nome: %S -  Status :%S", 
			   this.Id , this.Descricao , this.Status);
   }

	 
}
