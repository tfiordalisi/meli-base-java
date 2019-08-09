package ar.com.mercadolibre.javaoop.libreria;

import java.time.LocalDate;

public class Alquiler {

    private Alquilable alquilable;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler(Alquilable alquilable) {
        this.alquilable = alquilable;
        fechaAlquiler = LocalDate.now();
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public Alquilable getAlquilable() {
        return alquilable;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
}
