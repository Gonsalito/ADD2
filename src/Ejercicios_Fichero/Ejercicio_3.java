package Ejercicios_Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
				
		//objeto Scanner para preguntar por el fichero
		Scanner entrada= new Scanner(System.in);
							
		System.out.println("Introduce el fichero que deseas leer, con su ruta \n>>>");
							
		String nombre = entrada.nextLine();
		
		//Comprobamos que el fichero sea de texto
		String buscaTxt = ".txt";
		int encontrado = nombre.indexOf(buscaTxt);
		
		//si es de tipo txt
		if(encontrado != -1){
		
			try{
				File fic = new File(nombre);//declara fichero
				BufferedReader fichero = new BufferedReader(new FileReader(fic));
				
				 //vamos leyendo el fichero l�nea a l�nea
			      String linea;
			      int cont = 1;
			      while((linea = fichero.readLine())!=null)
			     //Mostramos 10 lineas del fichero
			    	  if(cont <= 10) 
			    	  	  System.out.println("L�nea "+(cont++)+"\t "+linea);
			      
			      //cerramos el fichero una vez le�do
			      fichero.close();
				
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}
}
		







