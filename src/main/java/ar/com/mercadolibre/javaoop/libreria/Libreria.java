package ar.com.mercadolibre.javaoop.libreria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Libreria {

    private static Libreria instance = new Libreria();

    private List<Alquiler> alquileres;

    private Libreria() {
        alquileres = new ArrayList<>();
    }

    public static Libreria getInstance() {
        return instance;
    }

    public void agregarAlquiler(Libro libro){
        alquileres.add(new Alquiler(libro));
    }

    public Alquiler buscarAlquiler(Libro libro) throws Exception {
        Optional<Alquiler> optionalAlquiler = alquileres.stream().filter(alquiler -> alquiler.getLibro().equals(libro)).findFirst();
        if(optionalAlquiler.isPresent()) {
            return optionalAlquiler.get();
        }
        throw new Exception("No se encontro libro en lista de alquieres");
    }

    public List<Alquiler> listarAlquileres() {
        return alquileres;
    }

    public Integer cantidadAlquileres() {
        return (int) alquileres.stream().count();
    }

    public void vaciarLibreria(){
        alquileres.clear();
    }
}
