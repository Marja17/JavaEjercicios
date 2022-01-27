package PrimerEjercicio;

import java.util.Scanner;

public class NumeroParImpar {
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		
		int numero1= sc.nextInt();
		System.out.println(numero1);
		
		
				
	
		if ((numero1 % 2) != 0) {
		//(numero1 % 2 == 0
			System.out.println ( numero1 + "  No es par");
		}else {
			
			System.out.println (numero1 + "  Es par ");
		}
	}

}
