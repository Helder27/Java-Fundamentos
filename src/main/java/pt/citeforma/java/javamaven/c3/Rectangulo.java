package pt.citeforma.java.javamaven.c3;

public class Rectangulo extends FiguraGeometrica {
    
    double lado1;
    double lado2;
    
    public Rectangulo(double d1, double d2) {
        this.lado1 = d1;
        this.lado2 = d2;
    }
    
    @Override
    public void calculoArea() {
        this.area = this.lado1 * this.lado2;
    }
    
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(3,4);
        r.calculoArea();
        System.out.println("Area de r = " + r.area);
    }
}
