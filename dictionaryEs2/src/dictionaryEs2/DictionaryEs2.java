package dictionaryEs2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DictionaryEs2 {

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
	 // Creamos un objeto Scanner para leer la entrada del usuario
	    Scanner scanner = new Scanner(System.in);

	    // Creamos un objeto Random para elegir palabras al azar
	    Random random = new Random();

	    // Contadores para llevar un registro de las respuestas correctas e incorrectas del usuario
	    int correctas = 0;
	    int incorrectas = 0;

	    // Elegimos 5 palabras al azar del diccionario
	    for (int i = 0; i < 5; i++) {
	      // Obtenemos una palabra al azar del diccionario
	      String palabra = (String) dictionary.keySet().toArray()[random.nextInt(dictionary.size())];

	      // Pedimos al usuario que escriba la traducción al inglés de la palabra
	      System.out.println("Traducción al inglés de la palabra '" + palabra + "':");
	      String respuesta = scanner.nextLine();

	      // Comprobamos si la respuesta del usuario es correcta
	      if (respuesta.equals(dictionary.get(palabra))) {
	        // Si la respuesta es correcta, aumentamos el contador de respuestas correctas
	        correctas++;
	      } else {
	        // Si la respuesta es incorrecta, aumentamos el contador de respuestas incorrectas
	        incorrectas++;
	      }
	    }

	    // Mostramos al usuario cuántas respuestas correctas e incorrectas tiene
	    System.out.println("Respuestas correctas: " + correctas);
	    System.out.println("Respuestas incorrectas: " + incorrectas);
	  }
	}

