package view;

import javax.swing.JOptionPane;

public class JanelaQuantidadeCombustivel {
	private JOptionPane janelaAtual;
	private double qntCombustivel;
	
	public JanelaQuantidadeCombustivel() {
		this.janelaAtual = new JOptionPane();
		String qntCombustivel = this.janelaAtual.showInputDialog(null, "Insera a quantidade de combustivel");
		double qntCombustivelNum = Double.parseDouble(qntCombustivel);
		this.setQntCombustivel(qntCombustivelNum);
	}
	public JOptionPane getJanelaAtual() {
		return janelaAtual;
	}
	public void setJanelaAtual(JOptionPane janelaAtual) {
		this.janelaAtual = janelaAtual;
	}
	public double getQntCombustivel() {
		return qntCombustivel;
	}
	public void setQntCombustivel(double qntCombustivel) {
		this.qntCombustivel = qntCombustivel;
	}
	public void apresentarQuantidadeCombustivel(){
		this.janelaAtual.showMessageDialog(null, this.getQntCombustivel());
	}

}
