package pt.citeforma.java.javamaven.c8;

import java.util.Calendar;
import java.util.Locale;

public class Ex02EscreverStandardData {
    
    public static void main(String args[]) {
        
        //%[argument_index$][with][flags]conversion
        Calendar cal = Calendar.getInstance();
        System.out.printf("Data pré-definida: %tc %n", cal); //usa cal uma vez
        System.out.printf("YYYY-mm-dd: %1$tY-%1$tm-%1$td %n", cal); //usa cal varias vezes
        System.out.printf("HH:MM:SS:SSS TMZ: %1$tH:%1$tM:%1$tS:%1$tL %1$tZ(%1$tz): %n", cal);
        System.out.printf("Nome do mês: %1$tB %1$tb %n", cal);
        System.out.printf("Dia da semana: %1$tA %1$ta %n", cal);
        System.out.printf("Dia do ano: %1$tj %n", cal);
        System.out.printf(String.format(Locale.ENGLISH,"Nome do mês em inglês: %1$tB %1$tb %n", cal));
        Locale.setDefault(new Locale("es","ES"));  //Definir um locale default
        System.out.printf("Nome do mês com Locale Default: %1$tB %1$tb %n", cal);
        System.out.printf("Dia da semana com Locale Default: %1$tA %1$ta %n", cal);
        System.out.printf("Nome do mês alinhado esquerda: **%-10tB** %n", cal);
   }
}
