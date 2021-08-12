package pt.citeforma.java.javamaven.c8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Ex08LerFicAlunosTexto01 {
    
    public static void main(String[] args) {
        
        long numeros[] = new long[4];
        String nomes[] = new String[4];
        float notas[][] = new float[4][3];
        int i = 0;
        
        Locale.setDefault(new Locale("pt", "PT"));
        
        try {
            Scanner ficheiroAlunos = new Scanner(new BufferedReader(new FileReader("NotasAlunos1.txt")));
            ficheiroAlunos.useDelimiter("\\s*::\\s*");
            
            while (ficheiroAlunos.hasNext()) {
                
                numeros[i] = ficheiroAlunos.nextLong();
                nomes[i] = ficheiroAlunos.next();
                notas[i][0] = ficheiroAlunos.nextFloat();
                notas[i][1] = ficheiroAlunos.nextFloat();
                notas[i][2] = ficheiroAlunos.nextFloat();
                i++;
                
                System.out.println("Foi lida a linha = " + i);
             }
            
            ficheiroAlunos.close();
            System.out.println("Os dados foram lidos do ficheiro.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Problema com o ficheiro.");
            e.printStackTrace(System.out);
            System.exit(-1);
        }

        System.out.println("Escrever o conteudo dos arrays para confirmar:");
        for (i = 0; i < numeros.length; i++) {
            System.out.printf("%d--%s--%4.1f--%4.1f--%4.1f %n",
                    numeros[i], nomes[i], notas[i][0], notas[i][1], notas[i][2]);
        }
    }
}
