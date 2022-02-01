package arreglos;

public class Arreglos {
	
	public static void main (String [] args) {
		
	
	//Solo un tipo de dato
	//especificar el tamaño o la camntidad de elementos que va a contener 
	//1 manera 
	int numeros [];
	numeros = new int [4]; //creando el arreglo
	//2 manera 
	String[] nombres = new String [4];//basado en 0. [0, 1, 2, 3 ]
	//3 manera
	//array literal 
	String [] Frutas = new String [] {"Manzana", "Platano", "Uva", "Pera"};
	
	numeros [0] = 10;
	numeros[1]= 8;
	numeros [2]= 100;
	numeros [3] = 200;
	
	nombres[0]= "Juan";
	nombres[1]= "Pedro";
	nombres[2]= "Antonio";
	nombres[3]= "Felipe";
	//en plural
	
	System.out.println(numeros [0]); 
	System.out.println(numeros);
			
	for (int i=0; i<numeros.length; i++) {
		//en arrays, length es una propiedad 
		System.out.println ("Elemento de numeros "+ numeros[i]); //[0], [1]
		System.out.println ("Elemento de numeros "+ nombres[i]);
		System.out.println ("Elemento de frutas "+ Frutas[i]);
		System.out.println ("---------------------------------");
	}
	
}
}

