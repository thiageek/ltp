package control;

import view.JanelaCompraPrecoFinal;
import model.Compra;
import model.Produto;

public class CompraControl {

	private Compra compra;
	
	public CompraControl() {
		setCompra(new Compra());
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public void addProduto(float preco, String nome, String id, boolean promocional, int porcentagemDesconto) {
		Produto produto = new Produto(preco, nome, id, promocional, porcentagemDesconto);
		getCompra().addProduto(produto);
	}
	
	public void exibePrecoFinal() {
		JanelaCompraPrecoFinal janelaCompraPrecoFinal = new JanelaCompraPrecoFinal(getCompra().getPrecoFinal());
	}
	
}
