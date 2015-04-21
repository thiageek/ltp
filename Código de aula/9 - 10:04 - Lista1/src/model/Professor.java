package model;

public class Professor {
	
	
	public double calcularMedia(double nota1, double nota2, double nota3) {
		return (nota1 + nota2 + nota3) / 3;
	}
	
	public double calculaMediaGenerico(double[] notas) {
		double soma = 0;
		for(int indice = 0; indice < notas.length ; indice++) {
			soma = soma + notas[indice];
		}
		return soma / (notas.length) ;
	}
}

