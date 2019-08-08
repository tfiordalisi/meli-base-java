package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;

public class Alquiler {

    private Libro libro;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler(Libro libro) {
        this.libro = libro;
        fechaAlquiler = LocalDate.now();
        fechaDevolucion = fechaAlquiler.plusDays(7);
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
}
