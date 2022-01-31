import java.util.Scanner;

public class AngulosTri {
	
	public static void main (String [] args) {
		
		//Pedirle 3 ángulos a un usuario y decirle si es un triangulo válido
		
		System.out.println ("Introduce tu primer angulo ");
		Scanner angulo1 = new Scanner (System.in);
		int num1 = angulo1.nextInt();
		
		System.out.println ("Introduce tu segundo angulo ");
		Scanner angulo2 = new Scanner (System.in);
		int num2 = angulo2.nextInt();
		
		System.out.println ("Introduce tu tercer angulo ");
		Scanner angulo3 = new Scanner (System.in);
		int num3 = angulo3.nextInt();
		
		int suma = num1 + num2 + num3;
		
		
		if (  suma  == 180) {
			
			System.out.println (" triangulo válido ");
		} else {
			
			System.out.println (" triangulo invalido ");
		}

	}

}
