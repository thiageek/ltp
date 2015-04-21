package view;

import javax.swing.JOptionPane;

import control.ControleAbastecimento;
import database.SimulatedDatabase;

public class JanelaPrincipal {

	private JanelaCombustivel jc;
	private JanelaQuantidadeCombustivel jqc;
	
	private ControleAbastecimento ca;
	private SimulatedDatabase sd;
	
	public JanelaPrincipal() {
		this.jc = new JanelaCombustivel();
		this.jqc = new JanelaQuantidadeCombustivel();
		this.ca = new ControleAbastecimento();
		this.sd = new SimulatedDatabase();
	}

	public JanelaCombustivel getJc() {
		return jc;
	}

	public void setJc(JanelaCombustivel jc) {
		this.jc = jc;
	}

	public JanelaQuantidadeCombustivel getJqc() {
		return jqc;
	}

	public void setJqc(JanelaQuantidadeCombustivel jqc) {
		this.jqc = jqc;
	}
	
	public void showPrecoFinal() {
		double vf = this.ca.getValorFinal(this.jc.getCombustivel(), this.jqc.getQntCombustivel(), this.sd);
		JOptionPane.showMessageDialog(null, vf);
	}
	
}
