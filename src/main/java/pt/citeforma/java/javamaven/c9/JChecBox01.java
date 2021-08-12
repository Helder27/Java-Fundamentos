package pt.citeforma.java.javamaven.c9;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class JChecBox01 {
    
    public static void main(String[] args) {
        
        JCheckBox cb1 = new JCheckBox("Itálico", false);
        JCheckBox cb2 = new JCheckBox("Sublinhado", true);
        JCheckBox cb3 = new JCheckBox("Negrito", true);
        JPanel p = new JPanel();
        
        p.setBorder(BorderFactory.createTitledBorder("Formatação"));
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        
        JFrame02 f = new JFrame02("Exemplo JChecBox 1", p, 270, 100);
        f.setVisible(true);
    }
}
