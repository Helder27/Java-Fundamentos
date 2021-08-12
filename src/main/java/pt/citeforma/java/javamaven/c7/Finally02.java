package pt.citeforma.java.javamaven.c7;

public class Finally02 {
    
    public static void main(String[] args) {
        int a = 3, b = 0;
        try {
            System.out.println("a/b" + (a/b));
        } 
        catch (NumberFormatException e) {
            System.out.println("Bloco Catch");
            System.out.println("	   Erro no formato do número");
            System.out.println("    " + e.getMessage());
        } 
        finally {
            System.out.println("Bloco Finally");
        }
        System.out.println("That's all folks!");
    }
}
