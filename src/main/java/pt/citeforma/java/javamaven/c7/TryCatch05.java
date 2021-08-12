package pt.citeforma.java.javamaven.c7;

public class TryCatch05 {
    
    public static void main(String[] args) {
        int[] a = new int[6];
        try {
            a[8] = 12;
        } 
        catch (NumberFormatException e) {
            System.out.println("Foi gerada uma NumberFormatException");
            System.out.println(e.getMessage());
        } 
        catch (ArithmeticException e) {
            System.out.println("Foi gerada uma ArithmeticException");
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Foi gerado um Bloco Exception");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("That's all folks!");
        }
    }
}
