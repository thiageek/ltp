package view;

import javax.swing.JOptionPane;

public class JanelaMedia {
	
	private JOptionPane janelaNota;
	private double[] notas;
	
	public JanelaMedia() {
		this.janelaNota = new JOptionPane();
		
		String v1 = this.janelaNota.showInputDialog(null, "Digite a primeira nota:");
		String v2 = this.janelaNota.showInputDialog(null, "Digite a segunda nota:");
		String v3 = this.janelaNota.showInputDialog(null, "Digite a terceira nota:");
		
		this.notas = new double[3];
		this.notas[0] = Double.parseDouble(v1);
		this.notas[1] = Double.parseDouble(v2);
		this.notas[2] = Double.parseDouble(v3);
		
	}

	public JOptionPane getJanelaNota() {
		return janelaNota;
	}

	public void setJanelaNota(JOptionPane janelaNota) {
		this.janelaNota = janelaNota;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
