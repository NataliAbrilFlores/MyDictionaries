package dicitonaryEs;

import java.util.HashMap;
import java.util.Scanner;


public class Dictionary {

	public static void main(String[] args) {
	
		// Creamos el diccionario como un objeto HashMap
	    HashMap<String, String> dictionary = new HashMap<>();

	    // Agregamos algunas palabras al diccionario
	    dictionary.put("Hola", "Hi");
	    dictionary.put("Nombre", "Name");
	    dictionary.put("Edad", "Age");
	    dictionary.put("Comida", "Food");
	    dictionary.put("Feliz", "Happy");
	    dictionary.put("Izquierda", "Left");
	    dictionary.put("Derecha", "Right");
	    dictionary.put("Escuela", "School");
	    dictionary.put("Bailar", "Dance");
	    dictionary.put("Libro", "Book");
	    dictionary.put("Paz", "Peace");
	    dictionary.put("Amor", "Love");
	    dictionary.put("Musica", "Music");
	    dictionary.put("Fiesta", "Party");
	    dictionary.put("Mascota", "Pet");
	    dictionary.put("Desarrollador", "Developer");
	    dictionary.put("Aire", "Air");
	    dictionary.put("Casa", "House");
	    dictionary.put("Carro", "Car");
	    dictionary.put("Soñar", "Dream");
	 // Creamos el escáner para leer la entrada del usuario
	    Scanner usuario = new Scanner(System.in);

	    System.out.println("Ingresa una palabra en español: ");
	    String palabra = usuario.nextLine();

	    // Revisamos si la palabra está en el diccionario
	    if (dictionary.containsKey(palabra)) {
	      // Si está, mostramos su traducción
	      System.out.println("La traducción es: " + dictionary.get(palabra));
	    } 
	    else {
	      // Si no está, mostramos un mensaje
	      System.out.println("Lo siento, no encontramos una traducción para esa palabra.");
	    }

	}

}
