package control;

import view.ClientRegisterWindow;
import model.Cliente;
import database.SimulatedDatabse;

public class ClientController {

	private SimulatedDatabse sm;
	private ClientRegisterWindow crw;
	
	public ClientController() {
		setSm(new SimulatedDatabse());
		showRegisterWindow();
	}
	
	private void showRegisterWindow() {
		this.crw = new ClientRegisterWindow();
		while(this.crw.showYesNoWindow().equals("1")){
			this.crw.showAllWindows();
			registerClient(this.crw.getLogin(), this.crw.getPwd(), this.crw.getName(), this.crw.getCpf(), this.crw.getAge(), this.crw.getGender());	
			
		}
		//teste
		System.out.print(returnAllClients());
	}

	public ClientRegisterWindow getCrw() {
		return crw;
	}

	public void setCrw(ClientRegisterWindow crw) {
		this.crw = crw;
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
