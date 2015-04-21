package model;

public class TipoAbastecimento {
	private String tipoCombustivel;
	private double valorLitro;
	
	public TipoAbastecimento(String nome, double valor){
		this.setTipoCombustivel(nome);
		this.setValorLitro(valor);
	}
	
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public double getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	

}
