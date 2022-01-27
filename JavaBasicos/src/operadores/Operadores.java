package operadores;


import java.util.Scanner;

public class Operadores {

	 public static void main (String[] args) {
		 
		 //Operadores Aritméticos 
		 // +, -, /, *, %,
		 int a = 10;
		 int b = 20;
		 double c = 10.5;
		 
		 
		 int c1 = a + b;
		 System.out.println (c);
		 
		 String str1 = "El resultado de la suma es: ";
		 System .out. println (str1 + c);
		 
		  //resta
		 System.out.println ("El resultado de la resta " + ( a - b));
		 
		 
		 //división
		 int division = a / b;
		 System.out.println("El resultado de la resta es: " + division);
		
		 double division2 =  (double) a/b ;
		 System.out.println("El resultado de la division es: " + division2);
		 //por lo menos uno de lps datos debe ser de tipo double para que nos represente
		 //los decimales correctamente
		 // 10.0 / 20 = 0.5
		 
		 double multiplicacion = c * b;
		 System. out. println ("El resultado es :" + multiplicacion);
	   
		 //modulo
		 int modulo = a % b;
		 System.out. println ("El módulo de la operación es:   " + modulo);
		 
	      /*
	       * operador de asignación 
	       * =
	       */
		 int d = 5, e; //inicializar las variables vacias 
		 e = 6;
		 System.out.println (d + " , " + e);
		 
		 //Operadores de declaracion compuesta 
		 //+= , -=, /=, *=, %=
		 //una operacion simplificada
		 
		 int f = 0, g = 5;
		  f += 5;
		  //f = f + 5
		  System.out. println (f);
		 
		 //operadores relacionales 
		  /* <, >, <=, >=
		   * == igualdad
		   * != diferencia 
		   * Resultado un valor de tipo boolean / booleano (true, false)
		   */
		  
		  int h = 15, i = 25;
		  String j = "Hola";
		  
		  System.out.println (h > i); //false
		  System.out.println (i != h);//true
		  //System.out.println (h != j); son valores distintos y no se pueden comparar
		  
		  
		  //Operador unario
		  /* ++, --
		   * preasignacion ++k se le asigna un valor antes de usarse
		   * postasignacion primero lee enl valor y despues le suma 1
		   *
		   */
		  
		  int k = 0, l = 0;
		  k++;
		  System.out.println (k);
		  System.out.println(--l);
		  
		  //Precedencia de operadores 
		  
		  int operaciones  =  (4 + 5) * 6 / 3;//14
		  //5*6 =30
		  // 30 / 3 = 10
		  // 4 + 10 = 14
		  
		  System.out.println(operaciones);
		  
		  int x = 0, y = 0;
		  int operacion2 = ++x + y--;
		  //x=1, y= 0
		  System.out.println (operacion2); //
		  
		  //operador ternario
		  //es un if ..else abreviado
		  //solo nos permite tomar una decision 
		  
		  int edad = 18, 
				  
	       valor1 = (edad <= 18)? 2:1;
		  
		  //int resultado = (edad <= 18) ? (valor1 = 2) : (valor1 = 3); 
		  //parentesis son opcionales
		  // string resultado = (edad <= 18) ? "uno" : "dos";
		  //valor = (edad<=18) ? 2:1

		  System.out.println (valor1);
	    //operadores lógicos 
		  //and - &&
		  // or -||
		  //Not
		  
		  System.out.println(true && true); //true
		  System.out.println(true && false); //false
		  System.out.println (true || false); //true
		  System.out.println(true && !false);//true
		  
		  /*Crear un nuevo proyecto llamado NumeroParImpar
crear el método main
crear una función que evalúe si un número es par o impar (se puede usar el operador ternario)
Imprimir en terminal el resultado

*extra, investigar cómo usar la clase Scanner en java.*/


		  Scanner sc = new Scanner (System.in);
		  System.out.println("Escribe un número:");
		  int num = sc.nextInt();
		  System.out.println (num);
		  
	 }
	 
	 
}
