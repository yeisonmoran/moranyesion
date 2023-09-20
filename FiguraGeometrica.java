import java.lang.Math;


abstract class FiguraGeometrica {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}


class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

   
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}


class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }
}


class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}

class TrianguloRectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return 0.5 * base * altura;
    }

    double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return base + altura + hipotenusa;
    }

    double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    String determinarTipoTriangulo() {
        if (base == altura) {
            return "Equilátero";
        } else if (base == altura || base == calcularHipotenusa() || altura == calcularHipotenusa()) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}


class Rombo extends FiguraGeometrica {
    private double diagonalMayor;
    private double diagonalMenor;

    public Rombo(double diagonalMayor, double diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }

    double calcularPerimetro() {
        return 4 * Math.sqrt(Math.pow(diagonalMayor / 2, 2) + Math.pow(diagonalMenor / 2, 2));
    }
}


class Trapecio extends FiguraGeometrica {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }

public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(8, 6);
        Cuadrado cuadrado = new Cuadrado(4);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(5, 12);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());

        Rombo rombo = new Rombo(10, 8);
        System.out.println("Área del rombo: " + rombo.calcularArea());
        System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());

        Trapecio trapecio = new Trapecio(12, 8, 5, 7, 7);
        System.out.println("Área del trapecio: " + trapecio.calcularArea());
        System.out.println("Perímetro del trapecio: " + trapecio.calcularPerimetro());
    }
}



