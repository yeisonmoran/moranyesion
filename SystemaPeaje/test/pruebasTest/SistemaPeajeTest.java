
package pruebasTest;

import SistemaPeaje.EstacionPeaje;
import SistemaPeaje.Persona;
import SistemaPeaje.Vehiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaPeajeTest {

    @Test
    public void testCalcularTotalPeajes() {
        // Crea una persona y asigna vehículos
        Persona persona = new Persona("Juan", "Pérez", "12345678", "01-01-1990");
        Vehiculo carro = new Vehiculo("ABC123", "carro");
        Vehiculo moto = new Vehiculo("XYZ789", "moto");
        persona.asignarVehiculo(carro);
        persona.asignarVehiculo(moto);

        // Calcula el total de peajes para la persona
        double totalPeajes = persona.calcularTotalPeajes();

        // Ajusta el valor esperado según la lógica de peaje en la clase Persona
        double valorEsperado = 10000 + 5000; // 15000

        // Comprueba que el valor calculado coincida con el esperado
        assertEquals(valorEsperado, totalPeajes, 0.001); // Usamos un delta para manejar números flotantes
    }
    
    @Test
    public void testCobrarPeaje() {
        // Crea una estación de peaje y un vehículo
        EstacionPeaje estacion = new EstacionPeaje("Peaje A", "Departamento X");
        Vehiculo camion = new Vehiculo("QWE456", "camion");

        // Cobra el peaje al vehículo
        estacion.cobrarPeaje(camion);

        // Ajusta el valor esperado según la lógica de peaje en la clase EstacionPeaje
        double valorEsperado = 0; // Debes calcularlo según la lógica implementada

        // Comprueba que el valor calculado coincida con el esperado
        assertEquals(valorEsperado, estacion.getTotalRecaudado(), 0.001); // Usamos un delta para manejar números flotantes
    }
}
