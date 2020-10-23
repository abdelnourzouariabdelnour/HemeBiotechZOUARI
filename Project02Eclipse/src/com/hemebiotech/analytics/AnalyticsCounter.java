package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * This class calls on other classes and methods in order to launch the execution
 * @author azo4218
 *
 */

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		

		
        ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");         
        List<String> nameOfSymptoms = readSymptoms.getSymptoms();   
        SymptomsCount symptomsCount = new SymptomsCount();
        Map<String, Integer> SymptomsCount = symptomsCount.getsymptomsCount(nameOfSymptoms);
        WriteSymptoms writeSymptoms = new WriteSymptoms();
        writeSymptoms.writeSymptomsInFile(SymptomsCount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/**			// first get input
		BufferedReader reader = new BufferedReader (new FileReader("../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt"));
		ArrayList <String> list = new ArrayList<String>();
	
		while (reader.readLine() != null) {
			   list.add(reader.readLine());    
			}
	
		 // list.forEach((n) -> System.out.println(n));
		
		list.stream()
		 .collect(Collectors.groupingBy(s -> s))
	      .forEach((k, v) -> System.out.println(k+" "+ count(v)));
		
		String line = reader.readLine();

	int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	// get another symptom
		}  

		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}

	private static String count(List<String> v) {
		// TODO Auto-generated method stub
		return null;`  **/ 
        
        
	}
}
