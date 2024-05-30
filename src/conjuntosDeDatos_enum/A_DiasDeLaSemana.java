/*
	Un enum es una estructura de datos que representa un conjunto fijo y limitado de valores constantes.
	Las constantes dentro de un enum son objetos unicos que pueden tener comportamiento adicional asociado a ellos.
	Los enums proporcionan seguridad de tipo, lo que significa que el compilador puede detectar errores de tipo durante 
	la compilacion. Son mas legibles y mantenibles que los arrays o las listas, ya que proporcionan nombres 
	descriptivos para cada constante.
 */

package conjuntosDeDatos_enum;

// Si bien Java nos permite colocar minusculas y mayusculas, los enums deben coloarse en MAYUSCULAS.
public enum A_DiasDeLaSemana {
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
