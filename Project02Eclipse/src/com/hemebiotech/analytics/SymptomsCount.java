package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * This class is used to read the list of symptoms in the ReadSymptomDataFromFile 
 * class to create a tree structure of type <String, Integer> 
 * in order to be able to count the number of occurrences
 * of each symptom and to classify them in alphabetical order
 * 
 * @author Abdelnour ZOUARI
 *
 */

public class SymptomsCount implements ISymptomCount {

	
    
    Map<String, Integer> symptomsCount = new TreeMap<>();

    /**
	 * count occurences of symptoms in a list and create a map of symptoms 
	 *
	 * @return map of iteration of symptoms with their occurences
	 * 
	 */

    public Map<String, Integer> getSymptomsCount(List<String> nameOfSymptoms) {

    	if (nameOfSymptoms != null && !nameOfSymptoms.isEmpty()) {
		

			for (String symptom : nameOfSymptoms) {
				symptomsCount.put(symptom, symptomsCount.containsKey(symptom) ? symptomsCount.get(symptom) + 1 : 1);
			}

		}
		return symptomsCount;

	}
}