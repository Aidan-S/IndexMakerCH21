import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class IndexMaker{
  
	public static void main(String[] args) throws IOException {
		
    Scanner kb = new Scanner(System.in);
    String fileName;

    // Open input file:
    if (args.length >= 1) {
    	fileName = args[0];
    }else{
    	System.out.print("Enter input file name: ");
    	fileName = kb.nextLine().trim();
    }

    BufferedReader inputFile = new BufferedReader(new FileReader(fileName), 1024);

    // Create output file:
    if (args.length >= 2) {
    	fileName = args[1];
    }else{
    	System.out.print("Enter output file name: ");
    	fileName = kb.nextLine().trim();
    }

    PrintWriter outputFile = new PrintWriter(new FileWriter(fileName));

    // Create index:
    DocumentIndex docIndex = new DocumentIndex();
    
    String line;
    int num = 0;
    while ((line = inputFile.readLine()) != null){
    	docIndex.addAllWords(line, num);
    	num++;
    }

    // Save index:
    outputFile.print(docIndex.toString());

 
    //close
    inputFile.close();
    outputFile.close();
    kb.close();
  }
}