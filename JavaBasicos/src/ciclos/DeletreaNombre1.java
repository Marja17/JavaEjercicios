package ciclos;

import java.util.Scanner;

public class DeletreaNombre1 {
public static void main (String [] args ) {
		
		/*Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.

		Ejemplo: "Juan"
		"J"
		"u"
		"a"
		"n"
		Como pista pueden investigar c�mo se usan los siguientes m�todos de String:
length()
charAt(i)
*/
		
		
        
        System.out.print("Ingresa tu nombre: ");
        Scanner console = new Scanner(System.in);
        String nombre = console.nextLine();
        for (int i = 0; i < nombre.length(); i++) {
        	char letras = nombre.charAt(i);
        	System.out.println ("Elemento del nombre "+ letras);
        }
        
      
                

}

}
