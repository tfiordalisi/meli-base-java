package ar.com.mercadolibre.javaoop;

import ar.com.mercadolibre.javaoop.envios.*;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculadorCostosTest {

    @Mock
    List paquetes;

    private CalculadorCostos calculadorCostos;

    @Before
    public void setUp(){
        calculadorCostos = new CalculadorCostos();
    }

    @Test
    public void seCalculaBienElCostoHasta5Paquetes() {
        when(paquetes.size()).thenReturn(5);
        Envio envio =  new Envio(paquetes, "direccion");
        Assertions.assertThat(calculadorCostos.calcularCosto(envio)).isEqualTo(new BigDecimal(50));
    }

    @Test
    public void seCalculaBienElCostoHasta10Paquetes() {
        when(paquetes.size()).thenReturn(10);
        Envio envio =  new Envio(paquetes, "direccion");
        Assertions.assertThat(calculadorCostos.calcularCosto(envio)).isEqualTo(new BigDecimal(80));
    }

    @Test
    public void seCalculaBienElCostoAPartirDe10Paquetes() {
        when(paquetes.size()).thenReturn(12);
        Envio envio =  new Envio(paquetes, "direccion");
        Assertions.assertThat(calculadorCostos.calcularCosto(envio)).isEqualTo(new BigDecimal(110));
    }

}
