package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;

public class LibroEstudio extends Libro implements Alquilable {

    private String tema;

    public LibroEstudio(String ISBN, LocalDate fechaPublicacion, String titulo, String tema) {
        super(ISBN, fechaPublicacion, titulo);
        this.tema = tema;
    }

    @Override
    public void alquilar() throws Exception {
        throw new Exception("no implementado");
    }

    @Override
    public void devolver() throws Exception {

    }
}
