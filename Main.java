
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//http://www.java2s.com/Code/Java/File-Input-Output/Readeachlineinacommaseparatedfileintoanarray.htm
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		boolean seguir = true;
		Vista vis = new Vista();
		Scanner scn = new Scanner(System.in);
		VectorHeap<Paciente> hospital = new VectorHeap<>();
		
		while(seguir) {
			System.out.println("\nLocation (ubicación del archivo con los pacientes): ");
			String path = scn.nextLine();
			vis.data(path);
			
			do {
				System.out.println("1. Ver pacientes (método 1)");
				System.out.println("2. Ver pacientes (método 2)");
				String opc = scn.nextLine();
				
				if(opc == "1") {
					
				}
				
				else if (opc == "2") {
					
				}
				
				else {
					break;
				}
				
				
				
				
			}while(seguir);
			
			
			
			
		}
	}
}


        
        
        


    
    