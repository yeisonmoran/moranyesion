import java.util.*;


public class Automovil {
    

    String marca;
    int modelo;
    int motor;

    enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODISESEL, GAS_NATURAL
    }

    TipoCombustible tipoCombustible;

    enum TipoAutomóvil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    TipoAutomóvil tipoAutomóvil;

    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;

    enum TipoColor {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    TipoColor color;
    int velocidadActual = 0;
    boolean esAutomatico; // Nuevo atributo para determinar si es automático
    int multas = 0; // Contador de multas

    Automovil(String marca, int modelo, int motor, TipoCombustible tipoCombustible, TipoAutomóvil tipoAutomóvil, int númeroPuertas, int cantidadAsientos, int velocidadMáxima, TipoColor color, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomóvil = tipoAutomóvil;
        this.númeroPuertas = númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.esAutomatico = esAutomatico; // Inicializamos el atributo automático en el constructor
    }

    // ... (resto de métodos)

    public static void main(String args[]) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la marca del automóvil: ");
            String marca = scanner.nextLine(); // Leemos la marca del automóvil
            
            // Resto de entradas del usuario
            // ...
            
            Automovil auto1 = new Automovil(marca, 2018, 3, TipoCombustible.DIESEL, TipoAutomóvil.EJECUTIVO, 5, 6, 250, TipoColor.NEGRO, true);
            auto1.imprimir();
            auto1.setVelocidadActual(100);
            System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
            auto1.acelerar(200); // Intentamos acelerar más allá de la velocidad máxima permitida
            System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
            System.out.println("Multas = " + auto1.getMultas()); // Obtener la cantidad de multas
            System.out.println("Valor total de multas = " + auto1.getValorTotalMultas()); // Obtener el valor total de multas
            auto1.desacelerar(50);
            System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
            auto1.frenar();
            System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
            auto1.desacelerar(20);
        }
    }

    private void frenar() {
        velocidadActual = 0;
    }

    private void desacelerar(int cantidad) {
        if (velocidadActual - cantidad >= 0) {
            velocidadActual -= cantidad;
        } else {
            velocidadActual = 0;
        }
    }

    private void acelerar(int cantidad) {
        if (velocidadActual + cantidad <= velocidadMáxima) {
            velocidadActual += cantidad;
        } else {
            multas++; // Generar multa si se supera la velocidad máxima
        }
    }

    private String getVelocidadActual() {
        return Integer.toString(velocidadActual);
    }

    private void setVelocidadActual(int nuevaVelocidad) {
        velocidadActual = nuevaVelocidad;
    }

    private void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Combustible: " + tipoCombustible);
        System.out.println("Tipo: " + tipoAutomóvil);
        System.out.println("Puertas: " + númeroPuertas);
        System.out.println("Asientos: " + cantidadAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMáxima);
        System.out.println("Color: " + color);
        System.out.println("Automático: " + esAutomatico);
    }
    
    public int getMultas() {
        return multas;
    }
    
    public int getValorTotalMultas() {
        return multas * 100; // Por ejemplo, cada multa tiene un valor de 100 unidades
    }
}

