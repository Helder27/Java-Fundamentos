package pt.citeforma.java.javamaven.c8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class Ex07EscreverFicAlunosTexto {
    
    public static void main(String[] args) {
        
        Locale.setDefault(new Locale("pt", "PT"));

        long numeros[] = new long[4];
        String nomes[] = new String[4];
        float notas[][] = new float[4][3];

        numeros[0] = 20110001;
        nomes[0] = "Jose Antonio Almeida";
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
        
        try  (PrintWriter canalOut = new PrintWriter(new BufferedWriter(new FileWriter("NotasAlunos1.txt")))){
            
            for (int i = 0; i < numeros.length; i++) {
                
                canalOut.printf("%s::%s::%4.1f::%4.1f::%4.1f::%n",
                        numeros[i], nomes[i], notas[i][0], notas[i][1], notas[i][2]);
            }
/*            
            canalOut.printf("%nNotas de Alunos Indentada:%n");
            for (int i = 0; i < numeros.length; i++) {
                
                canalOut.printf("%10s :: %-30s :: %4.1f :: %4.1f :: %4.1f %n",
                        numeros[i], nomes[i], notas[i][0], notas[i][1], notas[i][2]);
            }
*/
            System.out.println("Os dados foram escritos para o ficheiro.");
        } 
        catch (IOException e) {
            System.out.println("Problemas ao escrever dados no ficheiro.");
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }
}
