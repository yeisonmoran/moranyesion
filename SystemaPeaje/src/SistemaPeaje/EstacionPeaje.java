
package SistemaPeaje;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<Vehiculo> vehiculosEnEstacion;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalRecaudado = 0;
        this.vehiculosEnEstacion = new ArrayList<>();
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void cobrarPeaje(Vehiculo vehiculo) {
        vehiculosEnEstacion.add(vehiculo);
        if (vehiculo.getTipo().equals("carro")) {
            totalRecaudado += 10000;
        } else if (vehiculo.getTipo().equals("moto")) {
            totalRecaudado += 5000;
        } else if (vehiculo.getTipo().equals("camion")) {
            // Implementa la lógica para calcular el peaje del camión aquí.
        }
    }

    public void imprimirTotalRecaudado() {
        System.out.println("Total recaudado en " + nombre + ", " + departamento + ": $" + totalRecaudado);
    }
}