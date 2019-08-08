package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;

public class LibroInfantil extends Libro {

    private Integer edadDesde;
    private Integer edadHasta;

    public LibroInfantil(String ISBN, LocalDate fechaPublicacion, String titulo, Integer edadDesde, Integer edadHasta) {
        super(ISBN, fechaPublicacion, titulo);
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
    }
}
