package Ficheros_Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*Escribe un programa Java que copie archivos de cualquier tipo (ejecutables, imágenes jpg, música mp3: lo que sea). Para ello, tiene que preguntar primero el nombre del archivo de origen (que debe de existir) 
 * y luego el de destino. Después, leerá byte a byte el archivo de origen e irá escribiendo esos bytes en el archivo de destino.
Comprueba que el archivo copiado es idéntico al primero intentando abrirlo: si era un mp3, debería reproducirse sin errores; 
si era un jpg, la imagen debería permanecer inalterada; si era un ejecutable, el programa que contiene debería funcionar; etc.
*/
public class EjercicioBi_1 {
	
	 public boolean copiaFich(String fromFile, String toFile) {
	        File origen = new File(fromFile);
	        File destino = new File(toFile);
	        if (origen.exists()) {
	            try {
	                InputStream in = new FileInputStream(origen);
	                OutputStream out = new FileOutputStream(destino);
	                // We use a buffer for the copy (Usamos un buffer para la copia).
	                byte[] buf = new byte[1024];
	                int len;
	                while ((len = in.read(buf)) > 0) {
	                    out.write(buf, 0, len);
	                }
	                in.close();
	                out.close();
	                return true;
	            } catch (IOException ioe) {
	                ioe.printStackTrace();
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }
	 
	 public static void main(String[] args) {
		 EjercicioBi_1 javaIOUtils = new EjercicioBi_1();
	        String fromFile = "C:\\Users\\Gonsalito\\Desktop\\origen.dat";
	        String toFile = "C:\\Users\\Gonsalito\\Desktop\\destino.dat";
	        boolean result = javaIOUtils.copiaFich(fromFile, toFile);
	        System.out.println(result?
	            "Success! File copying (Éxito! Fichero copiado)":
	                "Error! Failed to copy the file (Error! No se ha podido copiar el fichero)");
	 
	    }
	}


