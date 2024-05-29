package conjuntosDeDatos_arrays;

import java.util.Scanner;

public class ArraysEjemplo {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		// Se declara un array del tipo String que tendra 4 elementos.
		String[] nombre = new String [4];
		
		/* Se utiliza "for" para recorrer el array.
		Se declara una variable entera "i", la cual comienza de 0. Esta variable sirve para asociarla
		con los índices de los arrays. 
		
		Imaginate que el array tiene varias cajas. La primera, esta etiquetada con el numero "0". 
		Este es el indice 0. 
		"For" sirve para recorrer el array. Comienza analizando que contiene la caja "0".
		
		*/
		
		// "For" PARA LLENAR EL ARREGLO
		
	
		
		for (int i = 0; i < nombre.length  ; i++) {
			
			// nombre.length sirve para medir la cantidad de elementos del array. 
			// Antes se declararon 4 elementos (linea numero 9).
			
			
			// Primero se asigna un nombre a nombre[0]. O sea, a la posicion "0" del array "nombre".
			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();

		}

		
		// "For" PARA MOSTRAR EN PANTALLA LO QUE CONTIENE EL ARREGLO. 
		for (int i = 0; i <= 3; i++) {

			System.out.println("Mostrar todos los nombres: " + nombre[i]);
			

		}
		

	}
}
