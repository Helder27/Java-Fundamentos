package pt.citeforma.java.javamaven.c2;

public class HelloWorldMaven {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        double x = 1e10;
        System.out.println("x= " + Math.round(x));
        
        x = 3.9;
        int i = (int)x;
        float f = 3.0f;
        System.out.println("x= " + x + "\n" + "f= " + f + "\n" + "i= " + i);
    }
}
