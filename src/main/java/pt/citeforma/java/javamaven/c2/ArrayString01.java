package pt.citeforma.java.javamaven.c2;

public class ArrayString01 {
    public static void main(String[] args) {
    	
        String[] as = new String[10];
        
        as[0]="Bom dia 1";
        as[1]="Bom dia 12";
        for (int i=2; i<as.length; i++) {
            as[i]="Ola"+i;
        }
        System.out.println("Percorrer com sintaxe tradicional:");
        for (int i=0; i<as.length; i++) {
            System.out.println("as["+i+"]="+as[i]+"="+as[i].length());
        }
        System.out.println("\nPercorrer com sintaxe compacta:");
        for (String s : as) {
        	System.out.println(s);
        }
        
    }
}
