package pt.citeforma.java.javamaven.c3;

public class PassagValor2 {
    
    public static void troca(float[] a){
        
        float t;
        System.out.println("a[0] = " + a[0] + " |   a[1] = " + a[1]);
        t=a[0];	
        a[0]=a[1];  
        a[1]=t;
        System.out.println("a[0] = " + a[0] + " |   a[1] = " + a[1]);
    }
    
    public static void main(String[] args){
        
        float[] x= new float[2];
        x[0]=2.0f;
        x[1]=3.0f;
        System.out.println("Antes  --> x[0] = " + x[0] + " |   x[1] = " + x[1]);
        troca(x);
        System.out.println("Depois --> x[0] = " + x[0] + " |   x[1] = " + x[1]);
    }
}
