package view;

import javax.swing.JOptionPane;

public class JanelaQuantidadeCombustivel {
	
	private JOptionPane janelaAtual;
	private double qntCombustivel;
	
	public JanelaQuantidadeCombustivel() {
		this.janelaAtual = new JOptionPane();
		String qntCombustivel = this.janelaAtual.showInputDialog(null, "Insira a quantidade de combustivel:");
		double qntCombustivelNum = Double.parseDouble(qntCombustivel);
		this.setQntCombustivel(qntCombustivelNum);	
	}

	public double getQntCombustivel() {
		return qntCombustivel;
	}

	public void setQntCombustivel(double qntCombustivel) {
		this.qntCombustivel = qntCombustivel;
	}

	public JOptionPane getJanelaAtual() {
		return janelaAtual;
	}

	public void setJanelaAtual(JOptionPane janelaAtual) {
		this.janelaAtual = janelaAtual;
	}
	
	public void apresentarQuantidadeCombustivel() {
		this.janelaAtual.showMessageDialog(null, this.getQntCombustivel());
	}
	
	
	
	
	
	

	

}
