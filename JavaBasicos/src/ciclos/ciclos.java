package ciclos;

public class ciclos {
public static void main (String[] args) {
	
	//while
	
	/*int control = 0;
	
	while (control < 10) {
		
		System. out.println ("control =" + control );
		control++;
	}*/
	
   
	//do while ejecuta una vez, antes de validar la condicion

	/*int control = 0;
	
	do {
		
		//código a ejecutar 
		
		System.out.println ("control =" + control);
		//modificador de la variable de control
		control++;
		
		
	}while (control < 3);*/
	
	//for 
	
	/*for ( int i=0; i< 3; i++) {
		
		System.out.println ("Control = " + i);
		
		
	}*/
	
	//break & continue 
	for (int i=0; i <10; i++) {
		if (i % 2 == 0) { //solo se muestra cuando el valor  i se aun numero par 
		
		//break; //termina elciclo
		//solo deja que se ejecute una vez lo que está antes
		
			continue; //permite saltarnos una ejecución del ciclo
			//deja que continue el ciclo
		
		}
		
		System.out.println ("Control =" + i);
		
	}
	
	for (int i=0; i<3; i++) {
		System.out.println ("Control2 =" + i);
		continue;
	}
	
	
	
	
	
}
}
