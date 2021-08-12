package pt.citeforma.java.javamaven.c8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ex09LerFicAlunosTexto02 {
    
    public static void main(String[] args) {
        
        try { 
            
            Scanner ficheiroAlunos = new Scanner(new BufferedReader(new FileReader("NotasAlunos1.txt")));
            String linha;
            String[] partes;

            while (ficheiroAlunos.hasNextLine()) {
                
                linha = ficheiroAlunos.nextLine();
                // System.out.println(linha);

                partes = linha.split("::");

                for (int i = 0; i < partes.length; i++) {
                        System.out.print(partes[i] + "--");
                }
                System.out.println("");
            }

            ficheiroAlunos.close();
            System.out.println("Os dados foram lidos do ficheiro.");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }
}
