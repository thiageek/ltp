import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {
	
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("meu_db.txt", true);
			
			PrintWriter pw = new PrintWriter(fw);
			//pw.println("Minha primeira linha");
			//pw.println("Minha segunda linha");
			//pw.println("Minha terceira linha");
			pw.println("Minha linha TESTE");
			pw.close();
		
			
			FileReader fr = new FileReader("meu_db.txt");
			char[] a = new char[1000];
			fr.read(a);
			
			for(char c : a) {
				System.out.print(c);
			}
			
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	

}
