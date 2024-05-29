package conjuntosDeDatos_listas;

/* En resumen, ArrayList es como una caja específica que puede cambiar de tamaño según 
 * lo que guardes dentro, mientras que List es como un conjunto de instrucciones que te dice 
 * cómo usar cualquier tipo de caja que pueda guardar cosas.*/
import java.util.ArrayList;
import java.util.List;

public class ListasEjemploPorPrograma {

	public static void main(String[] args) {
		// Creamos una lista vacía
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
