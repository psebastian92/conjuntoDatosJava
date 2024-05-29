/*
	Un enum es una estructura de datos que representa un conjunto FIJO y limitado de valores constantes.
	Las constantes dentro de un enum son objetos unicos que pueden tener comportamiento adicional asociado a ellos.
	Los enums proporcionan seguridad de tipo, lo que significa que el compilador puede detectar errores de tipo durante 
	la compilacion. Son mas legibles y mantenibles que los arrays o las listas, ya que proporcionan nombres 
	descriptivos para cada constante.
 */

package conjuntosDeDatos_enum;

import java.util.Scanner;

public class A_EnumEjemploDias {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Tengo que usar el mismo nombre del archivo "enum"
		A_DiasDeLaSemana dia;
		String ingresoDatos;

		// Realizar alguna lógica basada en el día de la semana
		System.out.print("Ingrese un día de la semana: ");
		ingresoDatos = entrada.nextLine().toUpperCase();
		// toUpperCase() sirve para pasar todo a mayusculas. Ya que los datos en enum
		// estan en mayusculas.

		dia = A_DiasDeLaSemana.valueOf(ingresoDatos);

		switch (dia) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("Es un día laboral.");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Es fin de semana.");
			break;
		}

	}

}
