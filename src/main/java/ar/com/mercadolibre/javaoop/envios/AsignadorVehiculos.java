package ar.com.mercadolibre.javaoop.envios;

import ar.com.mercadolibre.javaoop.exceptions.PesoNoSoportadoException;

public class AsignadorVehiculos {

    public Vehiculo asignarTransporte(Envio envio) throws PesoNoSoportadoException {
        Vehiculo transporte;
        Integer pesoTotal = envio.getPesoTotal();
        if(pesoTotal <= 5) {
            transporte = Vehiculo.BICICLETA;
        } else if(pesoTotal <= 50) {
            transporte = Vehiculo.AUTO;
        } else if(pesoTotal <= 150) {
            transporte = Vehiculo.CAMIONETA;
        } else {
            throw new PesoNoSoportadoException("Peso no soportado");
        }
        return transporte;
    }

}
