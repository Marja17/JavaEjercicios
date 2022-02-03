import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.*;

public class Colecciones {
	
	public static void main (String [] args) {
		
		//Las colecciones nos sirven para alamacenar un conjunto de objetos 
		//Las diferencia de las colecciones y los objetos 
		//es que las colecciones son dinamicas, pueden cambiar el numero de objetos agregados. 
	  //set 
		//hay 3 implementaciones
		//no puede contener elementos repetidos
		
		//HahSet
		//los elementos no mantienen un orden 
		//Es la implemantacion más RÁPIDA
		
		/*Set <String> frutas = new HashSet <String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
				
				//TreeSet
				//LinkedHashSet
		//foreach, puede recorrer una coleccion en cada recorrido recupera el valor y lo podemos alamcenar en una variable
		//Sintaxis
		//for (tipoDatoElemento variable  : elementoArecorrer)
		/*for (String fruta : frutas) {
			
			System.out.println (fruta); 
		}*/
		
		//TREESETH 
	
		/*Set <String> frutas = new HashSet <String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
for (String fruta : frutas) {
			
			System.out.println (fruta); 
		}*/
		
		//TreeSet
		//Esta implementacion ordena los elementos enfuncion 
		
		/*Set <String> frutas = new TreeSet <String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
for (String fruta : frutas) {
			
			System.out.println (fruta); 
		}*/
		
		//LinkedHashSet
		//ordena los elementos en orden de inserccion 
		//es más costoso que HashSet
		
		/*Set <String> frutas = new LinkedHashSet <String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
for (String fruta : frutas) {
			
			System.out.println (fruta); 
		}*/
		
		//List
		//se permiten elementos duplicados  
		//acceder a elementos especificos
		//buscar elementos
		
		
		
		//ArrayList
		
		List <String> pokemones = new ArrayList <String>();
		pokemones.add("Chicorita");
		pokemones.add ("Eevee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		pokemones.add(2, "Pikachu");
		//remove rumueve el elemento de la posicion especificada
		
		pokemones.remove (5);
		
		//set  
		//remplaza al elemento por el que especifiquemos de la posicion que le demos 
		pokemones.set(0, "Flareon" );
		
		for (String pokemon : pokemones) {
			System.out.println (pokemon);
		}
		
		//add si agregamos un indice y un elemento;
		//el elemento en el indice y realiza un desplazamiento
		//es decir no borre el elemento  en la posicion , sólo lo desplaza 
		
		System.out.println ("*************************");
		System.out.println (pokemones.get(3));
		//LinkedList
		
		// indexOf, nos va a devolver la posición del elemento 
		//y si el elemento no se encuentra nos devuelve -1
		
		System.out.println (pokemones.indexOf ("Gengar"));
	 //nos devuelve el primer elemento que coincida 
		//System.out.println (pokemones.lastIndexOf ("Gengar"));
		System.out.println (pokemones.indexOf ("Togepi"));
		System.out.println ("*************************");
		
		//Linkedlist
		//Es una lista doblemente enlazada
		List <String> digimones = new LinkedList<String>();
		digimones.add("Aguamon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
	//Map
	//Mapa <key, value>
	//no claves duplicadas 
	Map <Integer ,String> usuarios = new HashMap<Integer, String > ();
	usuarios.put (1, "Carlos Eduardo");
	//usuario.put (2, "Raul); HashMap no acepta claves duplicadas 
	usuarios.put (2, "Raul");
	usuarios.put  (3,  "Ro");
	
	System.out.println ("*************************");
	System.out.println (usuarios.get(3));
	
	//Linkedlist
	//
	
	
	//KeySet
	//Nos permite recuperarel nombre de la clave 
	
	System.out.println (usuarios.keySet ());
	
	//values
	//nos permite recuperar el valor directamente 
		
	System.out.println (usuarios.values ());
	Map< String, String> tamales  = new TreeMap<String, String>();
	tamales.put ("Oaxaqueño", "Mole rojo");
	tamales.put("Torta", "Mole verde");
	tamales.put("Dulces", "Gansito");
	tamales.put("Salado", "Cochinita");
	
	System.out.println ("*************************");
	System.out.println (tamales.keySet ());
	System.out.println (tamales.values ());
	
	System.out.println (tamales);
	
	tamales.entrySet().forEach (elemento ->{//funfion lambda
		System.out.println(elemento.getKey().toString ()+ elemento.getValue ().toString ());
	    System.out.println (elemento.getValue ());
	});
	
	
	//LinkedHashMap
	Map <Integer, String> carros = new LinkedHashMap <Integer, String>();
	carros.put (1, "Volvo");
	carros.put( 567, "Pointer");
	carros.put(8, "Mustang");
	System.out.println ("*************************");
	System.out.println (carros.keySet ());
	System.out.println (carros.values ());
	
	
	}
		

}
