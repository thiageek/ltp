package control;

import model.Cliente;
import database.SimulatedDatabse;

public class ClientController {

	private SimulatedDatabse sm;
	
	public ClientController() {
		setSm(new SimulatedDatabse());
	}
	
	public SimulatedDatabse getSm() {
		return sm;
	}

	public void setSm(SimulatedDatabse sm) {
		this.sm = sm;
	}

	public void registerClient(String login, String password, String name, String cpf,String age,String gender) {
		int ageInt = Integer.parseInt(age);
		Cliente client = new Cliente(name, password, login, ageInt, cpf, gender);
		sm.insertClient(client);
	}
	
	public String returnAllClients() {
		String allClients = ""; 
		for(int i = 0; i < sm.getClients().size(); i++) {
			allClients = allClients + sm.getClients().get(i).clientToString();
		}
		
		return allClients;
	}
	
	
	
	
	
	
	
	
	
	
	
}
