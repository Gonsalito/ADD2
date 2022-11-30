package FicheroSec;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio4 {
	

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Gonsalito\\Desktop\\Ufalusi.txt");
	    StringBuilder builder = new StringBuilder();
	    int n = 0;
	    try {
	        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\Gonsalito\\Desktop\\Ufalusi.txt", "r");
	        long pos = file.length() - 1;
	        randomAccessFile.seek(pos);

	        for (long i = pos - 1; i >= 0; i--) {
	            randomAccessFile.seek(i);
	            char c = (char) randomAccessFile.read();
	            if (c == '\n') {
	                n--;
	                if (n == 0) {
	                    break;
	                }
	            }
	            builder.append(c);
	        }
	        builder.reverse();
	        System.out.println(builder.toString());
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
	}
}

