package cl.salmontt.model;

/**
 * clase que representa una planta de proceso, hereda de la clase
 * UnidadOperativa
 *
 */

public class PlantaProceso extends UnidadOperativa {

    private int toneladasDeProduccion;
    private int tiempoDeProduccionDias;

    public PlantaProceso(String nombre, String comuna, int toneladasDeProduccion, int tiempoDeProduccionDias) {
        super(nombre, comuna);
        this.toneladasDeProduccion = toneladasDeProduccion;
        this.tiempoDeProduccionDias = tiempoDeProduccionDias;
    }

    public int getToneladasDeProduccion() {
        return toneladasDeProduccion;
    }

    public void setToneladasDeProduccion(int toneladasDeProduccion) {
        this.toneladasDeProduccion = toneladasDeProduccion;
    }

    public int getTiempoDeProduccionDias() {
        return tiempoDeProduccionDias;
    }

    public void setTiempoDeProduccionDias(int tiempoDeProduccionDias) {
        this.tiempoDeProduccionDias = tiempoDeProduccionDias;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Planta de proceso");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Comuna: " + getComuna());
        System.out.println("Toneladas de produccion: " + toneladasDeProduccion);
        System.out.println("Tiempo de produccion en dias: " + tiempoDeProduccionDias);
    }

    @Override
    public String toString() {
        return "PlantaProceso [nombre=" + getNombre() + ", comuna=" + getComuna() + ", toneladasDeProduccion="
                + toneladasDeProduccion + ", tiempoDeProduccionDias=" + tiempoDeProduccionDias + "]";
    }

}
