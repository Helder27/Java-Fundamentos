package pt.citeforma.java.javamaven.c3;

public class Circulo extends FiguraGeometrica {
    
    double raio;
    
    public Circulo(double r) {
        this.raio = r;
    }
    
    @Override
    public void calculoArea() {
        this.area = Math.PI*this.raio*this.raio;
    }
    
    public static void main(String[] args) {
        Circulo c = new Circulo(2);
        c.calculoArea();
        System.out.println("Area de c = " + c.area);
        System.out.println("Area de c arredondada = " + Math.round(c.area));

    }
}
