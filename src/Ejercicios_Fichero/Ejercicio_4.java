package Ejercicios_Fichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_4 {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Dame una ruta para encontrar un fichero");
	String fich = sc.nextLine().trim();

	File ficheroOrigen = new File(fich);

	if(ficheroOrigen.length() != 0) {
		// Instanciamos un objeto de tipo FileReader y BufferedReader

		try {
			FileReader ficheroLectura = new FileReader(ficheroOrigen);

			BufferedReader ficheroAleer = new BufferedReader(ficheroLectura);

			String linea;
			int contadorLineas = 0;

			ArrayList<String> arraylist = new ArrayList<>();

			while ((linea = ficheroAleer.readLine()) != null) {
				arraylist.add(linea);
				contadorLineas++;
			}

			// Cerramos el flujo de lectura
			ficheroAleer.close();

			for (int i = 0; i < arraylist.size(); i++) {
				System.out.println(arraylist.get(i));
			}

			System.out.println("-------------------");

			if(contadorLineas < 10) {
				for(int i = 0; i < contadorLineas; i++) {
					System.out.println(arraylist.get(i));
				}
			} else {
				for (int i = contadorLineas - 10; i < contadorLineas; i++) {
				System.out.println(arraylist.get(i));
			}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	} else {
	System.out.println("Fichero vac�o");
	}
	sc.close();
	}

}


