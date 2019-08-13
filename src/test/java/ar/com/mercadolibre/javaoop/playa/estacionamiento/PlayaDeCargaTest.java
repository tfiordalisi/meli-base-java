package ar.com.mercadolibre.javaoop.playa.estacionamiento;

import ar.com.mercadolibre.javaoop.playa.estacionamiento.Camion;
import ar.com.mercadolibre.javaoop.playa.estacionamiento.Camioneta;
import ar.com.mercadolibre.javaoop.playa.estacionamiento.PlayaDeCarga;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayaDeCargaTest {

    PlayaDeCarga playaDeCarga;

    List pesos = new ArrayList() {
        {
            add(120);
            add(100);
            add(200);
            add(50);
            add(150);
            add(350);
            add(10);
        }
    };

    @Before
    public void beforeExecution() {
        playaDeCarga = playaDeCarga.getInstance();
        playaDeCarga.cargarPlaya(pesos);
    }

//    @Test
//    public void seCargaUnUtilitario() {
//        playaDeCarga.cargarUtilitario(new Camion("ABC123", 100));
//        Integer cantidadDeCargas = playaDeCarga.getCantidadDeCargasDisponibles();
//        Assertions.assertThat(cantidadDeCargas).isEqualTo(6);
//    }

    @Test
    public void seUnUtilitarioConTodasLasCargas(){
        playaDeCarga.cargarUtilitario(new Camioneta("ABC123", 1000));
        Integer cantidadDeCargas = playaDeCarga.getCantidadDeCargasDisponibles();
        Assertions.assertThat(cantidadDeCargas).isEqualTo(0);
    }
    
    @After
    public void tearDown() {
        // playaDeCarga.vaciarPlaya();
        playaDeCarga.cargarPlaya(pesos);
    }

}
