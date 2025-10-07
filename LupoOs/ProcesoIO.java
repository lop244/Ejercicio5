package LupoOs.modelo;

public class ProcesoIO extends Proceso {
    public ProcesoIO(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public String ejecutar() {
        return "[I/O] PID " + getPid() + " (" + getNombre() + "): Esperando respuesta del disco duro. Completado.";
    }
}