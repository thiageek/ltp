package main;

import control.PessoaControl;
import view.JanelaIdade;
import view.JanelaMostraResultado;
import view.JanelaSexo;

public class Main {
	public static void main(String[] args) {
		
		JanelaIdade janelaIdade = new JanelaIdade();
		JanelaSexo janelaSexo = new JanelaSexo();
		PessoaControl pessoaControl = new PessoaControl(janelaIdade.getIdade(), janelaSexo.getSexo());
		String resultado = pessoaControl.confirmaAptidao();
		JanelaMostraResultado janelaMostraResultado = new JanelaMostraResultado(resultado);
	
	}
}
