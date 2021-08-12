package pt.citeforma.java.javamaven.c3;

public class ConstrutoresOverloading01 {
    
    int x;
    
    public ConstrutoresOverloading01() {
        System.out.println("Construtor () de 01");
    }
    
    public ConstrutoresOverloading01(int a) {
        //a = 2;
        x = a;
        System.out.println("Construtor (int a) de 01 - " + a);
    }
}
