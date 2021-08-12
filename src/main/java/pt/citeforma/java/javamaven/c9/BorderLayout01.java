package pt.citeforma.java.javamaven.c9;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayout01 {
    
    public static void main(String[] args) {
        
        JButton jb1 = new JButton("vou para NORTH");
        JButton jb2 = new JButton("vou para CENTER");
        JButton jb3 = new JButton("vou para EAST");
        
        JPanel p = new JPanel();
        
        p.setLayout(new BorderLayout());
        p.add(jb1,BorderLayout.NORTH);
        p.add(jb2,BorderLayout.CENTER);
        p.add(jb3,BorderLayout.EAST);
        
        JFrame02 f = new JFrame02("Exemplo BorderLayout", p, 300, 200);
        f.setVisible(true);
    }
}
