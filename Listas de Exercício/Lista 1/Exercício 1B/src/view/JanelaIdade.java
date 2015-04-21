package view;

import javax.swing.JOptionPane;

import model.Pessoa;

public class JanelaIdade {

	private JOptionPane janelaIdade;
	private int idade;
	
	public JanelaIdade(){
		setJanelaIdade(new JOptionPane());
		this.exibeJanela();
	}
	
	public JOptionPane getJanelaIdade() {
		return janelaIdade;
	}
	
	public void setJanelaIdade(JOptionPane janelaIdade) {
		this.janelaIdade = janelaIdade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibeJanela(){
		setIdade(Integer.parseInt(this.janelaIdade.showInputDialog(null, "Insira a idade: ")));
	}
	
}
