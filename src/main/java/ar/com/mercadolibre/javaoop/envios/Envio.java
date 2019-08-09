package ar.com.mercadolibre.javaoop.envios;

import ar.com.mercadolibre.javaoop.exceptions.PesoNoSoportadoException;

import java.math.BigDecimal;
import java.util.List;

public class Envio {

    private List<Paquete> paquetes;
    private BigDecimal costo;
    private String direccionEntrega;
    private Vehiculo transporte;

    public Envio(List<Paquete> paquetes, String direccionEntrega) {
        this.paquetes = paquetes;
        this.direccionEntrega = direccionEntrega;
    }

    public List<Paquete> getPaquetes() {
        return paquetes;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setTransporte(Vehiculo transporte) {
        this.transporte = transporte;
    }

    public Integer getPesoTotal() {
        return (int) paquetes.stream().mapToInt(p -> p.getPeso()).sum();
    }
}
