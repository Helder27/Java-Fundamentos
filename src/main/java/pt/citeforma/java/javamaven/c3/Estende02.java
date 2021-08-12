package pt.citeforma.java.javamaven.c3;

public class Estende02 extends Estende01 {
    
    public static void main(String[] args) { 
        
    	System.out.println("Estende01.s1 = " + Estende01.s1);
        System.out.println("Estende02.s1 = " + Estende02.s1);
        
        Estende02.s1 = 6;
        System.out.println("Estende01.s1 = " + Estende01.s1);
        System.out.println("Estende02.s1 = " + Estende02.s1);
        
        System.out.print("Estende02.ms1() = "); 
        Estende02.ms1();
        
        Estende01.s1 = 5;
        System.out.println("Estende02.s1 = " + Estende02.s1);
        
        Estende02 novoObj = new Estende02();
        System.out.println("novoObj.o1 = " + novoObj.o1);
        System.out.print("novoObj.mo1() = ");
        novoObj.mo1();
    }
}
