package LupoOs.modelo; 

public abstract class Proceso {
    private int pid;
    private String nombre;

    public Proceso(int pid, String nombre) {
        this.pid = pid;
        this.nombre = nombre;
    }

    public int getPid() {
        return pid;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String ejecutar();

    @Override
    public String toString() {
        return "Proceso [PID=" + pid + ", Nombre='" + nombre + "']";
    }
}