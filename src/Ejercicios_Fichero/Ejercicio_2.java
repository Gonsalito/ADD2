package Ejercicios_Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Ejercicio_2 {
	
        public static void main(String[] args) {

                String nombreFichero = null;
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Introduce la ruta: ");
                nombreFichero = sc.next();
                sc.close();

                try {
                        File fichero = new File(nombreFichero);
                        
                                if (fichero.length() == 0) {
                                        System.out.println("Fichero vacio.");
                                } else {
                                        int contador = 0;
                                        String linea;
                                        BufferedReader flujoLectura = new BufferedReader(new FileReader(fichero));
                                        while ((linea = flujoLectura.readLine()) != null) {
                                                contador++;
                                                System.out.println(contador + " " + linea);
                                        }
                                        flujoLectura.close();
                                }
             
                    } catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}

        }
}


