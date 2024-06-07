package conjuntosDeDatos_arrays;

import java.util.Scanner;

public class busqueda_Strings_arrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nombres = { "Esteban", "Adriana", "Hugo", "Luciano" };
		
		boolean encontrado = false; 
		
		System.out.println("Ingrese un nombre a buscar");
		String nombreBuscado = scanner.next();

		for (int i = 0; i < nombres.length; i++) {
			
			if ( nombres[i].equalsIgnoreCase(nombreBuscado) ) { // NO se puede utilizar nombreBuscado == nombres[i]
				System.out.println("El nombre esta en el array");
				encontrado = true;
				break;
			}
		}
		
		if (encontrado == false) {
			System.out.println("No se encontro el nombre.");
		}

	}

}
