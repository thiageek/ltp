package model;

public class Escada {
	
	private String material;
	private String tipo;
	private Float peso;
	private Integer id;
	private Pessoa ocupante;
	private Float[] dimensoes;
	
	public Pessoa getOcupante() {
		return this.ocupante;
	}
	
	public void setOcupante(Pessoa ocupante) {
		this.ocupante = ocupante;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	

}
