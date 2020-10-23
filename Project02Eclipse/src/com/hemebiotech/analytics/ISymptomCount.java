package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Interface SymptomCount
 * Allows to retrieve data from nameOfSymptoms, count the number of occurrences 
 * of each symptom and classify them in alphabetical order
 * @author azo4218
 *
 */

public interface ISymptomCount {
	/**
	 * 
	 * @param nameOfSymptoms
	 * @return Map<String, Integer>
	 */
	
	 Map<String, Integer> getsymptomsCount(List<String> nameOfSymptoms);

}