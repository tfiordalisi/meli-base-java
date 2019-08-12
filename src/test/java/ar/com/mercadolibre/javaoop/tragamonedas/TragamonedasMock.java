package ar.com.mercadolibre.javaoop.tragamonedas;

import java.util.ArrayList;
import java.util.List;

public class TragamonedasMock {

    private List<TamborMock> tambores;
    private static Integer CANTIDAD = 3;

    public TragamonedasMock(){
        this.tambores = new ArrayList<>();
        while(CANTIDAD > 0) {
            this.tambores.add(new TamborMock());
            CANTIDAD--;
        }
    }

    public void activar(){
        tambores.stream().forEach(t -> t.girar());
    }

    public Boolean entregarPremio() {
        return tambores.stream().allMatch(t -> t.getPosicion().equals(1));
    }

    public List<TamborMock> getTambores() {
        return tambores;
    }
}
