package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;

public class Novela extends Libro implements Alquilable{

    private String autor;
    private String edicion;

    public Novela(String ISBN, LocalDate fechaPublicacion, String titulo, String autor, String edicion) {
        super(ISBN, fechaPublicacion, titulo);
        this.autor = autor;
        this.edicion = edicion;
    }

    @Override
    public void alquilar() throws Exception {
        throw new Exception("no implementado");
    }

    @Override
    public void devolver() throws Exception {

    }
}
