package model;

public class Pessoa {
	
	private double altura;
	private Boolean temPermissao;
	private Boolean temDisponibilidade;
	private String cpf;
	
	public void pegarEscada(Escada e) {
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Boolean getTemPermissao() {
		return this.temPermissao;
	}

	public void setTemPermissao(Boolean temPermissao) {
		this.temPermissao = temPermissao;
	}

	public Boolean getTemDisponibilidade() {
		return this.temDisponibilidade;
	}

	public void setTemDisponibilidade(Boolean temDisponibilidade) {
		this.temDisponibilidade = temDisponibilidade;
	}

	public String getCPF() {
		return this.cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	

}
