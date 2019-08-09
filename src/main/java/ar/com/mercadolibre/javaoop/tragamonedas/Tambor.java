package ar.com.mercadolibre.javaoop.tragamonedas;

import java.util.Random;

public class Tambor {

    private Integer posicion;
    private static final int INIT = 1;
    private static final int FINAL = 8;
    private static Random RANDOM = new Random();



    public Tambor(){
        this.posicion = 0;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void girar(){
        this.posicion = obtenerNumeroRandom();
    }

    private int obtenerNumeroRandom(){
        return RANDOM.nextInt(FINAL - INIT) + INIT;
    }
}
