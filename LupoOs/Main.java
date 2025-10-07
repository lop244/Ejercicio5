package controlador;

import modelo.*;
import vista.Vista;
/**
 * Clase principal que actúa como Controlador en el patrón MVC.
 * Orquesta la interacción entre el Modelo (SistemaOperativo) y la Vista.
 */
public class Main {
    private SistemaOperativo modelo;
    private Vista vista;
    
    public Main() {
        this.modelo = new SistemaOperativo();
        this.vista = new Vista();
    }

    public void iniciar() {
        boolean corriendo = true;
        while (corriendo) {
            vista.mostrarMenu();
            int opcion = vista.obtenerOpcionUsuario();

            if (opcion == 1) {
                gestionarCreacionProceso();
            } else if (opcion == 2) {
                String log = modelo.ejecutarProcesos();
                vista.mostrarMensaje(log);
            } else if (opcion == 3) {
                corriendo = false;
                vista.mostrarMensaje("Saliendo del simulador. ¡Hasta pronto!");
            } else {
                vista.mostrarMensaje("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    private void gestionarCreacionProceso() {
        int tipoProceso = vista.solicitarTipoProceso();

        // Valida el tipo de proceso antes de continuar
        if (tipoProceso < 1 || tipoProceso > 3) {
            vista.mostrarMensaje("Tipo de proceso no válido.");
            return; // Usamos return para salir del método si la opción es inválida
        }
        
        String[] datos = vista.solicitarDatosComunesProceso();
        try {
            int pid = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            Proceso nuevoProceso = null;

