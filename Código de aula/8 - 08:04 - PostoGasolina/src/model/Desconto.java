package model;

public class Desconto {
	
	private double limiteMin;
	private double limiteMax;
	private double porcentagem;
	//private Date dataLimite;
	private TipoAbastecimento ta;
	
	
	public Desconto(double limiteMin, double limiteMax, double p, TipoAbastecimento ta) {
		this.setLimiteMax(limiteMax);
		this.setLimiteMin(limiteMin);
		this.setPorcentagem(p);
		this.setTa(ta);
	}
	
	public double getPorcentagemFracionada() {
		return (100 - this.getPorcentagem()) / 100;
	}
	
	
	public TipoAbastecimento getTa() {
		return ta;
	}


	public void setTa(TipoAbastecimento ta) {
		this.ta = ta;
	}


	public double getLimiteMin() {
		return limiteMin;
	}
	public void setLimiteMin(double limiteMin) {
		this.limiteMin = limiteMin;
	}
	public double getLimiteMax() {
		return limiteMax;
	}
	public void setLimiteMax(double limiteMax) {
		this.limiteMax = limiteMax;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	

}
