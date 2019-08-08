package ar.com.mercadolibre.javaoop;

import java.math.BigDecimal;
import java.util.function.DoubleConsumer;

public class Motor {

    protected Integer potencia;
    protected Double temperatura;

    public Motor() {}

    public Motor(Integer potencia, Double temperatura){
        this.potencia = potencia;
        this.temperatura = temperatura;
    }

    public Integer getPotencia() {
        return this.potencia;
    }

    public Double getTemperatura() {
        return this.temperatura;
    }

    public void subirTemperatura(){
        this.temperatura++;
    }

    public void bajarTemperatura(){
        if(this.temperatura > 0){
            this.temperatura--;
        }
    }

}
