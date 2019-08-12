package ar.com.mercadolibre.javaoop.playa.estacionamiento;

import ar.com.mercadolibre.javaoop.playa.estacionamiento.Auto;
import ar.com.mercadolibre.javaoop.playa.estacionamiento.Camion;
import ar.com.mercadolibre.javaoop.playa.estacionamiento.PlayaEstacionamiento;
import ar.com.mercadolibre.javaoop.playa.estacionamiento.Vehiculo;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlayaEstacionamientoTest {

    PlayaEstacionamiento playaEstacionamiento;

    @Before
    public void beforeExecution() {
        playaEstacionamiento = PlayaEstacionamiento.getInstance();
    }

    @Test
    public void seCreaPlayaEstacionamientoVacia() {
        Integer cantidadOcupada = playaEstacionamiento.getLugaresOcupados();
        Assertions.assertThat(cantidadOcupada).isEqualTo(0);
    }

    @Test
    public void seIngresaAuto(){
        Vehiculo auto = new Auto("AC123AA");
        playaEstacionamiento.ingresarVehiculo(auto);
        Integer cantidadOcupada = playaEstacionamiento.getLugaresOcupados();
        Assertions.assertThat(cantidadOcupada).isEqualTo(1);
    }

    @Test
    public void seIngresanDosVehiculos(){
        Vehiculo camion = new Camion("ABC123");
        playaEstacionamiento.ingresarVehiculo(camion);
        Vehiculo auto = new Auto("AC123AA");
        playaEstacionamiento.ingresarVehiculo(auto);
        Integer cantidadOcupada = playaEstacionamiento.getLugaresOcupados();
        Assertions.assertThat(cantidadOcupada).isEqualTo(2);
    }

    @After
    public void tearDown(){
        playaEstacionamiento.vaciarPlaya();
    }



}
