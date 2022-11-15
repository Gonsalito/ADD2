package Basic1;

import java.util.Scanner;

/*Declara una variable A de tipo entero y asignale un valor. Muestra un mensaje indicando si A es par o impar
 *Declara una variable B de tipo entero y asignale un valor.Indica si es positivo o negativo
 *Declara una variable C de tipo entero y asignale un valor.Si es par o impar, multiplo de 5 o de 10, y mayor o menor que 100.
 *Declara una variable D de tipo entero y asignale un valor.leer un caracter y comprobar si es un numero */


public class basico5 {
	
	public static void main (String []Args) {
					
			 Scanner sc = new Scanner(System.in);
			 int A;
			 int B;
			 int C;
			 int AUX = 5;
			 int AUX2 = 10;
			 int D;
			 
			 System.out.println("Introduce el valor de A: ");
			 A= sc.nextInt();
			
					if (A %2 == 0) {
					 
						System.out.println("Es par");
					
					}else {
						
						System.out.println("Es impar");
					}
					
					
					
					
					
					System.out.println("Introduce el valor de B: ");
					B=sc.nextInt();
					if (B < 0) {
						
						System.out.println("El valor es NEGATIVO");
						
					}else {
						System.out.println("El valor es POSITIVO");
					}
					
					
					
					
					
					
					System.out.println("Introduce el valor de C: ");
					C=sc.nextInt();
					if (C < 0) {
						
						System.out.println("El valor es NEGATIVO");
					}else {
						System.out.println("El valor es POSITIVO");
					}
					
					if (C %2 == 0) {
						 
						System.out.println("Es PAR");
					
					}else {
						
						System.out.println("Es IMPAR");
					}
					
					if (C % AUX == 0 ) {
						
						System.out.println("Es multiplo de 5");
					}else {
						System.out.println("NO es multiplo de 5");
					}			
					if (C % AUX2 == 0 ) {
						
						System.out.println("Es multiplo de 10");
					}else {
						System.out.println("NO es multiplo de 10");
					}
					
					if (C < 100) {
						
						System.out.println("El valor es MENOR que 100");
					}else {
						System.out.println("El valor es MAYOR que 100");
					}
					
					
					
					
					System.out.println("Introduce el valor de D: ");
					D=sc.next().charAt(0);
					if (Character.isDigit(D)) {
						
						System.out.println("Es un caracter");
					}else {
						System.out.println("NO es un caracter");
					}
					
		}
		
	
}
		
		



