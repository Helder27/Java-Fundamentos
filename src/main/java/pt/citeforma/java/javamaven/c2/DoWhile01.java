package pt.citeforma.java.javamaven.c2;

import javax.swing.JOptionPane;

public class DoWhile01 {
    public static void main(String[] args) {
        int ano;
        do {
            String s = JOptionPane.showInputDialog("Qual o ano?");
            ano = Integer.parseInt(s);
          
        }  while (ano <= 1752);
        //e' bissexto se for divisivel por 4, excepto os divisiveis por 100
        //mas contando com os divisiveis por 400
        //1900 nao e' bissexto, mas 2000 e' bissexto
        if ((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0))) {
            System.out.println(ano + " e' bissexto!");
        } else {
            System.out.println(ano + " nao e' bissexto!");
        }
    }
}
