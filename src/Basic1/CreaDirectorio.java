package Basic1;

import java.io.File;
import java.io.IOException;

public class CreaDirectorio {

	public static void main (String []Args) {
		
		File d = new File("NUEVODIR");
		d.mkdir();
		
		
		File f1= new File(d, "fichero1.txt");
		File f2= new File(d,"fichero2.txt");
		
		try {
			
			if(f1.createNewFile()) {
				
				System.out.println("Fichero1 creado correctamente ");
				
			}else {
				
				System.out.println("No se puede crear el fichero1.");
			}
			
			if(f2.createNewFile()) {
				System.out.println("Fichero2 creado correctamente ");
				
			}else {	
				System.out.println("No se puede crear el fichero2.");
				
			}
			
			/*Renombramos el fichero creado anteriormente. En este caso el fichero1*/
			f1.renameTo(new File(d,"Fichero1Nuevo.txt"));
			
		}catch(IOException e) {
			
			System.out.println("Error" + e);
			e.printStackTrace();
			
			
				
		}
	}
	
}
