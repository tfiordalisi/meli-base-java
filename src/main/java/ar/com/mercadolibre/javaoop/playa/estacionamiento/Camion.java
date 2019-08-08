package ar.com.mercadolibre.javaoop.playa.estacionamiento;

public class Camion extends Utilitario {

    public Camion(String patente){
        super(patente);
    }

    public Camion(String patente, Integer cargaMaxima){
        super(patente, cargaMaxima);
    }
}
