package view;

import javax.swing.JOptionPane;

public class TelaPesquisa {

	private String pesquisa;

	public TelaPesquisa(String termo) {
		setPesquisa(JOptionPane.showInputDialog("Digite " + termo + " que deseja pesquisar:"));
	}
	
	public String getPesquisa() {
		return this.pesquisa;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}

}
