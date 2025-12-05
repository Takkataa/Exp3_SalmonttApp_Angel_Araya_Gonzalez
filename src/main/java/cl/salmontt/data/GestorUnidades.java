package cl.salmontt.data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cl.salmontt.model.*;

/**
 * Clase encargada de gestionar las unidades operativas de Salmontt, se crean
 * las instancias de las unidades operativas y se agregan a la lista ademas de
 * mostrarlas en consola con otro metodo
 *
 */

public class GestorUnidades {

    private List<UnidadOperativa> unidadesOperativas = new ArrayList<>();

    public void agregarCincoUnidadesOperativas() {
        try {

            String comuna = "Puerto Montt";
            System.out.println("Ingresando unidades operativas...");
            TimeUnit.SECONDS.sleep(2); // pausa de 3 segundos

            PlantaProceso plantaProcesoNorte = new PlantaProceso("Planta Nortmontt", comuna, 120, 2);
            PlantaProceso plantaProcesoSur = new PlantaProceso("Planta Surmontt", comuna, 150, 4);
            CentroCultivo centroCultivoNorte = new CentroCultivo("Centro Cultivo Nortmontt", comuna, 130, 145);
            CentroCultivo centroCultivoSur = new CentroCultivo("Centro Cultivo Surmontt", comuna, 185, 389);
            CentroCultivo centroCultivoCentral = new CentroCultivo("Centro Cultivo Central", comuna, 185, 250);

            unidadesOperativas.add(plantaProcesoNorte);
            unidadesOperativas.add(plantaProcesoSur);
            unidadesOperativas.add(centroCultivoNorte);
            unidadesOperativas.add(centroCultivoSur);
            unidadesOperativas.add(centroCultivoCentral);

            System.out.println("Unidades operativas agregadas exitosamente.");
        } catch (InterruptedException e) {
            System.out.println("Error al agregar unidades operativas");
            e.printStackTrace();
        }
    }

    public void mostrarUnidadesOperativas() {

        System.out.println("Lista Unidades operativas:\n");
        int i = 1;
        for (UnidadOperativa unidadOperativa : unidadesOperativas) {
            System.out.println("--------------------------------");
            System.out.println("-------- Unidad " + i + " --------\n");
            unidadOperativa.mostrarInformacion();
            System.out.println(" ");
            i++;
        }
    }
}
