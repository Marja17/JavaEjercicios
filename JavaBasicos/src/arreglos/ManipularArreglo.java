package arreglos;

public class ManipularArreglo {

	public static void main (String [] args) {
		
		/*Crea una clase llamara ManipularArreglo
		crea un array con los siguientes números enteros:

		1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		Crea un programa que use un ciclo que tome los números de arreglo y devuelva la suma total, la suma de los números pares y la suma de los números impares.*/
		int  numeros [] = new int [] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int sumTotal = 0;
		int sumPares = 0;
		int sumImpares = 0;
		
		for (int i=0; i < numeros.length; i++) {
			sumTotal = sumTotal + numeros [i];
			
			if (numeros [i] %2== 0) {
				sumPares = sumPares + numeros[i];
				System.out.println ("numero par: " + numeros[i]);	
			}else {
			
			sumImpares = sumImpares + numeros [i];
			System.out.println ("numero impar: " + numeros [i]);
		}
		
		}
		
		System.out.println ("Suma total: " + sumTotal);		
		System.out.println ("Suma de los pares es: " + sumPares);
		System.out.println ("Suma de los impares es: " + sumImpares);	
	
}




}
