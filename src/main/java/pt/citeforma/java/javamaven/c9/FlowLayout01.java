package pt.citeforma.java.javamaven.c9;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowLayout01 {
    
    public static void main(String[] args) {
        
        JButton jb1 = new JButton("Botão");
        JButton jb2 = new JButton("Botão grande");
        JButton jb3 = new JButton("Botão muito grande ");
        
        JPanel p = new JPanel();
        
        p.setLayout(new FlowLayout());
        p.add(jb1);
        p.add(jb2);
        p.add(jb3);
        
        JFrame02 f = new JFrame02("Exemplo FlowLayout", p, 400, 100);
        f.setVisible(true);
    }
}
