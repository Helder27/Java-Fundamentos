package pt.citeforma.java.javamaven.c9;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Listener02 implements ActionListener{
    
    private JButton ok;
    private JButton sair;
    private JTextField tf;
    private JTextArea ta;
    
    public static void main(String[] args) {
        
        Listener02 list = new Listener02();
        
        list.ok = new JButton("Ok");
        list.ok.addActionListener(list);
        list.sair = new JButton("Sair");
        list.sair.addActionListener(list);
        list.tf = new JTextField(30);
        list.tf.addActionListener(list);
        list.ta = new JTextArea(30,10);
        list.ta.setEditable(false);
        JScrollPane sp = new JScrollPane(list.ta);
        
        JPanel pBotoes = new JPanel();
        pBotoes.setLayout(new FlowLayout());
        pBotoes.add(list.sair);
        pBotoes.add(list.ok);
        
        JPanel pEsquerda = new JPanel();
        pEsquerda.setLayout(new BorderLayout());
        pEsquerda.add(list.tf, BorderLayout.NORTH);
        pEsquerda.add(pBotoes, BorderLayout.SOUTH);
        
        JPanel geral = new JPanel();
        geral.setLayout(new GridLayout(1,2,10,10));
        geral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        geral.add(pEsquerda);
        geral.add(sp);
        
        JFrame02 f = new JFrame02("Exemplo gestão eventos 2", geral, 450, 200);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed (ActionEvent evt) {
        if (evt.getSource() == sair) {
            ((JFrame) sair.getTopLevelAncestor()).dispose();
        }
        //System.exit(0); 
        else { 
            if ((evt.getSource() == ok) || (evt.getSource() == tf)) {
                ta.append(tf.getText() + "\n"); 
                tf.setText(""); 
                tf.requestFocusInWindow(); 
            } 
        }
    }
}
