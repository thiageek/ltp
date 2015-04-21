package view;

import javax.swing.JOptionPane;

public class JanelaMaisProduto {

	private JOptionPane janela;
	private boolean maisProduto;
	
	public JanelaMaisProduto() {
		setJanela(new JOptionPane());
		this.exibeJanela();
	}
	
	public JanelaMaisProduto(boolean maisProduto) {
		setMaisProduto(maisProduto);
	}
	
	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}
	
	public boolean isMaisProduto() {
		return maisProduto;
	}
	
	public void setMaisProduto(boolean maisProduto) {
		this.maisProduto = maisProduto;
	}
	
	public void exibeJanela() {
		setBooleanMaisProduto(getJanela().showInputDialog(null, "Deseja adicionar mais um produto? (S)im ou (N)ão:"));
	}
	
	public void setBooleanMaisProduto(String maisProduto) {
		if(maisProduto.equalsIgnoreCase("s") || maisProduto.equalsIgnoreCase("sim")) {
			setMaisProduto(true);
		} else {
			setMaisProduto(false);
		}
	}
	
}
