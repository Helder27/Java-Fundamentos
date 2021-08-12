package pt.citeforma.java.javamaven.c2;

public class OperUnario {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 1;
        
        //++a
        a= a + 1;
        System.out.println(a);
        
        //b++
        System.out.println(b);
        b = b + 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
                
    }
}
