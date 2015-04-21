package model;

public class Nome {
	
	private String nome;
	
	public Nome(String nome) {
		setNome(nome);
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

}
