package model;

import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	private String id;
	private int idade;
	private Nivel nivel;
	private ArrayList<Habilidade> habilidades;
	private String senha;
	
	public String getNome(){
		return this.nome;
	}
	
	public String getId(){
		return this.id;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public Nivel getNivel(){
		return this.nivel;
	}
	
	public ArrayList<Habilidade> getHabilidades(){
		return this.habilidades;
	}
	
	public String getSenha(){
		return this.senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public void setId(String id) {
		this.id = id;
		
	}
	public void setIdade(int idade) {
		this.idade = idade;
		
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
		
	}
	
	public void setHabilidades(ArrayList<Habilidade> h){
		this.habilidades = h;
	}	
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
