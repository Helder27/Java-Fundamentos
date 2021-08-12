package pt.citeforma.java.javamaven.c2;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Verificar se numero e par ou impar:");
        int n = in.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        System.out.println("Digite uma nota:");
        int nota = in.nextInt();
        String s;
        
        if (nota >= 18) {
            s = "Muito Bom";
        } else {
            if (nota >= 14) {
                s = "Bom";
            } else {
                if (nota >= 10) {
                    s = "Suficiente";
                } else {
                    if (nota >= 7) {
                        s = "Mediocre";
                    } else {
                        s = "Mau";
                    }
                }
            }
        }
        System.out.println("Nota qualitativa = " + s);
    }
}
