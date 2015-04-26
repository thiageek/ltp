package control;

import database.SimulatedDatabase;
import model.Lixeira;

public class ControleLixeira {
	
	private Lixeira lixeiraAtual;
	private SimulatedDatabase sd;
	
	public ControleLixeira() {
		this.sd = new SimulatedDatabase();
		this.lixeiraAtual = sd.l4;
	}
	
	public Lixeira getLixeiraAtual() {
		return this.lixeiraAtual;
	}

	public void setLixeiraAtual(Lixeira lixeiraAtual) {
		this.lixeiraAtual = lixeiraAtual;
	}

	public double adicionaQuantidadeLixo(double quantidade) {
		double qntLixo = this.lixeiraAtual.getQuantidadeLixo();
		return qntLixo + quantidade;
	}
	
	

}
