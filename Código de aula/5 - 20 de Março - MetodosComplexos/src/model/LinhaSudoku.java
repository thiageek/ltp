package model;

public class LinhaSudoku {
	
	private int[] linha;
	
	
	public LinhaSudoku() {
		this.linha = new int[9]; 
	}

	public int[] getLinha() {
		return linha;
	}

	public void setLinha(int[] linha) {
		this.linha = linha;
	}
	
	public void colocarValor(int value, int posicao) {
		this.linha[posicao] = value;
	}
	
	public int pegarValor(int posicao) {
		return this.linha[posicao];
	}
	
	public int gerarValoresSudoku() {
		double a = Math.random();
		double a10 = a * 10;
		int inteiroA = (int) a10; //encontrar um metodo para converter double para int
		if(inteiroA != 0)
			return inteiroA;
		return gerarValoresSudoku();
	}	
	
	
	public void popularLinha() 
	{
		for (int posicao = 0; posicao < linha.length; posicao++)
		{
			int valorGerado = gerarValoresSudoku();
			colocarValor(valorGerado, posicao);
			System.out.println("A posicao " + posicao + " possui o valor " + valorGerado);
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
