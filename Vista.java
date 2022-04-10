import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vista {
	
		public static String path() {
			Scanner scn = new Scanner(System.in);
			System.out.println("\nLocation (ubicación del archivo con los pacientes): ");
			String path = scn.nextLine();
			return path;
		}
	
	  public ArrayList<String> data(String path) throws FileNotFoundException{
		  
		  ArrayList<String> List = new ArrayList<String>();
		  Scanner scn2 = new Scanner(System.in);
		    BufferedReader br = null;
		    String[] characters = new String[1024];

		    try {

		        String sCurrentLine;
		        br = new BufferedReader(new FileReader(path));

		        int i = 0;
		        while ((sCurrentLine = br.readLine()) != null) {
		        	List.add(sCurrentLine.toUpperCase(Locale.ROOT));
		        	String[] arr = sCurrentLine.split(",");
		        	characters[i] = arr[0];
		        	Paciente pac = new Paciente(arr[0], arr[1], arr[2]);
		        	
		        }    

		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (br != null)br.close();
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }
		    //estoy probando si se ve
//		    for(String n : List) {
//		    	System.out.println(n);
//		    }
		    
		    
		    return List;
	  }
	  
}
