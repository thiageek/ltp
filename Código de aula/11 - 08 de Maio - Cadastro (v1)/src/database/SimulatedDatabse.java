package database;

import java.util.ArrayList;

import model.Cliente;

public class SimulatedDatabse {

	private ArrayList<Cliente> clients;
	

	public SimulatedDatabse() {
		setClients(new ArrayList<Cliente>());
	}
	
	public ArrayList<Cliente> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Cliente> clients) {
		this.clients = clients;
	}
	
	public void insertClient(Cliente c) {
		getClients().add(c);
	}
}
