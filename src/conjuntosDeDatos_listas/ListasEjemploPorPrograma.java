package conjuntosDeDatos_listas;

import java.util.ArrayList;
import java.util.List;

/* En resumen, ArrayList es como una caja espec�fica que puede cambiar de tama�o seg�n 
 * lo que guardes dentro, mientras que List es como un conjunto de instrucciones que te dice 
 * c�mo usar cualquier tipo de caja que pueda guardar cosas.*/


public class ListasEjemploPorPrograma {

	public static void main(String[] args) {
		// Creamos una lista vac�a
		List<String> lista = new ArrayList<>();
		
		// Agregamos elementos a la lista
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");

		// Imprimimos la lista
		System.out.println("Lista creada por programa:");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}

}
