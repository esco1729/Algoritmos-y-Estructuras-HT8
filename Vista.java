import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
	  public ArrayList<String> data() throws FileNotFoundException{
		  Scanner s = new Scanner(new File("C:\\Users\\liter\\OneDrive\\Escritorio\\Universidad\\Semestre V\\Algoritmos y Estructuras de Datos\\Laboratorio 8\\Algoritmos-y-Estructuras-HT8\\pacientes"));
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
	  
}
