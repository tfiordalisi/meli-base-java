package ar.com.mercadolibre.javaoop;

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
