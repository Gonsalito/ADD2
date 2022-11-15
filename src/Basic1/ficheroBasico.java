package Basic1;

import java.io.File;

public class ficheroBasico {
	
	public static void main (String []Args) {
		
		
		System.out.println("Informacion sobre el fichero");
		
		File f = new File("C:\\Users\\jony_\\eclipse-workspace\\AccesoDD");
		if(f.exists()) {
			
			
			System.out.println("Nombre del fichero: " + f.getName());
			System.out.println("Ruta: "+f.getAbsolutePath());
			System.out.println("Tamño: " + f.length());
			
		}else {
			
			System.out.println("El fichero no se ha encontrado o no existe.");
		}
		
	}
	

}
