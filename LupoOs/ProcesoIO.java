package LupoOs.modelo;

// Representa un proceso de Entrada/Salida (I/O), que interactúa con dispositivos externos.


public class ProcesoIO extends Proceso {
    public ProcesoIO(int pid, String nombre) {
        super(pid, nombre);
}
@Override
public String ejecutar() {
 // Simula una espera por un dispositivo
        return "[I/O] PID " + getPid() + " (" + getNombre() + "): Esperando respuesta del disco duro. Completado.";
    }
}
