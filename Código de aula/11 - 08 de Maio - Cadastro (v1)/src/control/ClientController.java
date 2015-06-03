package control;

import model.Cliente;
import database.SimulatedDatabse;

public class ClientController {

	private SimulatedDatabse sm;
	
	public void registerClient(String login, String password, String name, String cpf,String age,String gender) {
		int ageInt = Integer.parseInt(age);
		Cliente client = new Cliente(name, password, login, ageInt, cpf, gender);
		sm.insertClient(client);
	}
}
