package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;

public class Novela extends Libro implements Alquilable{

    private String autor;
    private String edicion;
    private boolean alquilado;

    public Novela(String ISBN, LocalDate fechaPublicacion, String titulo, String autor, String edicion) {
        super(ISBN, fechaPublicacion, titulo);
        this.autor = autor;
        this.edicion = edicion;
        this.alquilado = false;
    }

    @Override
    public void alquilar() {
        this.alquilado = true;
    }

    @Override
    public void devolver() {
        this.alquilado = false;
    }
}
