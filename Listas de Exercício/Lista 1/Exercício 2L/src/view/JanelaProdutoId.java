package view;

import javax.swing.JOptionPane;

public class JanelaProdutoId {

	private JOptionPane janela;
	private String id;
	
	public JanelaProdutoId(int quantidade) {
		setJanela(new JOptionPane());
		this.exibeJanela(quantidade);
	}
	
	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void exibeJanela(int quantidade) {
		setId(getJanela().showInputDialog(null, "Digite o ID do produto "+quantidade+":"));
	}
	
}
