package pt.citeforma.java.javamaven.c8;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex11EscreverFicAlunosBinario {
    
    public static void main(String[] args) {
        
        long numeros[] = new long[4];
        String nomes[] = new String[4];
        float notas[][] = new float[4][3]; 
        
        numeros[0] = 20110001;
        nomes[0] = "Jose Antonio Almedia";
        notas[0][0] = 10.1f;
        notas[0][1] = 10.2f;
        notas[0][2] = 10.3f;

        numeros[1] = 20110002;
        nomes[1] = "Manuel da Fonseca Bragança";
        notas[1][0] = 11.1f;
        notas[1][1] = 11.2f;
        notas[1][2] = 11.3f;

        numeros[2] = 20110003;
        nomes[2] = "Antonio Pedro Bruno";
        notas[2][0] = 12.1f;
        notas[2][1] = 12.2f;
        notas[2][2] = 12.3f;

        numeros[3] = 20110004;
        nomes[3] = "Catarina Almeida Graça";
        notas[3][0] = 13.1f;
        notas[3][1] = 13.2f;
        notas[3][2] = 13.3f;
        
        try (DataOutputStream canalOut = new DataOutputStream(
                        new BufferedOutputStream(new FileOutputStream("NotasAlunos1.dat")))) {
            
            for (int i = 0; i < numeros.length; i++) {
                canalOut.writeLong(numeros[i]);
                canalOut.writeUTF(nomes[i]);
                canalOut.writeFloat(notas[i][0]);
                canalOut.writeFloat(notas[i][1]);
                canalOut.writeFloat(notas[i][2]);
            }
            System.out.println("Os dados foram escritos para o ficheiro.");
        } 
        catch (IOException e) {
            System.out.println("Problema ao escrever dados no ficheiro.");
            e.printStackTrace(System.out);
        }
    }
}
