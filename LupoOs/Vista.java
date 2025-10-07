package LupoOs.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

// La clase que el usuario verá e interactuará con, es decir entrada y salida de datos

public class Vista {
    private Scanner scanner;
}
    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        mostrarMensaje("\n==== Simulador de Planificador de Procesos ====");
        mostrarMensaje("1. Crear y registrar un nuevo proceso");
        mostrarMensaje("2. Ejecutar todos los procesos registrados");
        mostrarMensaje("3. Salir");
        mostrarMensaje("=============================================");
        mostrarMensaje("Seleccione una opción: ");
    }

    public int obtenerOpcionUsuario() {
        try {
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            return opcion;
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el buffer del scanner
            return -1; // Retorna un valor inválido para que el controlador lo maneje
        }
    }


