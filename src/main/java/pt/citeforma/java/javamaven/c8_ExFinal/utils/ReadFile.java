package pt.citeforma.java.javamaven.c8_ExFinal.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    
    public static void ReadFile(){
        
        try {
            
            List<String> list = new ArrayList<>();
            
            BufferedReader fileReader = new BufferedReader(new FileReader("MovimentosContaBancaria.txt"));
            
            String line;
            int i=0;
            
            while ((line = fileReader.readLine()) != null) {

                list.add(line);
                if(i == 0){
                    System.out.println("Foi lido o cabecalho!");
                }
                else{
                    System.out.println("Foi lido o " + i + " pagamento!");
                }
                
                i++;
            }
            
            System.out.println("\nEscrever o conteudo do ficheiro para confirmar:");
            for (String idx : list) {
		System.out.println(idx);
            }
            
            if (fileReader != null) {
                
                fileReader.close();
            }
        }
        catch (IOException e) {
            System.out.println("Problemas ao escrever dados no ficheiro.");
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }
}
