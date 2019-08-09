package ar.com.mercadolibre.javaoop;

import ar.com.mercadolibre.javaoop.envios.AsignadorVehiculos;
import ar.com.mercadolibre.javaoop.envios.CalculadorCostos;
import ar.com.mercadolibre.javaoop.envios.Envio;
import ar.com.mercadolibre.javaoop.envios.Vehiculo;
import ar.com.mercadolibre.javaoop.exceptions.PesoNoSoportadoException;
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
public class AsignadorVehiculosTest {

    @Mock
    private Envio envio;

    private AsignadorVehiculos asignadorVehiculos;

    @Before
    public void setUp(){
        asignadorVehiculos = new AsignadorVehiculos();
    }

    @Test
    public void seAsignaVehiculoBicicleta() throws PesoNoSoportadoException {
        when(envio.getPesoTotal()).thenReturn(5);
        Assertions.assertThat(asignadorVehiculos.asignarTransporte(envio)).isEqualTo(Vehiculo.BICICLETA);
    }

    @Test
    public void seAsignaVehiculoAuto() throws PesoNoSoportadoException {
        when(envio.getPesoTotal()).thenReturn(50);
        Assertions.assertThat(asignadorVehiculos.asignarTransporte(envio)).isEqualTo(Vehiculo.AUTO);
    }

    @Test
    public void seAsignaVehiculoCamioneta() throws PesoNoSoportadoException {
        when(envio.getPesoTotal()).thenReturn(150);
        Assertions.assertThat(asignadorVehiculos.asignarTransporte(envio)).isEqualTo(Vehiculo.CAMIONETA);
    }

    @Test(expected = PesoNoSoportadoException.class)
    public void noSeAsignaVehiculoSiPesaMasDe150() throws PesoNoSoportadoException {
        when(envio.getPesoTotal()).thenReturn(160);
        Assertions.assertThat(asignadorVehiculos.asignarTransporte(envio)).isEqualTo(Vehiculo.CAMIONETA);
    }
}
