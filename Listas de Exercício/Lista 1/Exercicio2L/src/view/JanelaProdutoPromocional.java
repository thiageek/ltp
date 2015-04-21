package view;

import javax.swing.JOptionPane;

public class JanelaProdutoPromocional {

	private JOptionPane janela;
	private boolean promocional;
	
	public JanelaProdutoPromocional(int quantidade) {
		setJanela(new JOptionPane());
		this.exibeJanela(quantidade);
	}
	
	public JOptionPane getJanela() {
		return janela;
	}
	
	public void setJanela(JOptionPane janela) {
		this.janela = janela;
	}

	public boolean isPromocional() {
		return promocional;
	}

	public void setPromocional(boolean promocional) {
		this.promocional = promocional;
	}

	public void exibeJanela(int quantidade) {
		setBooleanPromocional(getJanela().showInputDialog(null, "O produto "+quantidade+" é promocional? (S)im ou (N)ão:"));
	}
	
	public void setBooleanPromocional(String promocional) {
		if(promocional.equalsIgnoreCase("s") || promocional.equalsIgnoreCase("sim")) {
			setPromocional(true);
		} else {
			setPromocional(false);
		}
	}
	
}
