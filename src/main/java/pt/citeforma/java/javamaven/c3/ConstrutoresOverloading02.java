package pt.citeforma.java.javamaven.c3;

public class ConstrutoresOverloading02 extends ConstrutoresOverloading01 {
    
    public ConstrutoresOverloading02() {
        //super();
        //super(3);
        System.out.println("Construtor () de 02");
    }
    
    public ConstrutoresOverloading02(int a) {
        super(a); //this.x = a;
        System.out.println("Construtor () de 02 com int a = " + a);
    }
    
    public static void main(String [] a) {
        ConstrutoresOverloading02 o1 = new ConstrutoresOverloading02(3);
        System.out.println("x = " + o1.x);
    }
}
