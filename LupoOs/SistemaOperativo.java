package LupoOs.modelo;

import java.util.ArrayList;

public class SistemaOperativo {
    private Arraylist<Proceso> procesos;

    public SistemaOperativo() {
        this.procesos = new ArrayList<>();
    }

    public void agregarProceso(Proceso proceso) {
        this.procesos.add(proceso);
    }

    public String ejecutarProcesos() {
        if (procesos.isEmpty()) {
            return "No hay procesos en la cola de ejecución.";
        }

        StringBuilder logEjecucion = new StringBuilder("--- INICIANDO EJECUCIÓN DE PROCESOS ---\n");
        for (Proceso p : procesos) {
            logEjecucion.append(p.ejecutar()).append("\n");
        }
        logEjecucion.append("--- TODOS LOS PROCESOS HAN SIDO EJECUTADOS ---\n");

        return logEjecucion.toString();
    }
}
