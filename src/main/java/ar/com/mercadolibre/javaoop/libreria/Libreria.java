package ar.com.mercadolibre.javaoop.libreria;

import javax.swing.text.html.Option;
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

    public void agregarAlquiler(Alquilable alquilable){
        alquilable.alquilar();
        alquileres.add(new Alquiler(alquilable));
    }

    public void devolverAlquiler(Alquilable alquilable) throws Exception {
        alquilable.alquilar();
        Optional<Alquiler> optionalAlquiler = alquileres.stream().filter(a -> a.getAlquilable().equals(alquilable)).findFirst();
        if(!optionalAlquiler.isPresent()) {
            throw new Exception("No se encontro libro en lista de alquieres");
        }
        optionalAlquiler.get().getAlquilable().devolver();
    }

    public Alquiler buscarAlquiler(Alquilable alquilable) throws Exception {
        Optional<Alquiler> optionalAlquiler = alquileres.stream().filter(alquiler -> alquiler.getAlquilable().equals(alquilable)).findFirst();
        if(!optionalAlquiler.isPresent()) {
            throw new Exception("No se encontro libro en lista de alquieres");
        }
        return optionalAlquiler.get();
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
