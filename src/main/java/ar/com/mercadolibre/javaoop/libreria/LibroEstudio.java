package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;
import java.util.Objects;

public class LibroEstudio extends Libro implements Alquilable {

    private String tema;
    private boolean alquilado;

    public LibroEstudio(String ISBN, LocalDate fechaPublicacion, String titulo, String tema) {
        super(ISBN, fechaPublicacion, titulo);
        this.tema = tema;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroEstudio)) return false;
        LibroEstudio that = (LibroEstudio) o;
        return alquilado == that.alquilado &&
                Objects.equals(tema, that.tema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tema, alquilado);
    }
}
