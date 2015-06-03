package main;

import javax.swing.JOptionPane;

import view.JanelaMedia;
import model.Professor;

public class Main {
	
	public static void main(String[] args) {
		
		JanelaMedia jm = new JanelaMedia();
		double[] notas = jm.getNotas();
		
		Professor p = new Professor();
		JOptionPane.showMessageDialog(null,p.calculaMediaGenerico(notas));
		
	}

}
