package pt.citeforma.java.javamaven.c2;

public class For01 {
    public static void main(String[] args) {
        long k;
        for (k=1; k<=5; k++){
            System.out.print(k + ";");
        }
        System.out.println(".");
        for (k = 1; k++ <= 5; ){
            System.out.print(k + ";");
        }
        System.out.println(".");
        k = 1;
        for ( ; ++k <= 5; ){
            System.out.print(k + ";");
        }
        System.out.println(".");
    }
}
