package Basic1;



/*1.-Declarar 4 variables de tipo entero A,B,C y D y asignarle un valor a cada una. A continuacion , realizar las instrucciones necesarias 
 *   para que B tome el valor de C, C tome el valor de A, A tome el valor de D y D el valor de B .
 * 
 * 2.-Declarar el numero entero N de 5 cifras y mostrar sus cifras igual de la siguiente manera: 
 * 3.-Lo mismo que el anterior pero al contrario*/

	public class Basico2 {
		public static void main (String []Args) {
	
		int A = 3;
		int B = 2;
		int C= 10;
		int D = 12;
		int Ayuda;
		System.out.println("Valores iniciales");
		System.out.println("Valor inicial de A= " + A);
		System.out.println("Valor inicial de B= " + B);
		System.out.println("Valor inicial de C= " + C);
		System.out.println("Valor inicial de D= " + D);
		Ayuda = B;
		B = C;
		C = A;
		A = D;
		D = Ayuda;
		System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C = " + C);
        System.out.println("A toma el valor de D -> A = " + A);
        System.out.println("D toma el valor de B -> D = " + D);
		
		
		}
	
		
		
		
	}
