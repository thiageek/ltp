package model;

public class Pessoa {
	
	private int idade;
	private String sexo;
	
	

	public Pessoa(int idade, String sexo) {
		setIdade(idade);
		setSexo(sexo);
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String verificaAptidao() {
		if(verificaIdade() == true && verificaSexo() == true){
			return "Verdadeiro";
		}
		else return "False";
		
	}
	
	public boolean verificaIdade() {
		if(getIdade() > 17 && getIdade() < 28){
			return true;
		}
		else return false;
	}
	
	public boolean verificaSexo() {
		if(getSexo().equalsIgnoreCase("Masculino")){
		return true;
	}
	else return false;
	}
}
