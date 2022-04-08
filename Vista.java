import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
		public String path() {
			Scanner scn = new Scanner(System.in);
			System.out.println("\nLocation (ubicación del archivo): ");
			return scn.nextLine();
		}
	
	  public ArrayList<String> data() throws FileNotFoundException{
		  String myPath = path();
		  Scanner s = new Scanner(new File(myPath));
		  ArrayList<String> list = new ArrayList<String>();
		  while (s.hasNext()) {
			  list.add(s.next());
		  }
		  for(String str: list) {
			  System.out.println(str);
		  }
	  s.close();
	return list;
	  }
	  
	  public PriorityQueue makePriority() {
		  return null;
		  
	  }
	  
	  public VectorHeap makeVector() {
		return null;
		  
	  }
}
