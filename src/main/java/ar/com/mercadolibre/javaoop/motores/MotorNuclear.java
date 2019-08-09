package ar.com.mercadolibre.javaoop.motores;

public class MotorNuclear extends Motor implements Refrigerable{

    public MotorNuclear(Integer potencia, Double temperatura){
        super(potencia, temperatura);
    }

    @Override
    public void agregarRefrigerante() {
        this.temperatura*=0.8;
    }
}
