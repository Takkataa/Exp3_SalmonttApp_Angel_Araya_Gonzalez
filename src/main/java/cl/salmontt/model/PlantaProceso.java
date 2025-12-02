package cl.salmontt.model;

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
    public String toString() {
        return getNombre() + " [Toneladas de produccion = " + toneladasDeProduccion
                + ", tiempo de produccion en dias = " + tiempoDeProduccionDias + "]";
    }

}
