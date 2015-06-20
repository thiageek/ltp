package database;

import java.util.ArrayList;

import model.Postagem;

public class SimulatedDatabase {

	private ArrayList<Postagem> postagens;
	

	public SimulatedDatabase() {
		setPostagens(new ArrayList<Postagem>());
	}
	
	public ArrayList<Postagem> getPostagens() {
		return this.postagens;
	}

	public void setPostagens(ArrayList<Postagem> postagens) {
		this.postagens = postagens;
	}
	
	public void inserirPostagem(Postagem p) {
		getPostagens().add(p);
	}
	
}
