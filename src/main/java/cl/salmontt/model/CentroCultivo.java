package cl.salmontt.model;

public class CentroCultivo extends UnidadOperativa {

    private int capacidadDelProcesoToneladas;
    private int tiempoDeCultivoDias;

    public CentroCultivo(String nombre, String comuna, int capacidadDelProcesoToneladas, int tiempoDeCultivoDias) {
        super(nombre, comuna);
        this.capacidadDelProcesoToneladas = capacidadDelProcesoToneladas;
        this.tiempoDeCultivoDias = tiempoDeCultivoDias;
    }

    public int getCapacidadDelProcesoToneladas() {
        return capacidadDelProcesoToneladas;
    }

    public void setCapacidadDelProcesoToneladas(int capacidadDelProcesoToneladas) {
        this.capacidadDelProcesoToneladas = capacidadDelProcesoToneladas;
    }

    public int getTiempoDeCultivoDias() {
        return tiempoDeCultivoDias;
    }

    public void setTiempoDeCultivoDias(int tiempoDeCultivoDias) {
        this.tiempoDeCultivoDias = tiempoDeCultivoDias;
    }

    @Override
    public String toString() {
        return getNombre() + " [Capacidad del proceso en toneladas = " + capacidadDelProcesoToneladas
                + ", tiempo de cultivo en dias = " + tiempoDeCultivoDias + "]";
    }
}
