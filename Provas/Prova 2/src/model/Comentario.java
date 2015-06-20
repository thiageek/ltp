package model;

public class Comentario {

	private String comentario;
	private Postagem postagem;
	private Usuario usuario;
	
	public Comentario(String comentario, Postagem postagem, Usuario usuario) {
		setComentario(comentario);
		setPostagem(postagem);
		setUsuario(usuario);
	}
	
	public String getComentario() {
		return this.comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Postagem getPostagem() {
		return this.postagem;
	}
	
	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
