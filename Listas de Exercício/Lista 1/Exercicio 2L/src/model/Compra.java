package model;

import java.util.ArrayList;

public class Compra {

	private ArrayList<Produto> produtos;
	private float precoFinal;
	
	public Compra() {
		setProdutos(new ArrayList<Produto>());
		setPrecoFinal(0);
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public float getPrecoFinal() {
		return precoFinal;
	}
	
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	public void addProduto(Produto produto) {
		getProdutos().add(produto);
		addPrecoFinal(produto.getPreco() * this.calculaDesconto(produto.getPorcentagemDesconto()));
	}

	private void addPrecoFinal(float preco) {
		setPrecoFinal(getPrecoFinal() + preco);
	}
	
	public float calculaDesconto(int porcentagem) {
		float porcentagemFloat = new Float(porcentagem);
		return (100 - porcentagemFloat) / 100;
	}
	
}
