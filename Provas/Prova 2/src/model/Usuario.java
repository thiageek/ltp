package model;

import java.util.ArrayList;

public class Usuario {

	private String username;
	private String email;
	private String senha;
	private ArrayList<Postagem> postagens;
	
	public Usuario(String username, String email, String senha) {
		setUsername(username);
		setEmail(email);
		setSenha(senha);
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public ArrayList<Postagem> getPostagens() {
		return this.postagens;
	}

	public void setPostagens(ArrayList<Postagem> postagens) {
		this.postagens = postagens;
	}
	
}
