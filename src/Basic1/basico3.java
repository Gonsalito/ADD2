package Basic1;



/*Inicializa tres enteros con numeros aleatorios. 
 * Si el primer entero es igual al segundo entero y ambos independientemente son mayores que el tercer entero, mutiplica los tres. 
 * En caso contrario suma los tres. Muestra el resultado en la consola.*/

public class basico3 {
	

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
       
       int []registro= new int[3];
       for(int i = 1; i<=3; i++)
    	     System.out.println((int)(Math.random()*6 + 1));
    	   if((1==2) && ( 1<3 ) && ( 2<3 )  ){
    		   
    		   int result = 1*2 * 3;
    		   System.out.println(result);
    		   
    		   
    	   }else {
    		   int result = 1 + 2 + 3;
    		   System.out.println(result);
    	   }
    	 
    			   
       }
	}
	
