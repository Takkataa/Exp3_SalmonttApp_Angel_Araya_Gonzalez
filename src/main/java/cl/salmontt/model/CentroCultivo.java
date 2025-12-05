package cl.salmontt.model;

/**
 * clase que representa un centro de cultivo, hereda de la clase UnidadOperativa
 *
 */

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
    public void mostrarInformacion() {
        System.out.println("Tipo: Centro de cultivo");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Comuna: " + getComuna());
        System.out.println("Capacidad del proceso en toneladas: " + capacidadDelProcesoToneladas);
        System.out.println("Tiempo de cultivo en dias: " + tiempoDeCultivoDias);
    }

    @Override
    public String toString() {
        return "CentroCultivo [nombre=" + getNombre() + ", comuna=" + getComuna() + ", capacidadDelProcesoToneladas="
                + capacidadDelProcesoToneladas + ", tiempoDeCultivoDias=" + tiempoDeCultivoDias + "]";
    }
}
