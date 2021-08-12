package pt.citeforma.java.javamaven.c2;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        
        System.out.println("Insira um mês (numerico)");
        Scanner scan = new Scanner(System.in);
        
        try{
            int mes = scan.nextInt();
            
            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Marco");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("Nao e' um mes valido");
                    break;
            } 
        }
        catch(Exception msg){
            System.out.println("Valor digitado não é numerico\nException: " + msg);
        }
    }
}
