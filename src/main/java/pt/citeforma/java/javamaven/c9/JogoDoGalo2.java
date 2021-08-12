package pt.citeforma.java.javamaven.c9;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JogoDoGalo2 implements ActionListener{
    
    private int jogador = 1;
    private JLabel labJogador;
    private JButton bSair;
    private JButton bNovoJogo;
    private JButton quadricula[];
    
    public static void main(String[] args) {
        
        JogoDoGalo2 jogo = new JogoDoGalo2();
        jogo.labJogador = new JLabel("Jogador 1");
        jogo.bSair = new JButton("Sair");
        jogo.bSair.addActionListener(jogo);
        jogo.bNovoJogo = new JButton("Novo jogo");
        jogo.bNovoJogo.addActionListener(jogo);
        
        JPanel botoesBaixo = new JPanel();
        botoesBaixo.setLayout(new FlowLayout());
        botoesBaixo.add(jogo.bSair);
        botoesBaixo.add(jogo.bNovoJogo);
        
        JPanel tabuleiro = new JPanel();
        tabuleiro.setLayout(new GridLayout(3, 3));
        jogo.quadricula = new JButton[9];
        
        for (int i = 0; i < jogo.quadricula.length; i++) {
            jogo.quadricula[i] = new JButton("?");
            tabuleiro.add(jogo.quadricula[i]);
            jogo.quadricula[i].addActionListener(jogo);
        }
        
        JPanel pGeral = new JPanel();
        pGeral.setLayout(new BorderLayout());
        pGeral.add(jogo.labJogador, BorderLayout.NORTH);
        pGeral.add(tabuleiro, BorderLayout.CENTER);
        pGeral.add(botoesBaixo, BorderLayout.SOUTH);
        
        JFrame02 f = new JFrame02("Jogo do Galo", pGeral, 300, 200);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == bSair) {
            System.exit(0);
        } 
        else if (e.getSource() == bNovoJogo) {
            limpaQuadro();
        }
        else { // é um botão do quadro
            processaJogada(e); 
        }
    }
    
    private void processaJogada(ActionEvent e) { 
       
        JButton b = (JButton) e.getSource();
    
        if (jogador == 1) {
            b.setText("X");
            jogador = 2;
            labJogador.setText("Jogador 2");
        }
        else { 
            b.setText("O"); 
            jogador = 1; 
            labJogador.setText("Jogador 1"); 
        } 
        b.setEnabled(false);
    }

    private void limpaQuadro() {
        
        for (int i = 0; i < quadricula.length; i++) {
            quadricula[i].setText("?"); 
            quadricula[i].setEnabled(true);
        } 
    }
}
