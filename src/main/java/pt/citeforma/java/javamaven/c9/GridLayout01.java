package pt.citeforma.java.javamaven.c9;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayout01 {
    
    public static void main(String[] args) {
        
        JLabel jla1 = new JLabel("Label1"); JLabel jla2 = new JLabel("Label2");
        JButton jb1 = new JButton("Botão1"); JButton jb2 = new JButton("Botão2");
        JButton jb3 = new JButton("Botão3"); JButton jb4 = new JButton("Botão4");
        
        JPanel p = new JPanel();
        
        p.setLayout(new GridLayout(3,2));
        p.add(jla1); p.add(jla2);
        p.add(jb1); p.add(jb2);
        p.add(jb3); p.add(jb4);
        
        JFrame02 f = new JFrame02("Exemplo GridLayout", p, 300, 200);
        f.setVisible(true);
    }
}
