package view;

import javax.swing.JOptionPane;

import control.ControleLixeira;

public class JanelaQuantidade {
	
	//atributo do tipo double que ir� receber o valor inserido pelo usu�rio
	private double quantidadeLixo;
	
	//atributo do tipo ControleLixeira 
	private ControleLixeira controle;
	
	//m�todo construtor: esse m�todo ser� executado quando for chamado "new JanelaQuantidade()" 
	public JanelaQuantidade() {
		
		//cria um novo objeto ControleLixeira 
		this.controle = new ControleLixeira();
		
		//chama a fun��o setQuantidadeUsuario
		setQuantidadeUsuario();
		
		//coloca o valor do retorno do m�todo 'adicionaQuantidadeLixo()' no atributo 'quantidadeLixo'
		//esse trecho de c�digo chama o controle para realizar a opera��o desejada, e altera o valor do atributo 'quantidadeLixo' 
		this.quantidadeLixo = this.controle.adicionaQuantidadeLixo(this.quantidadeLixo);
		
		//chama o m�todo que apresenta a quantidade de lixo atual
		apresentaQuantidadeAtual();
	}
	
	//m�todo que solicita ao usu�rio uma quantidade de lixo, converte para double e coloca o valor convertido no atributo 'quantidadeLixo'  
	public void setQuantidadeUsuario() {
		
		//apresenta janela para o usu�rio e coloca o valor digitado na variavel 'quantidade'
		String quantidade = JOptionPane.showInputDialog(null, "Digite a quantidade:");
		
		//coloca no atributo 'quantidadeLixo' o valor digitado pelo usu�rio convertido para double
		this.quantidadeLixo = Double.parseDouble(quantidade);
	}
	
	//m�todo que apresenta o valor do atributo 'quantidadeLixo' em uma janela
	public void apresentaQuantidadeAtual() {
		
		//apresenta uma janela com o valor do atributo 'quantidadeLixo'
		JOptionPane.showMessageDialog(null, "A quantidade de lixo �: " + this.quantidadeLixo);
	}

}
