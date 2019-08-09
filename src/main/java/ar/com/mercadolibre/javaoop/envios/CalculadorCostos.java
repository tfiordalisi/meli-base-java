package ar.com.mercadolibre.javaoop.envios;

import java.math.BigDecimal;

public class CalculadorCostos {

    public BigDecimal calcularCosto(Envio envio) {
        BigDecimal costo;
        Integer cantidadPaquetes = envio.getPaquetes().size();
        if(cantidadPaquetes <= 5) {
            costo = new BigDecimal(50);
        } else if(cantidadPaquetes <= 10) {
            costo = new BigDecimal(80);
        } else {
            costo = new BigDecimal(80);
            costo = costo.add(new BigDecimal((cantidadPaquetes - 10) * 15));
        }
        return costo;
    }

}
