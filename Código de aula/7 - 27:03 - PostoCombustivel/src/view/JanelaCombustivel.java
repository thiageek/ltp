package view;

import javax.swing.JOptionPane;

public class JanelaCombustivel {

	private JOptionPane janelaAtual;
	private String combustivel;

	public JanelaCombustivel() {
		this.janelaAtual = new JOptionPane();
		String combustivel = this.janelaAtual.showInputDialog(null, "Insera o tipo de combustivel");
		this.setCombustivel(combustivel);
		

	}

	public JOptionPane getJanelaAtual() {
		return janelaAtual;
	}

	public void setJanelaAtual(JOptionPane janelaAtual) {
		this.janelaAtual = janelaAtual;
	}
	
	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void apresentarValorCombustivel(){
		this.janelaAtual.showMessageDialog(null, this.getCombustivel());
	}

}
