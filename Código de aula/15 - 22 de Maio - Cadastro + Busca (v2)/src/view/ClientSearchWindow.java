package view;

import javax.swing.JOptionPane;

public class ClientSearchWindow {
	
	private String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public void showAllWindows() {
		this.search = JOptionPane.showInputDialog("Pesquisar:");
		
	}
	
	//TODO: metodo para apresentar o retorno da busca (String)

}
