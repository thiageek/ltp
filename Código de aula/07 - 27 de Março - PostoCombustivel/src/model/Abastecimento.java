package model;

import javax.xml.namespace.QName;

public class Abastecimento {
	private TipoAbastecimento ta;
	private double qntLitros;
	private double valorTotal;
	private Desconto desconto;
	
	public Abastecimento(TipoAbastecimento ta,double qntLitros){
		this.setTa(ta);
		this.setQntLitros(qntLitros);
	}
	
	public Abastecimento(TipoAbastecimento ta,double qntLitros, Desconto desconto){
		this.setTa(ta);
		this.setQntLitros(qntLitros);
		this.setDesconto(desconto);
	}
	
	public double caluculaValorTotalDesc(){
		return this.getQntLitros() * this.getTa().getValorLitro() * this.getDesconto().getPorcentagemFracionada();
	}
	
	public TipoAbastecimento getTa() {
		return ta;
	}
	public void setTa(TipoAbastecimento ta) {
		this.ta = ta;
	}
	public double getQntLitros() {
		return qntLitros;
	}
	public void setQntLitros(double qntLitros) {
		this.qntLitros = qntLitros;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Desconto getDesconto() {
		return desconto;
	}
	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}
	
	
	

}
