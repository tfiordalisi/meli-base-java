package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;
import java.util.Objects;
import java.util.SimpleTimeZone;

public abstract class Libro {

    private String ISBN;
    private LocalDate fechaPublicacion;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public Libro(String ISBN, LocalDate fechaPublicacion, String titulo) {
        this.ISBN = ISBN;
        this.fechaPublicacion = fechaPublicacion;
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(ISBN, libro.ISBN) &&
                Objects.equals(fechaPublicacion, libro.fechaPublicacion);
    }

}
