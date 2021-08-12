package pt.citeforma.java.javamaven.c3;

public class Troca01 {
    
    public static float x = 2.0f, y = 3.0f;  

    public static void troca(){
        float t;
        t = Troca01.x; 
        Troca01.x = Troca01.y; 
        Troca01.y = t;
    }   

    public static void main(String[] s){
        System.out.println("Antes  x = " + x + " y = " + y);
        Troca01.troca();
        System.out.println("Depois x = " + x + " y = " + y);
        
        /*
        Troca01 trocaTest = new Troca01();

        System.out.println("Antes Test  x = " + x + " y = " + y);
        trocaTest.troca();
        System.out.println("Depois Test x = " + x + " y = " + y);
        */
    }
}
