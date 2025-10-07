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

    /**
     * Método abstracto que simula la ejecución del proceso.
     * Cada tipo de proceso concreto deberá implementar su propia lógica.
     * return Un String que describe el resultado de la ejecución.
     */
    public abstract String ejecutar();


