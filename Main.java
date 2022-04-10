
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

//http://www.java2s.com/Code/Java/File-Input-Output/Readeachlineinacommaseparatedfileintoanarray.htm
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		boolean seguir = true;
		Vista vis = new Vista();
		Scanner scn = new Scanner(System.in);
		VectorHeap<Paciente> hospital = new VectorHeap<>();
		PriorityQueue<Paciente> hospital1 = new PriorityQueue<Paciente>();
		


			
			do {
				System.out.println("\nLocation (ubicación del archivo con los pacientes): ");
				String path = scn.nextLine();
				vis.data(path);
				System.out.println("1. Ver pacientes (método 1, PriorityQueue)");
				System.out.println("2. Ver pacientes (método 2, VectorHeap)");
				int opc = scn.nextInt();
				
				
				if(opc == 1) {
					
					
				        for (String s : vis.data(path)) {
				            s.replaceAll("\\s+", "");
				            String[] listaPacientes = s.split(",");
				            Paciente paciente = new Paciente(listaPacientes[0], listaPacientes[1], listaPacientes[2]);
				            hospital1.add(paciente);
				        }
				        
				        while (!hospital1.isEmpty()){
				            System.out.println(hospital1.poll().pacienteInfo());
				            System.out.println("Siguiente paciente (presione enter)");
				            String x = scn.nextLine();
				        }
					
				
				}
				else if (opc == 2) {
				System.out.println("2");	
				}
				
				else {
					break;
				}
				
				
				
				
			}while(seguir);
			
			
			
			
		
	}
	
	
}


        
        
        


    
    