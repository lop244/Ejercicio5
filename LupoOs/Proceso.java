package LupoOs.modelo;

public class Proceso {
    private int pid;
    private String nombre;

    public Proceso(int pid, String nombre) {
        this.pid = pid;
        this.nombre = nombre;
}

// Getters
    public int getPid() {
        return pid;
    }

    public String getNombre() {
        return nombre;
    }
