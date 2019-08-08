package ar.com.mercadolibre.javaoop.playa.estacionamiento;

import java.util.ArrayList;
import java.util.List;

public class PlayaCarga {

    public PlayaCarga instance = new PlayaCarga();

    private List<Utilitario> utilitarios;
    private static Integer CARGA_TOTAL = 50;

    private PlayaCarga(){
        utilitarios = new ArrayList<Utilitario>();
    }

    public PlayaCarga getInstance() {
        return instance;
    }

    public List<Utilitario> getUtilitarios() {
        return utilitarios;
    }

    public void cargarUtilitario(Utilitario utilitario) {
        utilitarios.add(utilitario);
        CARGA_TOTAL--;
    }
}
