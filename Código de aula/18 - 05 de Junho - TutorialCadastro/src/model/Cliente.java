package model;

public class Cliente {

	private String name;
	private String password;
	private String login;
	private int age;
	private String cpf;
	private String gender;
	//private CartaoCredito cartao;
	
	public Cliente(String name, String password, String login, int age, String cpf, String gender) {
		setName(name);
		setPassword(password);
		setLogin(login);
		setAge(age);
		setCpf(cpf);
		setGender(gender);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String clientToString() {
		return  getName() + ";"
				+ getLogin() + ";"
				+ getPassword() + ";"
				+ getCpf() + ";"
				+ getAge() + ";"
				+ getGender();
	}
	
	public String toString() {
		return  "\nNome:" + getName() + "\n"
				+ "Login:" + getLogin() + "\n"
				+ "Senha:" + getPassword() + "\n"
				+ "CPF: " + getCpf() + "\n"
				+ "Idade: " + getAge() + "\n"
				+ "Genero:" + getGender() + "\n";
	}
	
	
	
	
	
	
	
}
