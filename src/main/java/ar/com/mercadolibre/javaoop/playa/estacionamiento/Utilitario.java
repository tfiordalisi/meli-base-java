package ar.com.mercadolibre.javaoop.playa.estacionamiento;

public abstract class Utilitario extends Vehiculo {

    private Integer cargaMaxima;

    public Utilitario(String patente){
        super(patente);
    }

    public Utilitario(String patente, Integer cargaMaxima){
        super(patente);
        this.cargaMaxima = cargaMaxima;
    }

    public Integer getCargaMaxima() {
        return cargaMaxima;
    }
}
