package main;

import javax.swing.JOptionPane;

import model.Abastecimento;
import model.Desconto;
import model.TipoAbastecimento;
import view.JanelaCombustivel;
import view.JanelaQuantidadeCombustivel;

public class Main {
	public static void main(String[] args) {
		
		// INFORMA‚ÍES PREVIAMENTE SETADAS NO SISTEMA
		TipoAbastecimento tp1 = new TipoAbastecimento("GASOLINA", 3.60);
		TipoAbastecimento tp2 = new TipoAbastecimento("ALCOOL", 2.75);
		
		Desconto da1 = new Desconto(20.001, 40, 5, tp2);
		Desconto da2 = new Desconto(40.001, 50, 8, tp2);
		Desconto da3 = new Desconto(50.001, Double.MAX_VALUE, 10, tp2);

		Desconto dg1 = new Desconto(20.001, 40, 7.5, tp1);
		Desconto dg2 = new Desconto(40.001, 50, 10, tp1);
		Desconto dg3 = new Desconto(50.001, Double.MAX_VALUE, 12, tp1);
		
		//INTERFACE DO PROGRAMA
		JanelaCombustivel jc = new JanelaCombustivel();
		JanelaQuantidadeCombustivel jqc = new JanelaQuantidadeCombustivel();
		
		// CRIAR CLASSES DE CONTROLE PARA REMOVER IFS
		// mŽtodos espec’ficos para cada tipo de a‹o
		Abastecimento a = null;
		if (jc.getCombustivel().equals("ALCOOL")){
			if (jqc.getQntCombustivel() > 50){
				a = new Abastecimento(tp2, jqc.getQntCombustivel(), da3);
			}
		}
		JOptionPane.showMessageDialog(null,a.caluculaValorTotalDesc());
		
		//jqc.apresentarValorCombustivel();
		//jc.apresentarValorCombustivel();
		
		
		
	}

}
