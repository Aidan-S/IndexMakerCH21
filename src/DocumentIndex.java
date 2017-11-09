import java.util.TreeMap;
import java.util.TreeSet;

public class DocumentIndex {

	private TreeMap<String, IndexEntry> entryList;
	
	
	public DocumentIndex() {
		entryList = new TreeMap<String, IndexEntry>(); 
	}
	
	public DocumentIndex(int length) {
		entryList = new TreeMap<String, IndexEntry>();
	}
	
	public void addWord(String word, int num) {
		
	}
	
	public void addAllWords(String str, int num) {
		
	}
	
}
