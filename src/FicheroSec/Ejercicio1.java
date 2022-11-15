package FicheroSec;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Confeccionar un programa Java que solicite al usuario por teclado el nombre (y opcionalmente la ruta) de un fichero de texto.
 *  El programa analizará el fichero y devolverá el número de caracteres que posee, incluyendo los saltos de línea.*/

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String []Args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		
		System.out.println("Diga su nombre: ");
		nombre = sc.next();
		int contador = 0;
		FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\Gonsalito\\Desktop\\ufalusi.txt");
            BufferedReader entrada = new BufferedReader(fr);
            int car = entrada.read();         //se lee el primer carácter del fichero
            while (car != -1) {               //mientras no se llegue al final del fichero                        
                System.out.print((char) car); //se nuestra por pantalla
                car = entrada.read();         //se lee el siguiente carácter del fichero   
                
                contador++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
		
		
		
		
		
		
	}

}
