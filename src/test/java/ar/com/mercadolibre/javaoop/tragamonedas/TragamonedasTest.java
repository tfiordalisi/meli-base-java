package ar.com.mercadolibre.javaoop.tragamonedas;

import ar.com.mercadolibre.javaoop.tragamonedas.Tambor;
import ar.com.mercadolibre.javaoop.tragamonedas.Tragamonedas;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class TragamonedasTest {


    Tragamonedas tragamonedas;

    @Before
    public void setUp() {
        tragamonedas = new Tragamonedas();
    }

    @Test
    public void seCreaTragamoneasEnCero() {
        Assertions.assertThat(tragamonedas).isNotNull();
    }

//    @Test
////    public void ganaEntregaPremio() {
////        tragamonedas.activar();
////        Assertions.assertThat(tragamonedas.entregarPremio()).isTrue();
////    }




}
