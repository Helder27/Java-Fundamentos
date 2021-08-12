package pt.citeforma.java.javamaven.c9;

import javax.swing.JFrame;

public class JFrame01 {
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame();
        f.setTitle("JFrame01");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 400);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        System.out.println("JFrame01 visivel!");
    }
}
