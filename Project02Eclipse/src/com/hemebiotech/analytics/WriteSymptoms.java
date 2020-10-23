package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/**
 * This class organize the output flow of the data contained in a Map to a
 * created file results.txt
 * save a new file from a map of symptoms
 * 
 * @author ZOUARI Abdelnour
 */

public class WriteSymptoms implements ISymptomWriter {

	/**
	 * This method takes the tree map created in the SymptomsCount 
	 * class and generates a file results.txt with 
	 * the number of iterations of each symptom
	 *        
	 * @author ZOUARI Abdelnour
	 */

	public void writeSymptomsInFile(Map<String, Integer> symptomsCount) {

		try {

			FileWriter writer = new FileWriter("result.txt");
			String symptom;
			Integer valeur;
			Iterator<String> iterator = symptomsCount.keySet().iterator();
			String Newligne=System.getProperty("line.separator");
			while (iterator.hasNext()) {
				symptom = iterator.next();
				valeur = symptomsCount.get(symptom);
				writer.write(symptom + " : " + valeur + Newligne);

			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}