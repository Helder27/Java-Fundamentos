package pt.citeforma.java.javamaven.c2;

public class Array05 {
    
    public static void main(String[] args) {
        double numero1[][],numero2[][];
        numero1 = new double [11000][11000];
        
        try {
            System.out.println("Primeiro array criado. Prima ENTER para criar o segundo array....");
            System.in.read();
            
            numero2 = new double [11000][11000];
            numero1[0][0] = 3.0;
            numero2[0][0] = 3.0;
            
            System.out.println("Segundo array criado. Prima ENTER para terminar....");
            System.in.read();
        } 
        catch (Exception msg) {
            System.out.println("Exception: " + msg);
        }
        
    }
}
