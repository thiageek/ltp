package view;

import javax.swing.JOptionPane;

public class JanelaMostraResultado {

	private JOptionPane janelaMostraResultado;
	private String mensagem;
	
	public JanelaMostraResultado(String mensagem) {
		setJanelaMostraResultado(new JOptionPane());
		this.exibeJanela(mensagem);
	}
	
	public JOptionPane getJanelaMostraResultado() {
		return janelaMostraResultado;
	}
	
	public void setJanelaMostraResultado(JOptionPane janelaMostraResultado) {
		this.janelaMostraResultado = janelaMostraResultado;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void exibeJanela(String mensagem) {
		getJanelaMostraResultado().showMessageDialog(null, mensagem);
	}
	
}
