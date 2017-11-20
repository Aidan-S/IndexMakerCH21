import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class DocumentIndex extends TreeMap<String, IndexEntry>{

	public DocumentIndex() {
		super();
	}

	public void addWord(String given, int num) {
		IndexEntry temp;
		String word = given.toUpperCase();
		if(!word.equals("")) {
			if(this.containsKey(word)) {	
				this.get(word).add(num);
			} else {
				temp = new IndexEntry(word);
				temp.add(num);
				this.put(word, temp);
			}
		}
	}
	
	public void addAllWords(String str, int num) {
		str.toUpperCase();
		str.replace("{", " ");
		str.replace("}", " ");
		str.replace(";", " ");
		str.replace("(", " ");
		str.replace(")", " ");
		str.replace(".", " ");
		str.replace("  ", " ");
		
		
		String[] words = str.split("\\W+");
		
		for ( String word : words) {
			 addWord(word, num);
		  }
		
	}
	
	public String toString() {
		String words = "";
		for(Map.Entry<String,IndexEntry> entry : this.entrySet()) {
				IndexEntry value = entry.getValue();
				words += value.toString() + "\n";	  
		}
		return words;
	}
	
}
