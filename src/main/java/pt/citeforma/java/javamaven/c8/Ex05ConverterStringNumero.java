package pt.citeforma.java.javamaven.c8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Ex05ConverterStringNumero {
    
    public static void main(String args[]) {
        
        //Definir locale default - importante para ler e escrever Float
        //em Portugal o separador dos décimais é a virgula
        Locale.setDefault(new Locale("pt", "PT"));
        String s = "123456,1234567";
        //Locale.setDefault(Locale.US);
        //String s = "123,456.1234567";
        //Criar um NumberFormat para agilizar as conversões de texto para número
        NumberFormat nf = NumberFormat.getInstance();
        DecimalFormat df = new DecimalFormat();
        double xNum = 0;
        double xDec = 0;

        try {
           //trim() tira os espacos em branco à esq e direita
           //df.parse converte a String em numero tendo em conta o Locale
           xNum = nf.parse(s.trim()).doubleValue();
           xDec = df.parse(s.trim()).doubleValue();
        } catch (ParseException ex) {
           System.out.println("Erro no formato do número");
           ex.printStackTrace(System.out);
           System.exit(-1);
        }
        System.out.printf("xNum = %,20.7f %n", xNum);
        System.out.printf("xDec = %,20.7f %n", xDec);
   }
}
