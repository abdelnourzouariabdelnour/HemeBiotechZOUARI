package com.hemebiotech.analytics;

import java.util.Map;
/**
 * Interface SymptomWriter
 * Allows you to retrieve the symptomsCount data 
 * and write them into a document created for this purpose result.txt
 * 
 * @author azo4218
 *
 */
public interface ISymptomWriter {
	
	/**
	 * 
	 * @param symptomsCount
	 */
      void writeSymptomsInFile(Map<String, Integer> symptomsCount);

}
