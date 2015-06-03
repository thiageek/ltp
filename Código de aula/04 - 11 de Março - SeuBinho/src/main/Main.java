package main;

import java.util.ArrayList;

import model.Aluno;
import model.Habilidade;
import model.Nivel;
import model.Nome;

public class Main {
	
	public static void main(String[] args) {
		Nivel n = new Nivel();
		Nome n1 = new Nome("Caio");
		Aluno a = new Aluno (n1,"2323", 12);
		ArrayList<Habilidade> h = new ArrayList<Habilidade>();
		
		System.out.println(a.getNomeToString());
		System.out.println(a.getId());
		System.out.println(a.getIdade());
		System.out.println(a.getNivel());
		System.out.println(a.getHabilidades());
		System.out.println(a.getSenha());
	}

}
