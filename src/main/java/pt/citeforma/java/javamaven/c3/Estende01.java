package pt.citeforma.java.javamaven.c3;

public class Estende01 {
    static int s1 = 3;
    int o1;
    
    public Estende01() {
        this.o1 = 4;
    }
    
    public static void ms1() {
        System.out.println(s1);
    }
    
    public void mo1() {
        System.out.println(this.o1);
    }
    
    public static void main(String a[]) {
        System.out.println("Ola");
    }
}
