package view;

import javax.swing.JOptionPane;

import control.ClientController;

public class ClientRegisterWindow {
	
	private String login;
	private String pwd;
	private String name;
	private String cpf;
	private String age;
	private String gender;
	


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String showYesNoWindow() {
		String dcn = JOptionPane.showInputDialog("[1] Cadastrar " + '\n' + "[0] Sair");
		return dcn;
	}
	
	public void showAllWindows() {
		this.login =JOptionPane.showInputDialog("Insira o login:");
		this.pwd = JOptionPane.showInputDialog("Insira a senha:");
		this.name = JOptionPane.showInputDialog("Insira seu nome:");
		this.cpf = JOptionPane.showInputDialog("Insira seu cpf:");
		this.age = JOptionPane.showInputDialog("Insira idade:");
		this.gender = JOptionPane.showInputDialog("Insira genero:");
	}

	
	
	
	
	

}
