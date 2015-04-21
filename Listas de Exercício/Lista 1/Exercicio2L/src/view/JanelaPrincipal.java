package view;

import control.CompraControl;

public class JanelaPrincipal {

	private JanelaMaisProduto janelaMaisProduto;
	private JanelaProduto janelaProduto;
	
	private CompraControl cc;
	
	public JanelaPrincipal() {
		setJanelaMaisProduto(new JanelaMaisProduto(true));
		setCc(new CompraControl());
		this.exibeJanelas();
	}

	public JanelaMaisProduto getJanelaMaisProduto() {
		return janelaMaisProduto;
	}
	
	public void setJanelaMaisProduto(JanelaMaisProduto janelaMaisProduto) {
		this.janelaMaisProduto = janelaMaisProduto;
	}

	public JanelaProduto getJanelaProduto() {
		return janelaProduto;
	}

	public void setJanelaProduto(JanelaProduto janelaProduto) {
		this.janelaProduto = janelaProduto;
	}

	public CompraControl getCc() {
		return cc;
	}

	public void setCc(CompraControl cc) {
		this.cc = cc;
	}

	private void exibeJanelas() {
		int contador = 1;
		while (getJanelaMaisProduto().isMaisProduto()) {
			setJanelaProduto(new JanelaProduto(contador));
			getCc().addProduto(
					getJanelaProduto().getJanelaProdutoPreco().getPreco(),
					getJanelaProduto().getJanelaProdutoNome().getNome(),
					getJanelaProduto().getJanelaProdutoId().getId(),
					getJanelaProduto().getJanelaProdutoPromocional().isPromocional(),
					getJanelaProduto().getJanelaProdutoPorcentagemDesconto().getPorcentagem()
					);;
			setJanelaMaisProduto(new JanelaMaisProduto());
			contador++;
		}
		getCc().exibePrecoFinal();
	}
	
}
