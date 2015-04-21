package view;

import javax.swing.JOptionPane;

public class JanelaProdutoPorcentagemDesconto {

	private JOptionPane janela;
	private int porcentagem;
	
	public JanelaProdutoPorcentagemDesconto(int quantidade) {
		setJanela(new JOptionPane());
		this.exibeJanela(quantidade);
	}
	
	public JanelaProdutoPorcentagemDesconto() {
		setPorcentagem(0);
	}

	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}

	public int getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}

	public void exibeJanela(int quantidade) {
		setPorcentagem(Integer.parseInt(getJanela().showInputDialog(null, "Digite a porcentagem de desconto do produto "+quantidade+":")));
	}
	
}
