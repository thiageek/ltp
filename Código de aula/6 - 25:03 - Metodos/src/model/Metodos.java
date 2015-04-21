package model;

public class Metodos {
	
	/** Metodo que retorna se um aluno esta 'aprovado' ou 'reprovado'. 
	 * Recebe como parametro a mencao do aluno*/
	
	public String retornarResultadoFinal(String mencaoFinal) {
		if(mencaoFinal == "MM" || mencaoFinal == "MS" || mencaoFinal == "SS")
			return "APROVADO";
		return "REPROVADO";
	}
	
	/** Metodo que retorna o valor promocional de um abastecimento.
	 * Recebe como parametro o tipo de abastecimento e quantidade de litros 
	 */
	
	public double retornarValorPromocional(Abastecimento a) {
		String tipo = a.getTipoAbastecimento();
		if(tipo == "GASOLINA")
			return this.aplicarValorPromocionalGasolina(a);
		else if(tipo == "ALCOOL") 
			return this.aplicarValorPromocionalAlcool(a);
		return 0;
			
	}

	private double aplicarValorPromocionalAlcool(Abastecimento a) {
		double qntLitros = a.getQntLitros();
		double valor = a.getValor();
		if(qntLitros >= 50) {
			a.setValor(valor * 0.9);
		}
		return 0;
	}

	private double aplicarValorPromocionalGasolina(Abastecimento a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
