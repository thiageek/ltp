package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import view.ClientRegisterWindow;
import view.ClientSearchWindow;
import model.Cliente;
import database.SimulatedDatabse;

public class ClientController {

	private SimulatedDatabse sm;
	private ClientRegisterWindow crw;
	private ClientSearchWindow csw;
	
	public ClientController() {
		setSm(new SimulatedDatabse());
		startProgram();
		
	}
	
	private void startProgram() {
		String option = "";
		while(!option.equals("0")) {
			option = showOptionWindow();
			selectOption(option);
		}
	}
	
	private void selectOption(String option) {
			switch (option) {
			case "1":
				showRegisterWindow();
				break;
				
			case "2":
				showSearchByNameWindow();
				break;	

			default:
				break;
			}
		
	}

	private void showSearchByNameWindow() {
		this.csw = new ClientSearchWindow();
		this.csw.showAllWindows();
		
		ArrayList<Cliente> clientes = returnClientsByName(this.csw.getSearch(), 10);
		String clientesString = clientesToString(clientes);
		JOptionPane.showMessageDialog(null, "Sua pesquisa retornou: " + clientesString);
		
	}
	


	private String clientesToString(ArrayList<Cliente> clientes) {
		
		String clientesString = "";
		for(int i = 0; i < clientes.size(); i++) {
			 clientesString += clientes.get(i).clientToString();
				
		}
		return clientesString;
	}

	public String showOptionWindow() {
		String dcn = JOptionPane.showInputDialog("[1] Cadastrar Cliente " + '\n' + "[2] Pesquisar Cliente " + '\n' + "[0] Sair");
		return dcn;
	}
	
	private void showRegisterWindow() {
		this.crw = new ClientRegisterWindow();
		this.crw.showAllWindows();
		registerClient(this.crw.getLogin(), this.crw.getPwd(), this.crw.getName(), this.crw.getCpf(), this.crw.getAge(), this.crw.getGender());	
			
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

	private void registerClient(String login, String password, String name, String cpf,String age,String gender) {
		int ageInt = Integer.parseInt(age);
		Cliente client = new Cliente(name, password, login, ageInt, cpf, gender);
		sm.insertClient(client);
	}
	
//	public String returnAllClients() {
//		String allClients = ""; 
//		for(int i = 0; i < sm.getClients().size(); i++) {
//			allClients = allClients + sm.getClients().get(i).clientToString();
//		}
//		
//		return allClients;
//	}
	
	private ArrayList<Cliente> returnClientsByName(String name, int numberOfResults) {
		
		if(numberOfResults > sm.getClients().size()) {
			numberOfResults = sm.getClients().size();
		}
		
		ArrayList<Cliente> clientsByName = new ArrayList<Cliente>();
		
		for(int i = 0; i < numberOfResults; i++) {
			if(this.sm.getClients().get(i).getName().toLowerCase().contains(name)) {
				clientsByName.add(this.sm.getClients().get(i));
			}
		}
		
		return clientsByName;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
