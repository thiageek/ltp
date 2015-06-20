package view;

import javax.swing.JOptionPane;

public class TelaPrincipal {

	private String comando;
	
	public TelaPrincipal() {
		setComando(JOptionPane.showInputDialog("[1] Visualizar postagens " + '\n' 
													+ "[2] Pesquisar "  + '\n' 
													+ "[3] Realizar postagem "  + '\n' 
													+ "[4] Pesquisar quantidade de postagens por categoria " + '\n' 
													+ "[0] Sair"));
	}

	public String getComando() {
		return this.comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}
	
	
	
}
