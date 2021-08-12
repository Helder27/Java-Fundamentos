package pt.citeforma.java.javamaven.c2;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Quer acabar (S/N) ?");
            String c = scan.nextLine();
            
            switch (c.toUpperCase()) {
                case "S":
                    System.out.println("Respondeu SIM!");
                    break;
                case "N":
                    System.out.println("Respondeu NAO!");
                    break;
                default:
                    System.out.println("Resposta invalida!");
                    break;
            }
        }
        catch(Exception msg){
            System.out.println("Exception: " + msg);
        }
        
    }
}
