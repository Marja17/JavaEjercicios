package metodos;

public class Metodos {
	
	//public static void main (String [] args) {
		//M�todo es una funci�n 
		
	    //atributos de la clase 
		int a, b;
		
		//Metodos  void (vac�o)
		
		public void sumar () {
			
			int resultado = a + b ;
			System.out.println ("El resultado de sumar " + a  + " m�s " + b + " es "+ resultado);
		}
			//metodo con retorno de valores
			public int sumaConRetorno() {
				//int = a + b
						return  a + b;
				
			}
         //argumentos 
			//suma argumentos 
			
			public double  multiplicarConArgumentos (int arg1 , double arg2) {
				int c = arg1;
				double  d = arg2;
				return c * d;
			}
			
			
			public static void imprimirNombre (String nombre) {
				System.out.println ("Mi nombre es: " + nombre);
			}
	}


