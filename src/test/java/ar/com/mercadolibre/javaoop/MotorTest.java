package ar.com.mercadolibre.javaoop;

import ar.com.mercadolibre.javaoop.motores.Motor;
import ar.com.mercadolibre.javaoop.motores.MotorCombustible;
import ar.com.mercadolibre.javaoop.motores.MotorNuclear;
import ar.com.mercadolibre.javaoop.motores.MotorSolar;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MotorTest {

    @Test
    public void seCreaMotor() {
        Motor motor = new Motor();
        Assertions.assertThat(motor).isNotNull();
    }

    @Test
    public void seCreaMotorConAtributos() {
        Motor motor = new Motor(12, 12.0);
        Assertions.assertThat(motor.getPotencia()).isNotNull();
        Assertions.assertThat(motor.getTemperatura()).isNotNull();
    }

    @Test
    public void seCreaMotorCombustibleConAtributos() {
        MotorCombustible motor = new MotorCombustible(12, 12.0);
        Assertions.assertThat(motor.getPotencia()).isNotNull();
        Assertions.assertThat(motor.getTemperatura()).isNotNull();
    }

    @Test
    public void seCreaMotorSolarConAtributos() {
        MotorSolar motor = new MotorSolar(12, 12.0);
        Assertions.assertThat(motor.getPotencia()).isNotNull();
        Assertions.assertThat(motor.getTemperatura()).isNotNull();
    }

    @Test
    public void seCreaMotorNuclearConAtributos() {
        MotorNuclear motor = new MotorNuclear(12, 12.0);
        Assertions.assertThat(motor.getPotencia()).isNotNull();
        Assertions.assertThat(motor.getTemperatura()).isNotNull();
    }

    @Test
    public void seSubeTemperatura() {
        Motor motor = new Motor(12, 12.0);
        motor.subirTemperatura();
        Assertions.assertThat(motor.getTemperatura()).isEqualTo(13);
    }


    @Test
    public void seBajaTemperatura() {
        Motor motor = new Motor(12, 12.0);
        motor.bajarTemperatura();
        Assertions.assertThat(motor.getTemperatura()).isEqualTo(11);
    }

    @Test
    public void seAgregaRefrigeranteEnMotorNuclear() {
        MotorNuclear motor = new MotorNuclear(12, 12.0);
        motor.agregarRefrigerante();
        //Assertions.assertThat(motor.getTemperatura()).isCloseTo(9.6) isEqualTo(9.6);
    }
}
