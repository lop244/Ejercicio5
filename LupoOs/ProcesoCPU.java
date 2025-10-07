package LupoOs.modelo;

// Representa un proceso intensivo en CPU, como la compilación de código o el renderizado de gráficos.


public class ProcesoCPU extends Proceso {
    public ProcesoCPU(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public String ejecutar() {
        // Simula una tarea de cálculo intensivo
        return "[CPU] PID " + getPid() + " (" + getNombre() + "): Realizando cálculos complejos. Finalizado.";
    }
}

    
