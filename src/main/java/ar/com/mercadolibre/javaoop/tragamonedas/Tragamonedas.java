package ar.com.mercadolibre.javaoop.tragamonedas;

import java.util.ArrayList;
import java.util.List;

public class Tragamonedas {

    private List<Tambor> tambores;
    private static Integer CANTIDAD = 3;

    public Tragamonedas(){
        this.tambores = new ArrayList<>();
        while(CANTIDAD > 0) {
            this.tambores.add(new Tambor());
            CANTIDAD--;
        }
    }

    public void activar(){
        tambores.stream().forEach(t -> t.girar());
    }

    public Boolean entregarPremio() {


        return false;
    }

}
