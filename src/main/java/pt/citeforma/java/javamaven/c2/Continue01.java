package pt.citeforma.java.javamaven.c2;

public class Continue01 {
    public static void main(String[] args) {
        System.out.println("Inicio programa");
        teste();
        System.out.println("Fim programa");
    }
    
    public static void teste() {
        System.out.println("Inicio teste()");
        int i;
        for (i=0; i<=10; i+=1) {
            if (i == 5) {
                System.out.println("Continue");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Fim teste()");
    }
}
