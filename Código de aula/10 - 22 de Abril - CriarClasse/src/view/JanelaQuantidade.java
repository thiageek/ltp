package view;

import javax.swing.JOptionPane;

import control.ControleLixeira;

public class JanelaQuantidade {
	
	//atributo do tipo double que irá receber o valor inserido pelo usuário
	private double quantidadeLixo;
	
	//atributo do tipo ControleLixeira 
	private ControleLixeira controle;
	
	//método construtor: esse método será executado quando for chamado "new JanelaQuantidade()" 
	public JanelaQuantidade() {
		
		//cria um novo objeto ControleLixeira 
		this.controle = new ControleLixeira();
		
		//chama a função setQuantidadeUsuario
		setQuantidadeUsuario();
		
		//coloca o valor do retorno do método 'adicionaQuantidadeLixo()' no atributo 'quantidadeLixo'
		//esse trecho de código chama o controle para realizar a operação desejada, e altera o valor do atributo 'quantidadeLixo' 
		this.quantidadeLixo = this.controle.adicionaQuantidadeLixo(this.quantidadeLixo);
		
		//chama o método que apresenta a quantidade de lixo atual
		apresentaQuantidadeAtual();
	}
	
	//método que solicita ao usuário uma quantidade de lixo, converte para double e coloca o valor convertido no atributo 'quantidadeLixo'  
	public void setQuantidadeUsuario() {
		
		//apresenta janela para o usuário e coloca o valor digitado na variavel 'quantidade'
		String quantidade = JOptionPane.showInputDialog(null, "Digite a quantidade:");
		
		//coloca no atributo 'quantidadeLixo' o valor digitado pelo usuário convertido para double
		this.quantidadeLixo = Double.parseDouble(quantidade);
	}
	
	//método que apresenta o valor do atributo 'quantidadeLixo' em uma janela
	public void apresentaQuantidadeAtual() {
		
		//apresenta uma janela com o valor do atributo 'quantidadeLixo'
		JOptionPane.showMessageDialog(null, "A quantidade de lixo é: " + this.quantidadeLixo);
	}

}
