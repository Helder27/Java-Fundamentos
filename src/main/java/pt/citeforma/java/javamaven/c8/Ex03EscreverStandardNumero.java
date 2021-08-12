package pt.citeforma.java.javamaven.c8;

import java.util.Locale;

public class Ex03EscreverStandardNumero {
    
    @SuppressWarnings("boxing")
    public static void main(String args[]) {
        
        //%[argument_index$][flags][width][.precision]conversion
        System.out.printf("Inteiro em percentagem...............: %d%% %n", 15);
        System.out.printf("Inteiro em base 10, 16 e 8...........: %1$d --- %1$x --- %1$o %n", 15);
        System.out.printf("Inteiro negativo de duas formas......: %1$d --- %1$(d %n", -33);
        System.out.printf("Real em virgula fluante..............: %e %n", 1234567890.123456789);
        System.out.printf("Real virgula fluante 30 espaços......: %30e |%n", 1234567890.123456789);
        System.out.printf("Real virgula fluante 30 esp, 24 dec..: %30.24e |%n", 1234567890.123456789);
        System.out.printf("Real em virgula fixa por omissão.....: %f %n", 1234567890.123456789);
        System.out.printf("Real v.fixa com 30 espaços...........: %30.4f |%n", 1234567890.123456789);
        System.out.printf("Real v.fixa com 30 espaços à esquerda: %-,30.7f |%n", 1234567890.123456789);
        System.out.printf("Real v.fixa, 30 espaços e 12 decimais: %,30.12f |%n", 1234567890.123456789);
        System.out.printf(String.format(Locale.ENGLISH,
                    "Igual ao anterior mas em inglês......: %,30.12f |%n", 1234567890.123456789));
        System.out.printf(String.format(new Locale("pt","PT"),
                    "Igual ao anterior mas em Português...: %,30.12f |%n", 1234567890.123456789));
        System.out.printf(String.format(new Locale("pt","BR"),
                    "Igual em Português do Brasil.........: %,30.12f |%n", 1234567890.123456789));
    }
}
