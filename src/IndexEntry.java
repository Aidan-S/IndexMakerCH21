import java.util.TreeSet;

public class IndexEntry {
	
	private String word;
	private TreeSet<Integer> numList;
	
	public IndexEntry(String str) {
		word = str.toUpperCase();
		numList = new TreeSet<Integer>();
	}
	
	public void add(int num) {
		 if(!numList.contains(num)) {
			 numList.add(num);
		 }
	}
	
	public String getWord() {
		return word;
	}
	
	public String toString() {
		String line = numList.toString();
		line = line.replace("{", "");
		line = line.replace("}", "");
		return word + " " + line;
	}
	
	
	
}
