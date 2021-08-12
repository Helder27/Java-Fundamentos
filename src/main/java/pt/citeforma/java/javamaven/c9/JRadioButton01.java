package pt.citeforma.java.javamaven.c9;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButton01 {
 
    public static void main(String[] args) {
        
        JRadioButton rb1 = new JRadioButton ("Sporting", true);
        JRadioButton rb2 = new JRadioButton ("Benfica", false);
        JRadioButton rb3 = new JRadioButton ("Porto", false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1); bg.add(rb2); bg.add(rb3);
        JPanel p = new JPanel();
        
        p.setBorder(BorderFactory.createTitledBorder("Clube"));
        p.add(rb1); p.add(rb2); p.add(rb3);
        
        JFrame02 f = new JFrame02("Exemplo JRadioButton 1", p, 270, 100);
        f.setVisible(true);
    }
}
