package Basic1;

import java.util.Scanner;

/*Hacer un programa de venta de entradas, donde se ingrese por consola la edad del usuario 
 * y, en funcion de ella, se devuelva el precio de entrada que le corresponda pagar*/

public class basico4 {

	public static void main (String []args) {
		
		 Scanner sc = new Scanner(System.in);
		 int age;
		 System.out.println("Introduce tu edad: ");
		 age = sc.nextInt();
			
				if (age < 12) {
				 
					System.out.println("Eres menor de 12 años. Pagas 12euros ");
				
				} else if( age<20){
				    System.out.println("Eres menor de 20 años. Pagas 20 euros");
				}else {
					
					System.out.println("Eres mayor de 21 años. Pagas 30 euros");
				}
	}
}
