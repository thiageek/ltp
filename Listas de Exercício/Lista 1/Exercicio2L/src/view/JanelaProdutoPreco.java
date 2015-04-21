package view;

import javax.swing.JOptionPane;

public class JanelaProdutoPreco {

	private JOptionPane janela;
	private float preco;
	
	public JanelaProdutoPreco(int quantidade) {
		setJanela(new JOptionPane());
		this.exibeJanela(quantidade);
	}
	
	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void exibeJanela(int quantidade) {
		setPreco(Float.parseFloat(getJanela().showInputDialog(null, "Digite o preço do produto "+quantidade+":")));
	}
	
}
