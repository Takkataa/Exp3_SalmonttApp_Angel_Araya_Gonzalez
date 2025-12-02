package cl.salmontt.data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import cl.salmontt.model.*;

public class GestorUnidades {

    private List<UnidadOperativa> unidadesOperativas = new ArrayList<>();

    public void agregarUnidadesOperativas() {
        try {
            System.out.println("Ingresando unidades operativas...");
            TimeUnit.SECONDS.sleep(3); // pausa de 3 segundos
            String comuna = "Puerto Montt";

            PlantaProceso plantaProcesoNorte = new PlantaProceso("Planta Nortmontt", comuna, 120, 2);
            PlantaProceso plantaProcesoSur = new PlantaProceso("Planta Surmontt", comuna, 150, 4);
            CentroCultivo centroCultivoNorte = new CentroCultivo("Centro Cultivo Nortmontt", comuna, 130, 145);
            CentroCultivo centroCultivoSur = new CentroCultivo("Centro Cultivo Surmontt", comuna, 185, 389);

            unidadesOperativas.add(plantaProcesoNorte);
            unidadesOperativas.add(plantaProcesoSur);
            unidadesOperativas.add(centroCultivoNorte);
            unidadesOperativas.add(centroCultivoSur);

            System.out.println("Unidades operativas agregadas exitosamente.");
        } catch (InterruptedException e) {
            System.out.println("Error al agregar unidades operativas");
            e.printStackTrace();
        }
    }

    public void mostrarUnidadesOperativas() {
        System.out.println("Lista Unidades operativas:");
        for (UnidadOperativa unidadOperativa : unidadesOperativas) {
            System.out.println(unidadOperativa.toString());
        }
    }
}
