package pt.citeforma.java.javamaven.c2;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        
        System.out.println("Digite um mes:");
        Scanner scan = new Scanner(System.in);
        
        try {
            String mes = scan.nextLine();
            int ano=2100, numDias = 0;
            switch (mes.toUpperCase()) {
                case "JANEIRO":
                case "MARÇO":
                case "MAIO":
                case "JULHO":
                case "AGOSTO":
                case "OUTUBRO":
                case "DEZEMBRO":
                    numDias = 31;
                    break;
                case "ABRIL":
                case "JUNHO":
                case "SETEMBRO":
                case "NOVEMBRO":
                    numDias = 30;
                    break;
                case "FEVEREIRO":
                    if ((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0))) {
                        numDias = 29;
                    }else{
                        numDias = 28;
                    }
                    break;
                    /*so funciona quando o ano e' >= 1752 */
                default:
                    System.out.println("Nao e' um mes valido!");
                    numDias = 0;
                    break;
            }
            if (numDias != 0) {
                System.out.println("Numero de dias do mes = " + numDias);
            }
        }
        catch(Exception msg) {
            System.out.println("Exception: " + msg);
        }
    }
}
