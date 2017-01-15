package Assignment_1b2;
/**
 * @author Gary
 *
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.ejb.*;
@Stateful
public class CST235_SessionBean implements java.io.Serializable {
	//class variables
	private static final long serialVersionUID = 1L;
	private int totalWords;
	private int totalCharacters;
    private int totalNumbers;
	private String textFile = "C:/Users/Gary/workspace/ReadTextFile/RandomFile.txt";
	
	/**
	 * @return the totalWords
	 */
	public int getTotalWords() {
		return totalWords;
	}

	/**
	 * @param totalWords the totalWords to set
	 */
	public void setTotalWords(int totalWords) {
		this.totalWords = totalWords;
	}

	/**
	 * @return the totalCharacters
	 */
	public int getTotalCharacters() {
		return totalCharacters;
	}

	/**
	 * @param totalCharacters the totalCharacters to set
	 */
	public void setTotalCharacters(int totalCharacters) {
		this.totalCharacters = totalCharacters;
	}

	/**
	 * @return the totalNumbers
	 */
	public int getTotalNumbers() {
		return totalNumbers;
	}

	/**
	 * @param totalNumbers the totalNumbers to set
	 */
	public void setTotalNumbers(int totalNumbers) {
		this.totalNumbers = totalNumbers;
	}

	/**
	 * @return the textFile
	 */
	public String getTextFile() {
		return textFile;
	}

	/**
	 * @param textFile the textFile to set
	 */
	public void setTextFile(String textFile) {
		this.textFile = textFile;
	}

	public CST235_SessionBean() {
		// TODO Auto-generated constructor stub
	}
	public String ReadFileCalculateCounts() throws FileNotFoundException {
		//Reads input from a character-input stream
		try (BufferedReader textBuffer = new BufferedReader(new FileReader(textFile))) {		 
			// Reads file line by line
			while ((textFile = textBuffer.readLine()) != null) {
				//Create an array of words for each line from 0 to the total amount per line
				String[] FileWords = textFile.split("\\s+");
			    //Calculates the total number of characters per line
				for (int i = 0; i <= textFile.length(); i++){
					totalCharacters += 1;
				}
				//Calculates the total number of words per line and adds to total until EOF
				totalWords += FileWords.length;
			/* calculates the sum of all numbers by checking each character to see if its a numeric value 
			 * and adding it to the total if it is */
			 for (int i = 0; i < textFile.length(); i++){
			     if (Character.isDigit(textFile.charAt(i))){
			           totalNumbers += Character.getNumericValue(textFile.charAt(i)); }							}	             										}		 
		}catch (IOException e) {return(e.getMessage());}
		   //prints output
	     return(("This file contains " + totalCharacters + " characters, " 
	    		 	+ totalWords + " words, and "
					+ totalNumbers + " numbers."));
	  }
}
