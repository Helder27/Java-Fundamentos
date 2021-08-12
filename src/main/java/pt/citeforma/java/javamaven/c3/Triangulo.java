package pt.citeforma.java.javamaven.c3;

public class Triangulo extends FiguraGeometrica{
    
    double altura;
    double base;
    
    public Triangulo(double d1, double d2) {
        this.altura = d1;
        this.base = d2;
    }
    
    @Override
    public void calculoArea() {
        this.area = (this.altura * this.base)/2;

    }
    
    public static void main(String[] args) {
        Triangulo t = new Triangulo(4,4);
        t.calculoArea();
        System.out.println("Area de t = " + t.area);
    }
}
