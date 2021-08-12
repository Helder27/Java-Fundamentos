package pt.citeforma.java.javamaven.c8;

import java.util.Locale;
import java.util.Scanner;

public class Ex04LerStandard {

    public final static Locale MyCountry = new Locale("pt","PT");
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ler int:");
        int n = teclado.nextInt();
        System.out.printf("n=%d %n", n);
        // Scanner detecta Locale Portugal (, como separador décimal)
        System.out.println("Ler double com Locale Portugal:");
        // teclado.useLocale(new Locale("pt", "PT"));
        teclado.useLocale(MyCountry);
        double x = teclado.nextDouble();
        System.out.printf("x=%,f %n", x);
        System.out.println("Ler double com Locale EUA:");
        teclado.useLocale(Locale.US);
        x = teclado.nextDouble();
        System.out.printf("x=%,f %n", x);
        System.out.println("Ler novamente double com Locale Portugal:");
        // teclado.useLocale(new Locale("pt", "PT"));
        teclado.useLocale(MyCountry);
        x = teclado.nextDouble();
        System.out.printf("x=%,f %n", x);
        System.out.println("Fim de programa");
        teclado.close();
    }
}
