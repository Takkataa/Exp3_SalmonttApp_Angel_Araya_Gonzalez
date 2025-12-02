package cl.salmontt.model;

public abstract class UnidadOperativa {

    private String nombre;
    private String comuna;

    protected UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    @Override
    public String toString() {
        return "UnidadOperativa [nombre=" + nombre + ", comuna=" + comuna + "]";
    }

}
