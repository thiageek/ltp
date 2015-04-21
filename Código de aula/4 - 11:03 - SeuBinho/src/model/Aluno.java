package model;

import java.util.ArrayList;

public class Aluno {
	
	private Nome nome;
	private String id;
	private int idade;
	private Nivel nivel;
	private ArrayList<Habilidade> habilidades;
	private String senha;
	
	public Aluno(Nome nome, String id) {
		setNome(nome);
		setId(id);
	}
	
	public Aluno(Nome nome, String senha, ArrayList<Habilidade> habilidades) {
		setNome(nome);
		setSenha(senha);
		setHabilidades(habilidades);
	}
	
	public Aluno(Nome nome, Nivel nivel, ArrayList<Habilidade> habilidades) {
		setNome(nome);
		setNivel(nivel);
		setHabilidades(habilidades);
	}
	public Aluno(Nome nome, Nivel nivel, ArrayList<Habilidade> habilidades, String senha, String id, int idade) {
		setNome(nome);
		setNivel(nivel);
		setHabilidades(habilidades);
		setId(id);
		setSenha(senha);
		setIdade(idade);
		
	}

	public Aluno(Nome nome) {
		setNome(nome);
		
	}
	
	public Aluno(Nome nome, String id, int idade) {
		setNome(nome);
		setId(id);
		setIdade(idade);
		
	}
	
	public Aluno(String id) {
		setId(id);
	}
	
	public String getNomeToString() {
		return this.nome.getNome();
	}
	
	public Nome getNome(){
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
	
	public void setNome(Nome nome) {
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
