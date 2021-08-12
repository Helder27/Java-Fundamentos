package pt.citeforma.java.javamaven.c7;

public class Finally01 {
    
    public static void main(String[] args) {
        int a = 3, b = 0;
        try {
            System.out.println("a/b" + (a/b));
        } 
        catch (ArithmeticException e) {
            System.out.println("Bloco Catch");
            System.out.println("   ERRO - Divisão por zero!");
            System.out.println("   " + e.getMessage());
        } 
        finally {
            System.out.println("Bloco Finally");
        }
        System.out.println("That's all folks!");
    }
}
