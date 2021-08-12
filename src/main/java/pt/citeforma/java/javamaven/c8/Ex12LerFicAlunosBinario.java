package pt.citeforma.java.javamaven.c8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex12LerFicAlunosBinario {

    public static void main(String[] args) {
        
        long numeros[] = new long[4];
        String nomes[] = new String[4];
        float notas[][] = new float[4][3];
        int i = 0; 
        
        try (DataInputStream canalIn = new DataInputStream(
                new BufferedInputStream(new FileInputStream("NotasAlunos1.dat")))) {
            try {
                while (true) { 
                    numeros[i] = canalIn.readLong();
                    nomes[i] = canalIn.readUTF();
                    notas[i][0] = canalIn.readFloat();
                    notas[i][1] = canalIn.readFloat();
                    notas[i][2] = canalIn.readFloat();
                    i++;
                }
            } 
            catch (EOFException e) {
                System.out.println("Fim de leitura de dados.");
            }
        } 
        catch (IOException e) {
            System.out.println("Problemas ao ler dados a partir do ficheiro.");
            e.printStackTrace(System.out);
        }

        for (i = 0; i < numeros.length; i++) {
            System.out.printf("%d::%s::%4.1f::%4.1f::%4.1f %n",
                    numeros[i], nomes[i], notas[i][0], notas[i][1], notas[i][2]);
        }
    }
}
