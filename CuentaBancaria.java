public class CuentaBancaria {
    private String nombresTitular;
    private String apellidosTitular;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private double tasaInteresMensual;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroCuenta, String tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
        this.tasaInteresMensual = 0.0;
    }

    public void imprimirDatosCuenta() {
        System.out.println("Titular: " + nombresTitular + " " + apellidosTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Se ha consignado " + valor + " a la cuenta.");
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Se ha retirado " + valor + " de la cuenta.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public void aplicarInteres() {
        double interes = saldo * (tasaInteresMensual / 100);
        saldo += interes;
        System.out.println("Se ha aplicado un interés de " + interes + " al saldo.");
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", "Perez", "123456789", "Ahorros");
        cuenta.setTasaInteresMensual(1.5); // Por ejemplo, 1.5% de interés mensual
        cuenta.imprimirDatosCuenta();
        cuenta.consignar(1000);
        cuenta.retirar(300);
        cuenta.aplicarInteres();
        cuenta.imprimirDatosCuenta();
    }
}
