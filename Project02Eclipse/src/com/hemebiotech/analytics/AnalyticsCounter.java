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
		

		
        ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("../Project02Eclipse/symptoms.txt");         
        List<String> nameOfSymptoms = readSymptoms.getSymptoms();   
        SymptomsCount symptomsCount = new SymptomsCount();
        Map<String, Integer> symptomsCounter = symptomsCount.getSymptomsCount(nameOfSymptoms);
        WriteSymptoms writeSymptoms = new WriteSymptoms();
        writeSymptoms.writeSymptomsInFile(symptomsCounter);
		
		
	
        
        
	}
}
