package pt.citeforma.java.javamaven.c3;

public class Estende03 extends Estende01 {
    
    int o2 = 5;
    
    public static void verS1() {
        System.out.println("Estende01.s1 = " + Estende01.s1);
    }
    
    @Override
    public void mo1() {
        System.out.println("Original o1: "); 
        super.mo1(); //invocar metodo original
        System.out.println("this.o1 = " + this.o1); //Override do metodo mo1
    }
    
    public void verO2() {
        System.out.println("this.o2 = " + this.o2);
    }
    
    public static void main(String[] a) { //variaveis e metodos de classe
        System.out.println("Estende03.s1 = " + Estende03.s1);
        System.out.print("Estende03.ms1() = "); Estende03.ms1();
        verS1();
        
        //variaveis e metodos de objecto
        Estende03 obj = new Estende03();
        obj.mo1();
        obj.verO2();
    }
}
