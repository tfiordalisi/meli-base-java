package ar.com.mercadolibre.javaoop.tragamonedas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TamborTest {

    @Test
    public void giraElTambor() {
        TamborMock tambor = new TamborMock();
        tambor.girar();
        Assertions.assertThat(tambor.getPosicion()).isEqualTo(1);
    }

}
