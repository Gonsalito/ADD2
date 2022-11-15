package Basic1;

/*Inicializa una matriz de tipo entero y almacena 10 enteros en ella. Luego calcula la suma detodos 
 * los enteros en la matriz y muestra el resultado en la consola*/

public class Matrices {

	public static void main(String[] args) {
        int arr[] = new int[] {12,34,45,21,33,4,7,34,25,12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Suma de la matriz = "+sum);
        
    }
	
	
}
