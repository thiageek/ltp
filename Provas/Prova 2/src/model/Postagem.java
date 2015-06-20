package model;

public class Postagem {

	private String titulo;
	private String conteudo;
	private String categoria;
	
	public Postagem(String titulo, String conteudo, String categoria) {
		setTitulo(titulo);
		setConteudo(conteudo);
		setCategoria(categoria);
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
	
	public String postagemToString() {
		return getTitulo() + "#"
				+ getConteudo() + "#"
				+ getCategoria();
	}
	
	public String toString() {
		return  "\nTítulo: " + getTitulo() + "\n"
				+ "Conteúdo: " + getConteudo() + "\n"
				+ "Categoria: " + getCategoria() + "\n";
	}
	
}
