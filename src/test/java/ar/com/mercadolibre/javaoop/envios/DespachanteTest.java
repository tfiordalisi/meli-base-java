package ar.com.mercadolibre.javaoop.envios;

import ar.com.mercadolibre.javaoop.envios.AsignadorVehiculos;
import ar.com.mercadolibre.javaoop.envios.CalculadorCostos;
import ar.com.mercadolibre.javaoop.envios.Despachante;
import ar.com.mercadolibre.javaoop.envios.Envio;
import ar.com.mercadolibre.javaoop.exceptions.PesoNoSoportadoException;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DespachanteTest {

    @Mock
    private CalculadorCostos calculadorCostos;

    @Mock
    private AsignadorVehiculos asignadorVehiculos;

    @Mock
    private List paquetes;

    @Mock
    private Envio envio;

    @Test
    public void seGeneraEnvioCorrectamente() throws PesoNoSoportadoException {
        Despachante despachante = new Despachante(calculadorCostos, asignadorVehiculos);
        despachante.generarEnvio(paquetes, "direccion");
    }

    @Test(expected = PesoNoSoportadoException.class)
    public void noSeGeneraEnvioYLanzaExcepcion() throws PesoNoSoportadoException {
        when(envio.getPesoTotal()).thenReturn(160);
        Despachante despachante = new Despachante(calculadorCostos, asignadorVehiculos);
        despachante.generarEnvio(paquetes, "direccion");
    }

}
