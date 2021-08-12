package pt.citeforma.java.javamaven.c9;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextArea01 {
    
    public static void main(String[] args) {
        
        int nColunas = 20; int nLinhas = 10;
        JTextArea ta = new JTextArea("Texto inicial", nLinhas, nColunas);
        ta.setEditable(true);
        JScrollPane sp = new JScrollPane(ta);
        JPanel p = new JPanel();
        p.add(sp);
        
        JFrame02 f = new JFrame02("Exemplo JTextArea 1", p, 330, 250);
        f.setVisible(true);
    }
}
