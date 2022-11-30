package Ficheros_Binarios;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*Tenemos una clase Punto con la siguiente definición de propiedades y métodos

Punto
coordX: int
coordY: int
color: String

Punto (int x, int y, String color)
getCoordX(): int
getCoordY(): int
getColor(): String
toString(): String

Se pide confeccionar un método Java que reciba una lista de objetos de la clase Punto y el nombre de un archivo.
 El método escribirá en dicho archivo los objetos Punto de la lista usando un flujo de bytes.
*/


public class EjercicioBi_2_3_y4 {
	
	private ArrayList<Punto>listaPuntos;
	
	private String nombreFich = "archivosPunto.dat";
	
	
	
	public EjercicioBi_2_3_y4() {
		listaPuntos = new ArrayList<Punto>();
	}

	//Metodo para guardar los datos en el fichero
	public void salvarArrayList() throws IOException {
		
		//miramos si existe el fichero
		File f = new File(nombreFich);
		
		if(!f.exists())f.createNewFile();
		
		//Creamos el flujo de salida para que salgan los datos del fichero
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		
		//Recorro el arraylist con el for
		for(Punto p : listaPuntos) {
			//Orden en que escribo coordx, coordy, color
			dos.writeInt(p.getCoordx());
			dos.writeInt(p.getCoordy());
			dos.writeUTF(p.getColor());
		}
		
		dos.close();
		
		
	}

	//Crear un metodo que lea el fichero
	
	
	public void leerFichero() throws IOException {
		
		File f =  new File(nombreFich);
		if(!f.exists())throw new FileNotFoundException("No se ha encontrado el archivo");
		
		DataInputStream dis = new DataInputStream(new FileInputStream(f));
		
		boolean salir = false;
		
		do {
			try {
			int Coordx = dis.readInt();
			int Coordy = dis.readInt();
			String color = dis.readUTF();
			
			//Crea el objeto punto
			Punto p = new Punto(Coordx, Coordy, color);
			//comprobamos si el arraylist es nulo o no es nulo
			if(listaPuntos == null) listaPuntos = new ArrayList<Punto>();
			listaPuntos.add(p);
			//ESTE METODO DE ARRIBA SE PUEDE CAMBIAR CON aniadePuntos ya que para eso esta creado el metodo.
			
			}catch(EOFException e1) {
				salir = true;
			}
		}while(!salir);
	
	}
	
	
	public void aniadePuntos (Punto p) {
		if(listaPuntos == null) listaPuntos = new ArrayList<Punto>();
		listaPuntos.add(p);
		
	}
	
	public void mostrarPantalla() {
		for(int i =0; i< listaPuntos.size(); i++) {
			System.out.println(listaPuntos.get(i));
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		EjercicioBi_2_3_y4 miLista = new EjercicioBi_2_3_y4();
		
		miLista.aniadePuntos(new Punto(30,25,"azul"));
		try {
			miLista.salvarArrayList();
			miLista.leerFichero();
			miLista.mostrarPantalla();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
