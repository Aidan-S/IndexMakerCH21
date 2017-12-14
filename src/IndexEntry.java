import java.util.TreeSet;
//Aidan Scannell ;m.
public class IndexEntry{
	
	private String word;
	private TreeSet<Integer> numList;
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: constructor - object with a String to represent the individual word and a treeset of lines that word occurred on
	 * @param args: str - the word to be added
	 * @return: none
	 */
	public IndexEntry(String str) {
		word = str.toUpperCase();
		numList = new TreeSet<Integer>();
	}
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: adds a num to the numList if it isn't already there
	 * @param args: num - the number of the line the word is on
	 * @return: none
	 */
	public void add(int num) {
		 if(!numList.contains(num)) {
			 numList.add(num);
		 } 
	}
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: getter for the word
	 * @param args: none
	 * @return: the word
	 */
	public String getWord() {
		return word;
	}
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: toString method for printing an IndexEntry
	 * @param args: line - the collection of all the numList
	 * @return: the word followed by its num occurrences
	 */
	public String toString() {
		String line = "";
		
		//add the nums one at a time
		for (Integer num : numList) {
			   line += ("" + (num + 1))+ ", ";
		}
		
		//add the word and take off the extra comma
		int len = (word + " " + line).length();
		return (word + " " + line).substring(0, len - 2);
	}
}
