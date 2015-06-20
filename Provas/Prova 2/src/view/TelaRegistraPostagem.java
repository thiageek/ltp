package view;

import javax.swing.JOptionPane;

public class TelaRegistraPostagem {

	private String titulo;
	private String conteudo;
	private String categoria;
	
	public TelaRegistraPostagem() {
		recebeDados();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getConteudo() {
		return this.conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	private void recebeDados() {
		setTitulo(JOptionPane.showInputDialog("Digite o título da postagem:"));
		setConteudo(JOptionPane.showInputDialog("Digite o conteúdo da postagem:"));
		setCategoria(JOptionPane.showInputDialog("Digite a categoria da postagem:"));
	}
	
}
