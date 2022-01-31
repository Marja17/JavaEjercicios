import java.util.Scanner;

public class CalculadoraM {
	
		
		public static void main (String [] args) {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println ("Introduce un número");
			double  numero1 = sc.nextDouble ();
			System.out.println ("Introduce otro número");
			double numero2 = sc.nextDouble ();
					
			System.out.println ("Operaciones=  1.suma, 2.resta, 3.division, 4.multiplicacion");
		    int operacion = sc.nextInt();
		    
		    sc.close();
			
			
			switch (operacion) {
			case 1:
			double resultadoSum= numero1 + numero2;
				System.out.println (resultadoSum);
				break;
				
			case 2:
				double resultadoRes= numero1 - numero2;
				System.out.println (resultadoRes);
				break;
				
			case 3:
				double resultadoDiv= numero1 / numero2;
				System.out.println (resultadoDiv);
				break;
				
			case 4:
				double resultadoMul = numero1 * numero2;
				System.out.println (resultadoMul);
				break;
				
				default:
					System.out.println ("No es operacion");
				
				
				
				

				
				
				
			}
			
			
			
			
			
		
		
		/*
		   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
		   */
		}
		

	}

