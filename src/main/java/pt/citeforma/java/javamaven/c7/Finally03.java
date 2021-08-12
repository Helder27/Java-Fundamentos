package pt.citeforma.java.javamaven.c7;

public class Finally03 {
    
    public static void main(String[] args) {
        int a = 3, b = 0;
        try {
            System.out.println("a/b" + (a/b));
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return; //Sai e não passa no ultimo sysout
        } 
        finally {
            System.out.println("Bloco Finally");
        }
        System.out.println("That's all folks!");
    }    
}
