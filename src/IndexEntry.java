import java.util.TreeSet;

public class IndexEntry implements Comparable{
	
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
		String line = "";
		
		for (Integer num : numList) {
			   line += ("" + num)+ ", ";
		}
		
		int len = (word + " " + line).length();
		
		return (word + " " + line).substring(0, len - 2);
	}
	
	@Override
	public int compareTo(Object entry) {
		return word.compareTo(((IndexEntry)entry).getWord());
	}
}
