package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Cliente;
import util.DocumentReader;
import util.DocumentWriter;
import view.ClientRegisterWindow;
import view.ClientSearchWindow;
import database.SimulatedDatabse;

public class ClientController {

	private String cliente_file = "C:\\Users\\caio.silva\\workspace\\TutorialCadastro\\database\\cliente_db.txt";
	
	private SimulatedDatabse sm;
	private DocumentWriter dw;
	private DocumentReader dr;
	private ClientRegisterWindow crw;
	private ClientSearchWindow csw;
	
	public ClientController() {
		setSm(new SimulatedDatabse());
		setDw(new DocumentWriter());
		setDr(new DocumentReader());
		populateDatabase(dr.read(cliente_file));
		startProgram();
		
	}
	
	

	private void populateDatabase(ArrayList<String> read) {
		for(String s : read) {
			Cliente c = stringToClient(s);
			this.sm.getClients().add(c);
		}
		
	}
	
	private Cliente stringToClient(String clientString) {
		String[] cp = clientString.split(";");
		Cliente c = new Cliente(cp[0], cp[2], cp[1], Integer.parseInt(cp[4]),cp[3], cp[5]);
		return c;
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
			 clientesString += clientes.get(i).toString();
				
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
		dw.write(cliente_file,client.clientToString());
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
	
	public DocumentWriter getDw() {
		return dw;
	}

	public void setDw(DocumentWriter dw) {
		this.dw = dw;
	}

	public ClientSearchWindow getCsw() {
		return csw;
	}

	public void setCsw(ClientSearchWindow csw) {
		this.csw = csw;
	}
	
	public void setDr(DocumentReader documentReader) {
			this.dr = documentReader;
		
	}	
	
	
}
