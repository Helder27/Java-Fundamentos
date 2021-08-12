package pt.citeforma.java.javamaven.c3;

import javax.swing.JFrame;

public class ConstrutorSuperClasse02 extends ConstrutorSuperClasse01{
    
    public ConstrutorSuperClasse02() {
        super();
        System.out.println("Construtor de ConstrutorSuperClasse02");
    }
    
    public static void main(String [] a) {
        ConstrutorSuperClasse02 o = new ConstrutorSuperClasse02();
        JFrame f;
    }
}
