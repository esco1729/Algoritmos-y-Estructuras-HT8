import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vista {
	
		public static String path() {
			Scanner scn = new Scanner(System.in);
			System.out.println("\nLocation (ubicación del archivo con los pacientes): ");
			String path = scn.nextLine();
			return path;
		}
	
	  public void data(String path) throws FileNotFoundException{
		  VectorHeap<Paciente> pacientesVector = new VectorHeap<>();
		    BufferedReader br = null;
		    String[] characters = new String[1024];

		    try {

		        String sCurrentLine;
		        br = new BufferedReader(new FileReader(path));

		        int i=0;
		        while ((sCurrentLine = br.readLine()) != null) {
		            String[] arr = sCurrentLine.split(",");
		            System.out.println("arr[0] = " + arr[0]); // nombre
		            System.out.println("arr[1] = " + arr[1]); // sintoma
		            System.out.println("arr[2] = " + arr[2]); // codigo


		            characters[0] = arr[0];
		            characters[1] = arr[1];
		            characters[2] = arr[2];
		            Paciente paci = new Paciente(characters[0], characters[1], characters[2]);
		            pacientesVector.add(paci);
		            i++;
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
	  }}
