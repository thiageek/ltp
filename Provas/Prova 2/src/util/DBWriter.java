package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DBWriter {

	
	public void write(String fileName, String fileText) {
		try {
			
			FileWriter fw = new FileWriter(fileName, true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(fileText);
			pw.close();			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
}
