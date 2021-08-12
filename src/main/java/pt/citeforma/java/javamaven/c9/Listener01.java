package pt.citeforma.java.javamaven.c9;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Listener01 implements ActionListener{
    
    private int premido = 0;
    private JPanel p;
    private JButton jb;
    private JLabel lab;
    
    public static void main(String[] args) {
        
        Listener01 list = new Listener01();
        
        list.jb = new JButton("Prima-me");
        list.jb.addActionListener(list);
        list.lab = new JLabel("O botão não foi premido");
        list.p = new JPanel();
        list.p.setLayout(new BoxLayout(list.p, BoxLayout.PAGE_AXIS));
        list.jb.setAlignmentX(Component.CENTER_ALIGNMENT);
        list.lab.setAlignmentX(Component.CENTER_ALIGNMENT);
        list.p.add(list.jb);
        list.p.add(list.lab);

        JFrame02 f = new JFrame02("Exemplo gestão eventos 1", list.p, 300, 100);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        premido += 1;
        
        if (premido == 1) {
            this.lab.setText("Botao premido 1 vez");
        } 
        else {
            this.lab.setText("Botao premido " + premido + " vezes ");
        }
    }
}
