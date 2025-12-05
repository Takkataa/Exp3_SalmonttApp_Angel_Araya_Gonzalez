package cl.salmontt.ui;

import cl.salmontt.data.GestorUnidades;

/**
 * clase principal para instanciar y llamar a los metodos de la clase
 * GestorUnidades necesarios para mostrar la lista de unidades operativas en
 * Salmontt
 *
 */
public class App {
    public static void main(String[] args) {

        GestorUnidades gestorUnidades = new GestorUnidades();
        gestorUnidades.agregarCincoUnidadesOperativas();

        gestorUnidades.mostrarUnidadesOperativas();

    }
}
