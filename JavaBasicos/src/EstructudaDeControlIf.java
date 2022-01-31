import java.util.Scanner;

public class EstructudaDeControlIf {

	
	public static void main (String [] args) {
		
		//Estructura de control de flujo
		//Nos sirve para la toma de decisiones 
		//Estructuras de control de flujo nos sirven para cambiar el flujo de nuestro programas 
		//Evaluando una condiciuon y apartir de la evalucion se realiza una acción u otra
		
		/*if (condicion){
			codigo 
		}else { no es obligatorio, es todo lo restante del codigo 
			codigo
		}*/
		
		System.out.println ("Introduce tu edad ");
		Scanner sc = new Scanner (System.in);
		int edad = sc.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("Eres mayor de edad");
			
		}else {
			
			System.out.println ("Eres menor de edad");
			
		}
		
	}
};
