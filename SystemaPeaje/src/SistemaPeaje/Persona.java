
package SistemaPeaje;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellidos;
    private String documento;
    private String fechaNacimiento;

    private List<Vehiculo> vehiculosAsignados;

    public Persona(String nombre, String apellidos, String documento, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.vehiculosAsignados = new ArrayList<>();
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculosAsignados.add(vehiculo);
    }

    public void desasignarVehiculo(String placa) {
        vehiculosAsignados.removeIf(vehiculo -> vehiculo.getPlaca().equals(placa));
    }

    public double calcularTotalPeajes() {
        double totalPeajes = 0;
        for (Vehiculo vehiculo : vehiculosAsignados) {
            if (vehiculo.getTipo().equals("carro")) {
                totalPeajes += 10000;
            } else if (vehiculo.getTipo().equals("moto")) {
                totalPeajes += 5000;
            } else if (vehiculo.getTipo().equals("camion")) {
                // Aquí debes tener en cuenta la lógica para calcular el peaje del camión
                // Según el número de ejes.
                // Implementa tu lógica aquí.
            }
        }
        return totalPeajes;
    }
}
