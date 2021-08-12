package pt.citeforma.java.javamaven.c8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Ex10LerFicAlunosTexto03 {
   
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
    // Definir arrays que vão receber os dados contidos no ficheiro (4 linhas)
        Locale.setDefault(new Locale("pt","PT"));
    /*
        long numeros[] = new long[4];
        String nomes[] = new String[4];
        float notas[][] = new float[4][3];
    */   
        EntityAluno[] ea = new EntityAluno[15];
        int contadorLinhas = 0; 

        try {
            Scanner ficheiroAlunos = new Scanner(new BufferedReader(new FileReader("NotasAlunos1.txt")));

            NumberFormat nf = NumberFormat.getInstance();
            String linha; 
            String[] partes; 
            
            while (ficheiroAlunos.hasNextLine()) {

                linha = ficheiroAlunos.nextLine();

                partes = linha.split("::");
                
                EntityAluno aluno = new EntityAluno();
                
                aluno.numero = nf.parse(partes[0].trim()).longValue();
                aluno.nome = partes[1].trim();
                aluno.nota1 = nf.parse(partes[2].trim()).floatValue();
                aluno.nota2 = nf.parse(partes[3].trim()).floatValue();
                aluno.nota3 = nf.parse(partes[4].trim()).floatValue();
                
                ea[contadorLinhas] = aluno;

/*                
                numeros[contadorLinhas] = nf.parse(partes[0].trim()).longValue();
                nomes[contadorLinhas] = partes[1].trim();
                notas[contadorLinhas][0] = nf.parse(partes[2].trim()).floatValue();
                notas[contadorLinhas][1] = nf.parse(partes[3].trim()).floatValue();
                notas[contadorLinhas][2] = nf.parse(partes[4].trim()).floatValue();
*/               
                contadorLinhas++;

                
                System.out.println("Foi lida a linha = " + contadorLinhas);
            }

            ficheiroAlunos.close();
            System.out.println("\nOs dados foram lidos do ficheiro.");
        } 
        catch (FileNotFoundException e) { 
            e.printStackTrace(System.out); 
            System.exit(-1);
        } 
        catch (ParseException e) { 
            e.printStackTrace(System.out);
            System.exit(-1);
        }

        System.out.println("Escrever o conteudo dos arrays para confirmar:");
        for (int i = 0; i < contadorLinhas; i++) {
                //System.out.printf("%d--%s--%4.1f--%4.1f--%4.1f %n", numeros[i], nomes[i], notas[i][0], notas[i][1], notas[i][2]);
                System.out.printf("%d--%s--%4.1f--%4.1f--%4.1f %n", ea[i].numero, ea[i].nome, ea[i].nota1, ea[i].nota2, ea[i].nota3);
        }
    }
}
