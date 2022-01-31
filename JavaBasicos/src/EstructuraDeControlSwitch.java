import java.util.Scanner;

public class EstructuraDeControlSwitch { 
	
	public static void main (String [] args) {
		
	

	//Estructuras de control nos sirve para controlar el flujo de comportamiento de un progrma para la toma de decisiones 
	
	/*switch (condicion_a_evaluar){
	 * case "valor":
	 // codigo a ejecutar 
	  //break;
	   ...
	   case "n"
	   //codigo a ejecutar
	    //break;
	     default:
	     //codigo a ejecutar 
	      } */
	 //solicitarle al usuario un dia de la semana y  mostrar un mensaje 
	System.out.println("Introduce un día de la semana y recibe un bonito mensaje :) tkm ");
	Scanner sc = new Scanner (System.in);
	String dia = sc. nextLine();
	
	switch(dia.toLowerCase ()) {
	case "lunes":
		System.out.println ("Ya mero es viernes, toma un cafe");
		break;
		
	case "martes":
		System.out.println ("Lunes chiquito. Esto esta cansado, pero ya casi");
		break;
		
	case "miercoles":
		System.out.println ("Miércoles, pero a qué costo.");
		break;
		
	case "jueves":
		System.out.println ("Juebebes." );
		break;
		
	case "viernes":
		System.out.println ("Viernes de fiesta hasta morir");
		break;
		
	case "sabado":
		System.out.println ("Se teolvido que hoy tambien trabjas");
		break;
		
	case "domingo":
		System.out.println ("No te arrepientas y descansa, mañana comienza todo de nuevo");
		break;
		
		default:
			System.out.println ("Ese no es un día >:(");
			
	}
}

}

