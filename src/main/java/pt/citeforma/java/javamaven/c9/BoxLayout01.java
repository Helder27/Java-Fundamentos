package pt.citeforma.java.javamaven.c9;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxLayout01 {
    
    public static void main(String[] args) {
        
        JButton jb1 = new JButton("Prima-me");
        JLabel lab1 = new JLabel("O botão não foi premido");
        
        JPanel p = new JPanel();
        
        p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
        jb1.setAlignmentX(Component.CENTER_ALIGNMENT);
        lab1.setAlignmentX(Component.CENTER_ALIGNMENT);
        p.add(jb1); p.add(lab1);
        
        JFrame02 f = new JFrame02("Exemplo BoxLayout 1", p, 300, 100);
        f.setVisible(true);
    }
}
