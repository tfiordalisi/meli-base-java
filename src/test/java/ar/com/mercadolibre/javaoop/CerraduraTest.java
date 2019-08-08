package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CerraduraTest {

    @Test
    public void crearCerradura(){
        Cerradura cerradura = new Cerradura();
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClave(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClaveNumerica(){
        Cerradura c = new Cerradura(1235);
        Assertions.assertThat(c).isNotNull();
        Assertions.assertThat(c.getClave()).isEqualTo(1235);
    }


    @Test
    public void unaCerraduraSeCreaCerrada(){
        Cerradura c = new Cerradura(1234);
        Assertions.assertThat(c.estaCerrada()).isTrue();
    }

    @Test
    public void abrirCerraduraConClave(){
        Cerradura c = new Cerradura(1235);

        Assertions.assertThat(c.estaCerrada()).isTrue();

        c.abrir(1235);
        Assertions.assertThat(c.estaCerrada()).isFalse();
    }


}

