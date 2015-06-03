package database;

import model.Desconto;
import model.TipoAbastecimento;

public class SimulatedDatabase {
	

	public TipoAbastecimento tp1 = new TipoAbastecimento("GASOLINA", 3.60);
	public TipoAbastecimento tp2 = new TipoAbastecimento("ALCOOL", 2.75);
			
	public Desconto da1 = new Desconto(20.001, 40, 5, tp2);
	public Desconto da2 = new Desconto(40.001, 50, 8, tp2);
	public Desconto da3 = new Desconto(50.001, Double.MAX_VALUE, 10, tp2);
}
