package ar.com.mercadolibre.javaoop;

import java.math.BigDecimal;

public class MotorSolar extends Motor implements Refrigerable{

    public MotorSolar(Integer potencia, Double temperatura){
        super(potencia, temperatura);
    }

    @Override
    public void agregarRefrigerante() {
        this.temperatura*=0.8;

    }
}
