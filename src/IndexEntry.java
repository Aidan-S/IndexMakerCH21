import java.util.TreeSet;

public class IndexEntry {
	
	private String word;
	private TreeSet<Integer> numList=new TreeSet<Integer>();
	
	public IndexEntry(String str) {
		word = str;
	}
	
	public void add(int num) {
		numList.add(num);
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
