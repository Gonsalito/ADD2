package Basic1;

import java.io.FileWriter;
import java.io.IOException;

public class EscribiendoTex {

	public static void main (String[]Args) {
		
		String frase = "esto es un ejemplo";
				
		try {
			
			/*Te crea un fichero*/
			FileWriter f = new FileWriter("C:\\Escribe.txt", true);
			char[] cad = frase.toCharArray();
			
			for(int i=0; i<cad.length;i++) {
				
				f.write(cad[i]);
				
			}
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}
