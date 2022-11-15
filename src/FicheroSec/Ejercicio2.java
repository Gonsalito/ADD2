package FicheroSec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Escriba su nombre: ");
		
		nombre = sc.next();
		System.out.println("Su nombre es " + nombre);
		FileReader fr = null;
		
		
		try {
			int contador = 0;
			fr = new FileReader("C:\\Users\\Gonsalito\\Desktop\\ufalusi.txt");
			BufferedReader entrada = new BufferedReader(fr);
			String texto = entrada.readLine();
			while (texto != null) {
				System.out.println(texto);
				
				texto= entrada.readLine();
				contador++;
				
			}
			sc.close();
			entrada.close();
			
		} catch (FileNotFoundException e1) {
			System.out.println("No se encuentra el fichero" + e1);
			
		}catch(IOException e2) {
			System.out.println("Fichero no es de texto" + e2);
			
			
		}
	}

}
