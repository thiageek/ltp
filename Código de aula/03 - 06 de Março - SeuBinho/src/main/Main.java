package main;

import java.util.ArrayList;

import model.Aluno;
import model.Habilidade;
import model.Nivel;

public class Main {
	
	public static void main(String[] args) {
		Nivel n = new Nivel();
		Aluno a = new Aluno();
		ArrayList<Habilidade> h = new ArrayList<Habilidade>();
		
		a.setNome("Caio");
		a.setId("12000");
		a.setIdade(9);
		a.setNivel(n);
		a.setHabilidades(h);
		a.setSenha("123");
		
		System.out.println(a.getNome());
		System.out.println(a.getId());
		System.out.println(a.getIdade());
		System.out.println(a.getNivel());
		System.out.println(a.getHabilidades());
		System.out.println(a.getSenha());
	}

}
