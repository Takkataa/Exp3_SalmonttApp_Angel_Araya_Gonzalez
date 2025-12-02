package cl.salmontt.ui;

import cl.salmontt.data.GestorUnidades;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        GestorUnidades gestorUnidades = new GestorUnidades();
        gestorUnidades.agregarUnidadesOperativas();

        gestorUnidades.mostrarUnidadesOperativas();

    }
}
