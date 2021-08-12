package pt.citeforma.java.javamaven.c9;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JogoDoGalo1 {
    
    private JLabel labJogador;
    private JButton bSair;
    private JButton bNovoJogo;
    private JButton quadricula[];

    public static void main(String[] args) {
        
        JogoDoGalo1 jogo = new JogoDoGalo1();
        jogo.labJogador = new JLabel("Jogador 1");
        jogo.bSair = new JButton("Sair");
        jogo.bNovoJogo = new JButton("Novo jogo");
        JPanel botoesBaixo = new JPanel();
        botoesBaixo.setLayout(new FlowLayout());
        botoesBaixo.add(jogo.bSair);
        botoesBaixo.add(jogo.bNovoJogo);

        JPanel tabuleiro = new JPanel();
        tabuleiro.setLayout(new GridLayout(3,3));
        jogo.quadricula = new JButton[9];
        
        for (int i=0; i<9; i++) {
            jogo.quadricula[i] = new JButton("?");
            tabuleiro.add(jogo.quadricula[i]);
        }
        
        JPanel pGeral = new JPanel();
        pGeral.setLayout(new BorderLayout());
        pGeral.add(jogo.labJogador, BorderLayout.NORTH);
        pGeral.add(tabuleiro, BorderLayout.CENTER);
        pGeral.add(botoesBaixo, BorderLayout.SOUTH);
        
        JFrame02 f = new JFrame02("Jogo do Galo", pGeral, 300, 200);
        f.setVisible(true);
    }
}
