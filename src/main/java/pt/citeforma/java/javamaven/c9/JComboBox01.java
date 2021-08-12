package pt.citeforma.java.javamaven.c9;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JComboBox01 {
    
    public static void main(String[] args) {
        
        JLabel lab = new JLabel("Clube:");
        String[] clubes = {"Sporting", "Benfica", "Porto"};
        JComboBox cbClubes = new JComboBox(clubes);
        cbClubes.setEditable(true);
        JPanel p = new JPanel();
        p.add(lab);
        p.add(cbClubes);
        
        JFrame02 f = new JFrame02("Exemplo JComboBox 1", p, 330, 150);
        f.setVisible(true);
    }
}
