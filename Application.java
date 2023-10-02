import java.io.FileNotFoundException;

/** Driver to test Dictionary class.
 * 
 *  @author Danny Cannon
 */
public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		/** Creates dicitonary. */
		Dictionary diction = new Dictionary();
		
		/** Tests load method. */
		diction.load(); 
		
		/** Tests search method with 5 different words. */
		System.out.println(diction.search("job"));
		System.out.println(diction.search("rude"));
		System.out.println(diction.search("sore"));
		System.out.println(diction.search("knave"));
		System.out.println(diction.search("visionary"));
		System.out.println(diction.search("Nullvaluetester")); //Testing null value
		System.out.println("\n");
		/** Tests print method. */
		diction.printD();
	}//end main

}//end Application class
