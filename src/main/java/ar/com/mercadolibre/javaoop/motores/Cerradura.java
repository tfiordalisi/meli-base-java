package ar.com.mercadolibre.javaoop.motores;

public class Cerradura {

    private int clave;
    private boolean cerrada = true;

    public Cerradura (){}

    public Cerradura (int clave){
        this.clave = clave;
    }

    public boolean estaCerrada(){
        return cerrada;
    }

    public int getClave(){
        return this.clave;
    }

    public void abrir(int clave){
        if(this.clave == clave){
        this.cerrada = false;}
    }

}
