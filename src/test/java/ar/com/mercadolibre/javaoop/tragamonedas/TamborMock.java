package ar.com.mercadolibre.javaoop.tragamonedas;

import java.util.Random;

public class TamborMock {
    private Integer posicion;
    private static final int INIT = 1;
    private static final int FINAL = 8;
    private static Random RANDOM = new Random();



    public TamborMock(){
        this.posicion = 0;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void girar(){
        this.posicion = obtenerNumeroRandom1();
    }

    private int obtenerNumeroRandom1(){
        return 1;
    }
}
