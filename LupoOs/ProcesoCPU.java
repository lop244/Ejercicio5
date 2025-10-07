package LupoOs.modelo; 

public class ProcesoCPU extends Proceso {
    public ProcesoCPU(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public String ejecutar() {
        return "[CPU] PID " + getPid() + " (" + getNombre() + "): Realizando cálculos complejos. Finalizado.";
    }
}