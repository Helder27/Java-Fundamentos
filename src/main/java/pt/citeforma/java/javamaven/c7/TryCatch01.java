package pt.citeforma.java.javamaven.c7;

public class TryCatch01 {
    
    public static void main(String[] args) {
        int a = 1, b = 0;
        
        try {
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("ERRO - Divisão por zero!");
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        finally {
            System.out.println("That's all folks!");
        }        
    }
}
