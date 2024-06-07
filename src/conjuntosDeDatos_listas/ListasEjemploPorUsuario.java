package conjuntosDeDatos_listas;

/* En resumen, ArrayList es como una caja espec�fica que puede cambiar de tama�o seg�n 
 * lo que guardes dentro, mientras que List es como un conjunto de instrucciones que te dice 
 * c�mo usar cualquier tipo de caja que pueda guardar cosas.*/
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ListasEjemploPorUsuario {
	  public static void main(String[] args) {
	        // Creamos una lista vac�a
	        List<String> lista = new ArrayList<>();
	        
	        // Creamos un objeto Scanner para leer la entrada del usuario
	        Scanner scanner = new Scanner(System.in);

	        // Solicitamos al usuario ingresar elementos hasta que ingrese "fin"
	        
	        System.out.println("Ingrese elementos a la lista (escriba 'fin' para terminar):");
	        String entrada = scanner.nextLine();
	        
	        while (!entrada.equalsIgnoreCase("fin") ) { 
	            lista.add(entrada);
	            entrada = scanner.nextLine();
	        }

	        // Imprimimos la lista
	        System.out.println("Lista creada por el usuario:");
	        for (String elemento : lista) {
	            System.out.println(elemento);
	        }
	        System.out.println("Cantidad de elementos: "+lista.size());

	        // Cerramos el scanner
	        scanner.close();
	    }
}
