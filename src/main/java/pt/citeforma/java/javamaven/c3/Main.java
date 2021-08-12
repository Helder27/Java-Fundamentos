package pt.citeforma.java.javamaven.c3;

public class Main {
    
    public static void main(String[] args) {
        
        A a1 = new A();
        System.out.println("A1: " + a1.n);
        
        A a2 = new A(3);
        System.out.println("A2: " + a2.n);
        
        B b1 = new B();
        System.out.println("B1: " + b1.y);
        
        B b2 = new B(5);
        System.out.println("B2: " + b2.y);
    }
    
}
