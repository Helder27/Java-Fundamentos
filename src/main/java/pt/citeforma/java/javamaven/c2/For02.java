package pt.citeforma.java.javamaven.c2;

import java.util.Scanner;


public class For02 {    
    public static void main(String[] args) {
        
        System.out.println("Escolher Exercicio(2A, 2B, TEST):");
        Scanner scan = new Scanner(System.in);
        try {
            String exNum = scan.nextLine();
            
            switch (exNum.toUpperCase()){
                case "2A":
                    For02a();
                    break;
                case "2B":
                    For02b();
                    break;
                case "TEST":
                    IntegerOverflowTest();
                    break;
                default:
                    System.out.println("Exercicio invalido!!!");
            }
        } 
        catch (Exception msg) {
            System.out.println("Exception: " + msg);
        }
    }
    
    public static void For02a(){
        
        System.out.println("Descobir factorial de:");
        Scanner scan = new Scanner(System.in);
        int i;
        int numb = scan.nextInt();
        int factI = 1;
        long factL = 1;
        
        if(numb == 0){
            System.out.println("Não existe factorial de 0! Tente outro Numero.\n");
            For02a();
            return;
        }
        
        System.out.printf("%5s%15s | %15s%n","Numb","Inteiro","Long");
        for (i=1; i<=numb; i++) {
            try {
                factI = Math.multiplyExact(factI, i);
            } 
            catch (Exception e) {
                factI = 0;
            }
            
            factL *= i;
            if(factI == 0){
                System.out.printf("%3d!=%15s | %15d%n",i,"Overflow",factL);
            }
            else{
                System.out.printf("%3d!=%15d | %15d%n",i,factI,factL);
            }
        }
    }
    
    public static void For02b(){
        System.out.println("Descobir factorial de:");
        Scanner scan = new Scanner(System.in);
        int i;
        int numb = scan.nextInt();
        float fact = 1.0f;
        
        if(numb == 0){
            System.out.println("Não existe factorial de 0! Tente outro Numero.\n");
            For02b();
            return;
        }
        
        System.out.printf("%1s | %15s%n","N","Numero Factorial");
        for (i=1; i<=numb; i++) {
            fact *= i;
            if (fact > Integer.MAX_VALUE) {
                System.out.println(i + "!= " +" Erro!!! Máximo inteiro excedido!");
            } else {
                System.out.println(i + "!= " + (int) fact);
            }
        }
    }
    
    public static void IntegerOverflowTest (){
        int a = Integer.MAX_VALUE;
        int b = Math.addExact(a,1);
        System.out.println("b = " + b);
    }
}
