package conjuntosDeDatos_enum; // Declaracion del paquete donde se encuentra la clase

import java.util.Scanner; // Importacion de la clase Scanner

public class B_EnumEjemploPaisesLatin { // Declaracion de la clase

    public static void main(String[] args) { // Metodo principal donde comienza la ejecucion del programa
        Scanner entrada = new Scanner(System.in); // Creacion de un objeto Scanner para leer la entrada del usuario

        B_PaisesLatinoamericanos pais = null; // Declaracion de una variable para almacenar el pais ingresado por el usuario
        char respuestaSalir; // Declaracion de una variable para almacenar la respuesta del usuario sobre si desea salir del programa
        boolean ingresoSalirCorrecto = false; // Declaracion de una variable para controlar si la respuesta del usuario es valida
        boolean quiereSalir = false; // Declaracion de una variable para controlar si el usuario desea salir del programa

        while (quiereSalir == false) { // Bucle que se ejecutara mientras el usuario no desee salir del programa
            ingresoSalirCorrecto = false; // Reinicio de la variable para validar la respuesta del usuario
            System.out.println("Intenta adivinar si el pais corresponde a latinoamerica: "); // Mensaje para el usuario
            String ingresoDato = entrada.next().toUpperCase(); // Lectura de la entrada del usuario y conversion a mayusculas

            for (B_PaisesLatinoamericanos paisActual : B_PaisesLatinoamericanos.values()) { // Bucle que recorre todos los valores del enum
                if (paisActual.name().equals(ingresoDato)) { // Verificacion si el pais ingresado coincide con algun pais del enum
                    pais = paisActual; // Almacenamiento del pais ingresado
                    System.out.println("Correcto!!! " + pais + " pertenece a latinoamerica"); // Mensaje de confirmacion
                    pais = null; // Reinicio de la variable para la proxima iteracion
                }
            }

            if (pais == null) { // Si no se encontro ningun pais que coincida con el ingresado por el usuario
                System.err.println("Error: este pais no pertenece."); // Mensaje de error
            }

            while (ingresoSalirCorrecto == false) { // Bucle para validar la respuesta del usuario sobre si desea salir del programa
                System.out.println("Desea salir? S/N"); // Pregunta al usuario
                respuestaSalir = entrada.next().charAt(0); // Lectura de la respuesta del usuario

                if (respuestaSalir == 's' || respuestaSalir == 'S') { // Si el usuario desea salir
                    quiereSalir = true; // Se marca que el usuario desea salir del programa
                    ingresoSalirCorrecto = true; // Se marca que la respuesta del usuario es valida
                } else if (respuestaSalir == 'n' || respuestaSalir == 'N') { // Si el usuario no desea salir
                    System.out.println("Volviendo a comenzar."); // Mensaje informativo
                    ingresoSalirCorrecto = true; // Se marca que la respuesta del usuario es valida
                } else { // Si la respuesta del usuario no es valida
                    System.err.println("ERROR. Ingresa unicamente S para salir, o N para volver a comenzar."); // Mensaje de error
                }
            }
        }

        System.out.println("Juego terminado."); // Mensaje al finalizar el programa
        entrada.close(); // Cerrar el scanner al finalizar para liberar recursos
    }
}
