package control;

import database.SimulatedDatabase;
import model.Abastecimento;

public class ControleAbastecimento {
	
	private Abastecimento ab;

	public Abastecimento getAb() {
		return ab;
	}

	public void setAb(Abastecimento ab) {
		this.ab = ab;
	}

	public double getValorFinal(String tipoCombustivel, double qntCombustivel, SimulatedDatabase sd) {
		Abastecimento a = null;
		if(tipoCombustivel.equals("ALCOOL")){ 
			if(qntCombustivel > 50){
				a = new Abastecimento(sd.tp2, qntCombustivel, sd.da3);
		
			}
		}
		return a.calcularValorTotalDesc();
	}
	
	

}
