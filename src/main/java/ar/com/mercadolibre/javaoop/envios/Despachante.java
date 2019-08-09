package ar.com.mercadolibre.javaoop.envios;

import ar.com.mercadolibre.javaoop.exceptions.PesoNoSoportadoException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Despachante {

    private List<Envio> envios;
    private CalculadorCostos calculadorCostos;
    private AsignadorVehiculos asignadorVehiculos;

   public Despachante(CalculadorCostos calculadorCostos, AsignadorVehiculos asignadorVehiculos) {
        envios = new ArrayList<Envio>();
        this.calculadorCostos = calculadorCostos;
        this.asignadorVehiculos = asignadorVehiculos;
    }

   public void generarEnvio(List<Paquete> paquetes, String direccionEntrega) throws PesoNoSoportadoException {
        Envio envio = new Envio(paquetes, direccionEntrega);
        envio.setTransporte(asignadorVehiculos.asignarTransporte(envio));
        envio.setCosto(calculadorCostos.calcularCosto(envio));
        if(esAplicableCargoAdministrativo()) {
            envio.setCosto(envio.getCosto().multiply(new BigDecimal(1.1)));
        }
        envios.add(envio);
    }

    private boolean esAplicableCargoAdministrativo() {
       return envios.size() > 10;
    }

}
