package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class which allows to recover an external file 
 * and to be able to read its content and create a list of symptoms
 * 
 * @author Abdelnour Zouari
 * 
 */

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	
	
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}
	/**
	 * read symptoms in a file and create a list of symptoms 
	 * 
	 */ 
	public List<String> getSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		System.out.println(result);
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
