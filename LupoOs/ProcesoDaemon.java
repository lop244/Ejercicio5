package LupoOs.modelo;

public class ProcesoDaemon extends Proceso {

    public ProcesoDaemon(int pid, String nombre) {
        super(pid, nombre);
}

@Override
public string ejecutar() {
    return "[DAEMON] PID " + getPid() + " (" + getNombre() + "): Servicio de monitoreo activo y en ejecución.";
}