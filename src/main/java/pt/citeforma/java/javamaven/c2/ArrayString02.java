package pt.citeforma.java.javamaven.c2;

public class ArrayString02 {
    public static void main(String[] args) {
        
        String[] nome = { "João", "Pedro", "Manuel", "José" };
        
        for (int i = 0; i < nome.length; i++) {
            System.out.println("nome[" + i + "] = " + nome[i]);
        }
    }
}
