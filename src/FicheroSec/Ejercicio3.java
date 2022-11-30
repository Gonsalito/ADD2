package FicheroSec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Escriba su nombre:");
		nombre = sc.next();
		long lNumeroLineas = 0;
		
		try {
			BufferedReader head = new BufferedReader(new FileReader("C:\\Users\\Gonsalito\\Desktop\\ufalusi.txt"));
			String sCadena;
			while ((sCadena = head.readLine())!=null) {
				  lNumeroLineas++;
				}
			
			
			
		} catch (FileNotFoundException e1) {
			System.out.println("Error no se encuentra el fichero" + e1);
		}catch (IOException e2) {
			System.out.println("Error" + e2);
		}
		
		
	}

}
