package view;

import javax.swing.JOptionPane;

public class JanelaSexo {
	private JOptionPane janelaSexo;
	private String sexo;
	
	public JanelaSexo(){
		setJanelaSexo(new JOptionPane());
		this.exibeJanela();
		
	}
	
	public JOptionPane getJanelaSexo() {
		return janelaSexo;
	}
	public void setJanelaSexo(JOptionPane janelaSexo) {
		this.janelaSexo = janelaSexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void exibeJanela(){
		setSexo(this.janelaSexo.showInputDialog(null, "Insira o sexo: "));
	}
}
