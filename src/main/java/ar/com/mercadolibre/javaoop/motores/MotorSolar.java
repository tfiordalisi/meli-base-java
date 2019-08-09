package ar.com.mercadolibre.javaoop.motores;

public class MotorSolar extends Motor implements Refrigerable{

    public MotorSolar(Integer potencia, Double temperatura){
        super(potencia, temperatura);
    }

    @Override
    public void agregarRefrigerante() {
        this.temperatura*=0.8;

    }
}
