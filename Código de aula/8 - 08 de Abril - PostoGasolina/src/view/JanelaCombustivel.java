package view;

import javax.swing.JOptionPane;

import control.ControleAbastecimento;

public class JanelaCombustivel {
	
	private JOptionPane janelaAtual;
	private String input_combustivel;
	
	
	public JanelaCombustivel() {
		this.janelaAtual = new JOptionPane();
		String combustivel = this.janelaAtual.showInputDialog(null, "Insira o tipo de combustivel:");
		this.setCombustivel(combustivel);	
	}

	public JOptionPane getJanelaAtual() {
		return janelaAtual;
	}

	public void setJanelaAtual(JOptionPane janelaAtual) {
		this.janelaAtual = janelaAtual;
	}
	
	public String getCombustivel() {
		return input_combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.input_combustivel = combustivel;
	}
	
	public void apresentarValorCombustivel() {
		this.janelaAtual.showMessageDialog(null, this.getCombustivel());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
