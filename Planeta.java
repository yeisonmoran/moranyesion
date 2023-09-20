public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol;
    private TipoPlaneta tipo;
    enum TipoPlaneta { GASEOSO,TERRESTRE,ENANO}
    private boolean observableSimpleVista;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
                   int distanciaMediaAlSol, TipoPlaneta tipo, boolean observableSimpleVista) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipo = tipo;
        this.observableSimpleVista = observableSimpleVista;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " km³");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia Media al Sol: " + distanciaMediaAlSol + " millones de km");
        System.out.println("Tipo: " + tipo);
        System.out.println("Observable a Simple Vista: " + observableSimpleVista);
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esExterior() {
        double distanciaEnUA = distanciaMediaAlSol / 149597870.0; // Convertir a UA
        return distanciaEnUA > 3.4 || distanciaEnUA < 2.1;
    }

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Marte", 2, 6.39e23, 1.63e11, 6792, 227, TipoPlaneta.TERRESTRE, true);
        Planeta planeta2 = new Planeta("Júpiter", 79, 1.90e27, 1.43e15, 139820, 778, TipoPlaneta.GASEOSO, false);

        System.out.println("Información del Planeta 1:");
        planeta1.imprimirInformacion();
        System.out.println("Densidad del Planeta 1: " + planeta1.calcularDensidad() + " kg/km³");
        System.out.println("Es un Planeta Exterior: " + planeta1.esExterior());

        System.out.println("\nInformación del Planeta 2:");
        planeta2.imprimirInformacion();
        System.out.println("Densidad del Planeta 2: " + planeta2.calcularDensidad() + " kg/km³");
        System.out.println("Es un Planeta Exterior: " + planeta2.esExterior());
    }
}

 
    
    


    
    

