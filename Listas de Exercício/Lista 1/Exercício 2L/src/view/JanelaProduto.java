package view;

public class JanelaProduto {

	private JanelaProdutoPreco janelaProdutoPreco;
	private JanelaProdutoNome janelaProdutoNome;
	private JanelaProdutoId janelaProdutoId;
	private JanelaProdutoPromocional janelaProdutoPromocional;
	private JanelaProdutoPorcentagemDesconto janelaProdutoPorcentagemDesconto;
	
	public JanelaProduto(int quantidade) {
		this.exibeJanelas(quantidade);
	}

	public JanelaProdutoPreco getJanelaProdutoPreco() {
		return janelaProdutoPreco;
	}
	
	public void setJanelaProdutoPreco(JanelaProdutoPreco janelaProdutoPreco) {
		this.janelaProdutoPreco = janelaProdutoPreco;
	}
	
	public JanelaProdutoNome getJanelaProdutoNome() {
		return janelaProdutoNome;
	}
	
	public void setJanelaProdutoNome(JanelaProdutoNome janelaProdutoNome) {
		this.janelaProdutoNome = janelaProdutoNome;
	}
	
	public JanelaProdutoId getJanelaProdutoId() {
		return janelaProdutoId;
	}
	
	public void setJanelaProdutoId(JanelaProdutoId janelaProdutoId) {
		this.janelaProdutoId = janelaProdutoId;
	}
	
	public JanelaProdutoPromocional getJanelaProdutoPromocional() {
		return janelaProdutoPromocional;
	}
	
	public void setJanelaProdutoPromocional(
			JanelaProdutoPromocional janelaProdutoPromocional) {
		this.janelaProdutoPromocional = janelaProdutoPromocional;
	}
	
	public JanelaProdutoPorcentagemDesconto getJanelaProdutoPorcentagemDesconto() {
		return janelaProdutoPorcentagemDesconto;
	}
	
	public void setJanelaProdutoPorcentagemDesconto(
			JanelaProdutoPorcentagemDesconto janelaProdutoPorcentagemDesconto) {
		this.janelaProdutoPorcentagemDesconto = janelaProdutoPorcentagemDesconto;
	}
	
	public void exibeJanelas(int quantidade) {
		setJanelaProdutoPreco(new JanelaProdutoPreco(quantidade));
		setJanelaProdutoNome(new JanelaProdutoNome(quantidade));
		setJanelaProdutoId(new JanelaProdutoId(quantidade));
		setJanelaProdutoPromocional(new JanelaProdutoPromocional(quantidade));
		if (this.janelaProdutoPromocional.isPromocional()) {
			setJanelaProdutoPorcentagemDesconto(new JanelaProdutoPorcentagemDesconto(quantidade));
		} else {
			setJanelaProdutoPorcentagemDesconto(new JanelaProdutoPorcentagemDesconto());
		}
	}
	
}
