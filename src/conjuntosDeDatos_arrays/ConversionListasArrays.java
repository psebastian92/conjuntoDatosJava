package conjuntosDeDatos_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionListasArrays {
	public static void main(String[] args) {
		// Paso 1: Crear un array de cadenas con nombres de frutas
		String[] arrayDeFrutas = { "Manzana", "Banana", "Cereza", "Durazno", "Kiwi" };

		// Paso 2: Convertir el array a una ArrayList
		List<String> listaDeFrutas = new ArrayList<>(Arrays.asList(arrayDeFrutas));

		// Paso 3: Añadir nuevas frutas a la ArrayList
		listaDeFrutas.add("Mango");
		listaDeFrutas.add("Papaya");

		// Paso 4: Eliminar una fruta específica de la ArrayList
		listaDeFrutas.remove("Banana");

		// Paso 5: Convertir la ArrayList de vuelta a un array
		String[] arrayFinal = listaDeFrutas.toArray(new String[0]);
		/*
		 * En Java, el método toArray(T[] a) de la clase ArrayList convierte la lista en
		 * un array del mismo tipo que el array pasado como argumento. El propósito de
		 * pasar un array de tamaño 0 es hacer que ArrayList cree un nuevo array del
		 * tipo adecuado (en este caso, String) y lo devuelva.
		 */
		
		
		// Paso 6: Imprimir el array final
		System.out.println("Array final de frutas:");
		for (String fruta : arrayFinal) {
			System.out.println(fruta);
		}
	}
}
