package view;

import javax.swing.JOptionPane;

public class JanelaProdutoNome {

	private JOptionPane janela;
	private String nome;
	
	public JanelaProdutoNome(int quantidade) {
		setJanela(new JOptionPane());
		this.exibeJanela(quantidade);
	}
	
	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibeJanela(int quantidade) {
		setNome(getJanela().showInputDialog(null, "Digite o nome do produto "+quantidade+":"));
	}
	
}
