package pt.citeforma.java.javamaven.c9;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class JScrollPane01 {
    
    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Título"));
        Dimension dim = new Dimension(200, 1000);
        panel.setPreferredSize(dim);
        
        JScrollPane sp = new JScrollPane(panel);
        
        JFrame02 f = new JFrame02("Exemplo JScrollPane", sp, 200, 300);
        f.setVisible(true);
    }
}
