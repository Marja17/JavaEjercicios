import java.util.Scanner;

public class NumeroMayor {
	
	public static void main (String[] args ) {
	/*
		 * Pedir 3 n�meros al usuario y mostrar un mensaje con el
		 * n�mero mayor
		 * */
	System.out.println ("Introduce tu primer n�mero ");
	Scanner primerNum = new Scanner (System.in);
	int num1 = primerNum.nextInt();
	
	System.out.println ("Introduce tu segundo n�mero ");
	Scanner primerSeg = new Scanner (System.in);
	int num2 = primerSeg.nextInt();
	
	System.out.println ("Introduce tu tercer n�mero ");
	Scanner primerTer = new Scanner (System.in);
	int num3 = primerTer.nextInt();
	
	if (num1 > num2 && num1 > num3){
		
		System.out.println ( num1 + " : Es tu numero mayor");
		
	 
	}else if (num2 > num1 && num2 > num3) {
		
		System.out.println ( num2 + " : Es tu numero mayor");
		
	}else {
		
		System.out.println ( num3 + " :  Es tu numero mayor");
		
	}
	
	}

}
