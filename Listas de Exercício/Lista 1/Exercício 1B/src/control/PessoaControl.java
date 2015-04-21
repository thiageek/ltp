package control;

import model.Pessoa;

public class PessoaControl {

	private Pessoa pessoa;

	public PessoaControl(int idade, String sexo) {
		setPessoa(new Pessoa(idade, sexo));
		
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String confirmaAptidao() {
		return getPessoa().verificaAptidao();
	}
	
	
	
}
