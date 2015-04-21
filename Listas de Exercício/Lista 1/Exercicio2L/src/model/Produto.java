package model;

public class Produto {

	private float preco;
	private String nome;
	private String id;
	private boolean promocional;
	private int porcentagemDesconto;
	
	public Produto(float preco, String nome, String id, boolean promocional, int porcentagemDesconto) {
		setPreco(preco);
		setNome(nome);
		setId(id);
		setPromocional(promocional);
		setPorcentagemDesconto(porcentagemDesconto);
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean isPromocional() {
		return promocional;
	}
	
	public void setPromocional(boolean promocional) {
		this.promocional = promocional;
	}
	
	public int getPorcentagemDesconto() {
		return porcentagemDesconto;
	}
	
	public void setPorcentagemDesconto(int porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}
	
}
