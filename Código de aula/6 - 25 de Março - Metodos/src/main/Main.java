package main;

import model.Metodos;

public class Main {
	
	public static void main(String[] args) {
		
		Metodos m = new Metodos();
		
		String mencao = m.retornarResultadoFinal("MS");
		System.out.println(mencao);
	}

}
