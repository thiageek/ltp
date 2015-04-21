package view;

import javax.swing.JOptionPane;

public class JanelaCompraPrecoFinal {

	private JOptionPane janela;
	private float precoFinal;
	
	public JanelaCompraPrecoFinal(float precoFinal) {
		setJanela(new JOptionPane());
		setPrecoFinal(precoFinal);
		this.exibeJanela();
	}
	
	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}
	
	public float getPrecoFinal() {
		return precoFinal;
	}
	
	public void setPrecoFinal(float precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	public void exibeJanela() {
		getJanela().showMessageDialog(null, "O preço final da compra com o desconto é R$ "+getPrecoFinal()+".");
	}
	
}
