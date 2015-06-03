package view;

import javax.swing.JOptionPane;

import control.ClientController;

public class ClientRegisterWindow {
	
	private JOptionPane loginWindow;
	private JOptionPane passwordWindow;
	private JOptionPane nameWindow;
	private JOptionPane cpfWindow;
	private JOptionPane ageWindow;
	private JOptionPane genderWindow;
	
	private ClientController control;
	
	
	public ClientRegisterWindow() {
		setControl(new ClientController());
		
		setLoginWindow(new JOptionPane());
		setPasswordWindow(new JOptionPane());
		setNameWindow(new JOptionPane());
		setCpfWindow(new JOptionPane());
		setAgeWindow(new JOptionPane());
		setGenderWindow(new JOptionPane());
		
		String login = getLoginWindow().showInputDialog("Insira o login:");
		String pwd = getPasswordWindow().showInputDialog("Insira a senha:");
		String name = getNameWindow().showInputDialog("Insira seu nome:");
		String cpf = getCpfWindow().showInputDialog("Insira seu cpf:");
		String age = getAgeWindow().showInputDialog("Insira idade:");
		String gender = getGenderWindow().showInputDialog("Insira genero:");
		
		control.registerClient(login,pwd,name,cpf,age,gender);
		
		//teste
		System.out.print(control.returnAllClients());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

	public ClientController getControl() {
		return control;
	}


















	public void setControl(ClientController control) {
		this.control = control;
	}


















	public JOptionPane getLoginWindow() {
		return loginWindow;
	}


	public void setLoginWindow(JOptionPane loginWindow) {
		this.loginWindow = loginWindow;
	}


	public JOptionPane getPasswordWindow() {
		return passwordWindow;
	}


	public void setPasswordWindow(JOptionPane passwordWindow) {
		this.passwordWindow = passwordWindow;
	}


	public JOptionPane getNameWindow() {
		return nameWindow;
	}


	public void setNameWindow(JOptionPane nameWindow) {
		this.nameWindow = nameWindow;
	}


	public JOptionPane getCpfWindow() {
		return cpfWindow;
	}


	public void setCpfWindow(JOptionPane cpfWindow) {
		this.cpfWindow = cpfWindow;
	}


	public JOptionPane getAgeWindow() {
		return ageWindow;
	}


	public void setAgeWindow(JOptionPane ageWindow) {
		this.ageWindow = ageWindow;
	}


	public JOptionPane getGenderWindow() {
		return genderWindow;
	}


	public void setGenderWindow(JOptionPane genderWindow) {
		this.genderWindow = genderWindow;
	}
	
	

}
