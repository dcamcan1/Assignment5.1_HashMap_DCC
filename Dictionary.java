import java.io.*;
import java.util.*;

/** Represents a dictionary containing archaic words
 *  and their definitions.
 *  
 *  @author Danny Cannon
 */
public class Dictionary {

	//Instance Variable
	private HashMap<String, String> wordMap;
	
	/** Creates a map of the words. */
	public Dictionary() {
		wordMap = new HashMap<>();
	}//end constructor
	
	//Methods
	/** Loads the unsorted key/definition pairs into the HashMap.
	 *  @throws FileNotFoundException. */
	public void load() throws FileNotFoundException  {
		Scanner scan = new Scanner(new File("DictionaryWordValuePairs.csv"));
		while(scan.hasNextLine()) {
			String values[] = scan.nextLine().split(",");
			wordMap.put(values[0], values[1]);
		}//end while
		scan.close();
	}//end loadDictionary
	
	/** Prints the word, definition, and HashKey used for the word by the HashMap. */
	public void printD() {
		for (Map.Entry<String, String> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}//end for
	}//end printDictionary
	
	/** Searches the dictionary for a key. 
	 * 	@param word  key to search for in the dictionary. */
	public String search(String word) {
		if (wordMap.get(word) == null) {
			return "\"" + word + "\"" + " does not exist in this dictionary.";
		}//end if
		else {
			return word + ": " + wordMap.get(word) + " (hashCode: " + word.hashCode() + ")";
		}//end else
	}//end search
	
}//end Dictionary class
