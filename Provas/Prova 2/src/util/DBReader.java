package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DBReader {
	
	public ArrayList<String> read(String fileName) {
		ArrayList<String> fileLines = new ArrayList<String>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			
			while(line != null) {
				fileLines.add(line);
				line = br.readLine();
			}
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return fileLines;
	}

}
