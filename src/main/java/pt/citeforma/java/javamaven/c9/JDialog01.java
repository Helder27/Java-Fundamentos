package pt.citeforma.java.javamaven.c9;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialog01 {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Uma JFrame");
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        JDialog d = new JDialog(f, "Uma JDialog", true);
        d.setSize(300, 200);
        d.setLocationRelativeTo(f);
        f.setVisible(true);
        d.setVisible(true);
        System.out.println("Dialog01 visível");
    }
}
