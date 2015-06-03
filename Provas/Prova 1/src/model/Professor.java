package model;

public class Professor {

	private String nome;
	private int[] semestres;
	
	public Professor(String nome, int[] semestres) {
		setNome(nome);
		setSemestres(semestres);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int[] getSemestres() {
		return semestres;
	}
	public void setSemestres(int[] semestres) {
		this.semestres = semestres;
	}
}
