package pt.citeforma.java.javamaven.c9;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JButtonJLabelJTextField01 {
    
    public static void main(String[] args) {
        
        JLabel lbNome = new JLabel("Nome:");
        JTextField tfNome = new JTextField(20);
        JButton btConfirmar = new JButton("Confirmar");
        
        JPanel p = new JPanel();
        
        p.add(lbNome);
        p.add(tfNome);
        p.add(btConfirmar);
        
        JFrame02 f = new JFrame02("Componentes Swing 1", p, 300, 100);
        f.setVisible(true);
    }
}
