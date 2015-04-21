package main;

import javax.swing.JOptionPane;

import model.Escada;
import model.Pessoa;

public class Main {
	
	public static void main(String[] args) {
		
		Escada e1 = new Escada();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setAltura(1.8);
		p1.setTemPermissao(true);
		p1.setTemDisponibilidade(true);
		p1.setCPF("001.002.003-09");
		
		
		
		//System.out.print(p1.getCPF());
		
		JOptionPane.showMessageDialog(null, p1.getCPF());
	}

}
