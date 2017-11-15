import java.util.TreeMap;
import java.util.TreeSet;

public class DocumentIndex extends TreeSet<IndexEntry>{

	private TreeMap<String, IndexEntry> entryList;
	
	
	public DocumentIndex() {
		entryList = new TreeMap<String, IndexEntry>(); 
	}

	public void addWord(String word, int num) {
		IndexEntry temp;
		if(entryList.containsKey(word)) {	
			entryList.get(word).add(num);
		} else {
			temp = new IndexEntry(word);
			temp.add(num);
			entryList.put(word, temp);
		}
	}
	
	public void addAllWords(String str, int num) {
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
		for()
	}
	
}
