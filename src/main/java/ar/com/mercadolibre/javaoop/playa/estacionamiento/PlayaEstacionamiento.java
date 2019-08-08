package ar.com.mercadolibre.javaoop.playa.estacionamiento;

import java.util.ArrayList;
import java.util.List;

public class PlayaEstacionamiento {

    private static PlayaEstacionamiento instance = new PlayaEstacionamiento();

    private List<Vehiculo> vehiculos;
    private static Integer CANTIDAD_DISPONIBLE = 50;

    private PlayaEstacionamiento(){
        vehiculos = new ArrayList<Vehiculo>();
    }

    public static PlayaEstacionamiento getInstance() {
        return instance;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void ingresarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        CANTIDAD_DISPONIBLE--;
    }

    public Integer getLugaresOcupados() {
        return vehiculos.size();
    }

    public void vaciarPlaya(){
        vehiculos.clear();
    }
}
