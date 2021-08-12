package pt.citeforma.java.javamaven.c3;

public class PassagValor3 {
    
    public static void troca(String a, String b){
        
        String t;
        System.out.println("a = " + a + " b = " + b);
        t=a;
        a=b;
        b=t;
        System.out.println("a = " + a + " b = " + b);
    }
    
    public static void main(String[] args) {
        
        PassagValor3 valor = new PassagValor3();
        String x = "aaa";
        String y = "bbb";

        System.out.println("Antes  --> x = " + x + " | y = " + y);
        valor.troca(x, y);
        System.out.println("Depois  --> x = " + x + " | y = " + y);
    }
}
