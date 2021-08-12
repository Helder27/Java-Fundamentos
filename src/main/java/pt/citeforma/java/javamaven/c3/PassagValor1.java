package pt.citeforma.java.javamaven.c3;

public class PassagValor1 {
    
    public static void troca(float a, float b){
        
        float t;
        System.out.println("a = " + a + " b = " + b);
        t=a;
        a=b;
        b=t;
        System.out.println("a = " + a + " b = " + b);
    }
    
    public static void main(String[] args) {
        
        PassagValor1 valor = new PassagValor1();
        float x = 2.0f;
        float y = 3.0f;

        System.out.println("Antes  --> x = " + x + " y = " + y);
        valor.troca(x, y);
        System.out.println("Depois  --> x = " + x + " y = " + y);
    }
      
}
