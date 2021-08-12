package pt.citeforma.java.javamaven.c9;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrame02 extends JFrame {
    
    public JFrame02(String title, Container c, int width, int height) {
        
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(c);
        
        if (width>0 && height>0) {
            this.setSize(width, height);
        } 
        else { 
            this.pack();
        }
        
        this.setLocationRelativeTo(null);
    } 
    
    public static void main(String[] args) { 
        
        JPanel panel = new JPanel(); 
        panel.setBackground(Color.YELLOW); 
        JFrame02 f = new JFrame02("JPanel dentro de JFrame", panel, 300, 200);
        f.setVisible(true);
    }
}
