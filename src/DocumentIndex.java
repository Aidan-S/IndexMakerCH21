import java.util.TreeMap;
import java.util.TreeSet;

public class DocumentIndex extends TreeSet<IndexEntry>{

	private TreeMap<String, IndexEntry> entryList;
	
	
	public DocumentIndex() {
		entryList = new TreeMap<String, IndexEntry>(); 
	}
	
	public DocumentIndex(int length) {
		entryList = new TreeMap<String, IndexEntry>();
	}
	
	public void addWord(String word, int num) {
		if(entryList.containsKey(word)) {	
			entryList.get(word).add(num);
		} else {
			IndexEntry temp = new IndexEntry(word);
			temp.add(num);
			entryList.put(word, temp);
		}
	}
	
	public void addAllWords(String str, int num) {
		
	}
	
}
