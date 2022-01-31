
import java.util.Scanner;
public class CuentaCliente {

		
		public static void main (String [] args) {
			
			/*// // si la cuenta es de menos de 1000
		// sila cuenta es de 1000 - 4999 10%
		// si la cuenta es de 5000 a 9999 20%
		// si la copra es de 10000 o más 30%
*/
			
			System.out.println ("Introduce tu cuenta ");
			Scanner cuentacliente = new Scanner (System.in);
			int cuenta = cuentacliente.nextInt();
			
			if (cuenta <= 1000){
				
				
				
				System.out.println ("No hay descuento");
			
				
				
			}else if(cuenta >= 1001 && cuenta <= 4999  ){
				double cuentadiez = cuenta * 0.90;
				
				System.out.println (cuenta + "=  Tu descuento es del 10% = " + "descuento total =  " +  cuentadiez );
				
				
				
			} else if (cuenta >= 5001 && cuenta <= 9999) {
				double cuentaviente = cuenta * 0.80;
				
				System.out.println ( cuenta +"=  Tu descuento es del 20%=  " + "descuento total =  " +   cuentaviente );
				
			}else {
				
				double cuentatreinta = cuenta * 0.70;
				
				System.out.println (cuenta + "=   Tu descuento es del 30% = " + "descuento total =  " +   cuentatreinta);
				
				
			}
			
			

	}
	
}

