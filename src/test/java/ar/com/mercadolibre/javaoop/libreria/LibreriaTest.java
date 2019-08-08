package ar.com.mercadolibre.javaoop.libreria;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import javax.sound.sampled.Line;
import java.time.LocalDate;
import java.util.List;

public class LibreriaTest {

    Libreria libreria;

    @Before
    public void beforeExecution() {
        libreria = Libreria.getInstance();
        libreria.vaciarLibreria();
    }

    @Test
    public void seAgregaUnAlquiler() {
        libreria.agregarAlquiler(new Libro("1234", LocalDate.of(2019, 1, 1), "Codigo da vinci"));
        Assertions.assertThat(libreria.cantidadAlquileres()).isEqualTo(1);
    }

    @Test(expected = Exception.class)
    public void buscarUnLibro() throws Exception {
        Libro libro = new Libro("1111", LocalDate.of(2001, 12, 10), "Harry Potter 1");
        libreria.agregarAlquiler(new Libro("2222", LocalDate.of(1998, 12, 10), "El señor de los anillos"));
        Alquiler libroABuscar = libreria.buscarAlquiler(libro);
        Assertions.assertThat(libroABuscar).isEqualTo(libro);
    }

    @Test
    public void listarAlquileres(){
       List<Alquiler> alquileres = libreria.listarAlquileres();
       Assertions.assertThat(alquileres).isNotNull();
    }



}
