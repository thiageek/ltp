package view;

import javax.swing.JOptionPane;

public class TelaMostraQuantidade {

	public TelaMostraQuantidade(int quantidade) {
		JOptionPane.showMessageDialog(null, "Foram encontradas " + quantidade + " postagens nessa categoria.");
	}
	
}
