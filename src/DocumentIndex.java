import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
//Aidan Scannell
public class DocumentIndex extends TreeMap<String, IndexEntry>{
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: constructor, making a TreeMap of Strings(key) leading to IndexEntry Objects
	 * @param args: just calls the super class for treemaps
	 * @return: none
	 */
	public DocumentIndex() {
		super();
	}
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: takes a word and adds it or adds its occurrence to its numList
	 * @param args: given - the word; num - the line "word" occurred on; temp - temporary IndexEntry
	 * @return: none
	 */
	public void addWord(String given, int num) {
		IndexEntry temp;
		String word = given.toUpperCase();
		if(!word.equals("")) {
			//if its there
			if(this.containsKey(word)) {	
				this.get(word).add(num);
			} else {
			//otherwise add it
				temp = new IndexEntry(word);
				temp.add(num);
				this.put(word, temp);
			}
		}
	}
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: takes a line of words and adds its words with addWord(String, int); takes out punctuation stuff
	 * @param args: str - the line; num - the line's num; words - array of the words
	 * @return: none
	 */
	public void addAllWords(String str, int num) {
		//take out weird junk
		str.replace("{", " ");
		str.replace("}", " ");
		str.replace(";", " ");
		str.replace("(", " ");
		str.replace(")", " ");
		str.replace(".", " ");
		str.replace(",", " ");
		
		//split the string into an array
		String[] words = str.split("\\W+");
		
		for ( String word : words) {
			 addWord(word, num);
		  }
		
	}
	
	/**
	 * @user: Aidan-S
	 * @date: November 19th, 2017
	 * @method: toString method
	 * @param args: words - String of all the index Entries
	 * @return: String of the words to be printed
	 */
	public String toString() {
		String words = "";
		//Print each IndexEntry, line by line
		for(Map.Entry<String,IndexEntry> entry : this.entrySet()) {
				IndexEntry value = entry.getValue();
				words += value.toString() + "\n";	  
		}
		return words;
	}
	
}
