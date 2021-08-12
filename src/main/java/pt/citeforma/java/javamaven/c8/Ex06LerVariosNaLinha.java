package pt.citeforma.java.javamaven.c8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Ex06LerVariosNaLinha {
    
    public static void main(String args[]) {
        
        //Definir locale default - importante para ler e escrever Float
        Locale.setDefault(new Locale("pt", "PT"));
        //Criar um NumberFormat para agilizar as conversões de texto para número
        NumberFormat nf = NumberFormat.getInstance();
        DecimalFormat df = new DecimalFormat();

        //uma linha tem nº de aluno, nome, nota1, nota2 e nota3
        //definir como limitador a sequência :: com espaços em branco à esquerda e direita
        //o primeiro campo é um número e portanto não pode ter espaços em branco à esquerda
        String s = " 20110001 :: Jose Antonio Almedia :: 10,1 :: 10,2 :: 10,3 ";
        try (Scanner sIn = new Scanner(s)) {
            
            sIn.useDelimiter("::");
            System.out.println("NumberFormat:");
            System.out.println("|" + nf.parse(sIn.next().trim()).longValue() + "|");
            System.out.println("|" + sIn.next().trim() + "|"); //ler String
            System.out.println("|" + nf.parse(sIn.next().trim()).floatValue() + "|");
            System.out.println("|" + nf.parse(sIn.next().trim()).floatValue() + "|");
            System.out.println("|" + nf.parse(sIn.next().trim()).floatValue() + "|");
            
            Scanner sInDec = new Scanner(s);
            
            sInDec.useDelimiter("::");
            System.out.println("\nDecimalFormat:");
            System.out.println("|" + df.parse(sInDec.next().trim()).longValue() + "|");
            System.out.println("|" + sInDec.next().trim() + "|"); //ler String
            System.out.println("|" + df.parse(sInDec.next().trim()).floatValue() + "|");
            System.out.println("|" + df.parse(sInDec.next().trim()).floatValue() + "|");
            System.out.println("|" + df.parse(sInDec.next().trim()).floatValue() + "|");
        } 
        catch (ParseException e) {
            System.out.println("Problema ao ler o ficheiro de input");
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }
}
