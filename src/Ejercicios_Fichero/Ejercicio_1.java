package Ejercicios_Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_1 {

		public static void main(String[] args){

			/**
			 * Ejercicio 1
			*/
			 Scanner entrada= new Scanner(System.in);
			
			 System.out.println("Introduce el fichero que deseas leer, con su ruta \n>>>");
				
				String nombre = entrada.nextLine();
				 System.out.println(nombre);
				
				try {
					 File fic = new File(nombre); //declara fichero
					 System.out.println(nombre);
				     BufferedReader fichero;
				
						fichero = new BufferedReader(new FileReader(fic));
					
				     int caracterAscii = fichero.read(); //leer el primer caracter
			
				     int contador = 0;
				     while(caracterAscii !=-1){//mientras no me encuentre un error
				    	 //anadir un caracter al contador
				    	 contador++;
				    	 caracterAscii = fichero.read();
				    
				   
				     }
				     fichero.close();
				     
				     System.out.println("En el fichero hay " + contador + " caracteres");
				        
		
				}catch (FileNotFoundException fn ){                      
		               System.out.println("No se encuentra el fichero");
		               }
				catch (IOException e) {
			               System.out.println("Error el fichero no es de tipo texto ");
			               e.printStackTrace();
				}
				
			  	finally{
			  	
			  		entrada.close();
			  		
			  	}
		}

	}











