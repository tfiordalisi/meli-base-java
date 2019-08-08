package ar.com.mercadolibre.javaoop.playa.estacionamiento;

import java.util.ArrayList;
import java.util.List;

public class PlayaDeCarga {

    private List<Carga> cargas;

    private static PlayaDeCarga instance = new PlayaDeCarga();

    private PlayaDeCarga() {
        cargas = new ArrayList<Carga>();

    }

    public static PlayaDeCarga getInstance() {
       return instance;
    }

    public void cargarPlaya(List<Integer> pesos){
        for(Integer peso : pesos) {
            cargas.add(new Carga(peso));
        }
    }

    public void cargarUtilitario(Utilitario utilitario){
        Integer sumaParcialCargas = utilitario.getCargaMaxima();
        List<Carga> cargasEnVehiculo = new ArrayList<>();
        for(Carga carga : cargas) {
            if(carga.getPeso() <= sumaParcialCargas) {
                sumaParcialCargas -= carga.getPeso();
                cargasEnVehiculo.add(carga);
            }
        }
        cargas.removeAll(cargasEnVehiculo);
    }

    public Integer getCantidadDeCargasDisponibles() {
        return cargas.size();
    }

    public Integer getSumaDeCargasDisponibles() {
        return cargas.stream().mapToInt(i -> i.getPeso()).sum();
    }

    public void vaciarPaya() {

    }

}
