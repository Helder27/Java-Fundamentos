package pt.citeforma.java.javamaven.c8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex14FilesNew {
    
    public static void main(String[] args) {
        
      //directoria do projecto
      Path fic = Paths.get(System.getProperty("user.dir"));
      mostraPropriedades(fic);

      //ficheiro 
      fic = Paths.get(System.getProperty("user.dir") + "/NotasAlunos1.txt");
      mostraPropriedades(fic);
    }

    private static void mostraPropriedades(Path fic) {
        
        System.out.println("---------------------------------------------------");
        try {
            System.out.println("Nome: " + fic.getFileName());
            System.out.println("Caminho: " + fic.getParent());
            System.out.println("Raiz: " + fic.getRoot());
            System.out.println("Número de subdirectorias: " + fic.getNameCount());
            System.out.println("Directoria na posição 3: " + fic.getName(3));
            System.out.println("Canonical path: " + fic.toRealPath());
            System.out.println("Absolute path: " + fic.toAbsolutePath());
            System.out.println("");
            System.out.println("Existe? " + Files.exists(fic));
            System.out.println("Não existe? " + Files.notExists(fic));
            System.out.println("É uma directoria? " + Files.isDirectory(fic));
            System.out.println("É um ficheiro? " + Files.isRegularFile(fic));
            System.out.println("Dimensão: " + Files.size(fic));
            System.out.println("Está escondido? " + Files.isHidden(fic));
            System.out.println("Permissão de read? " + Files.isReadable(fic));
            System.out.println("Permissão de write? " + Files.isWritable(fic));
            System.out.println("Permissão de execute? " + Files.isExecutable(fic));
            System.out.println("Data da última alteração: " + Files.getLastModifiedTime(fic));
        } 
        catch (IOException e) {
            e.printStackTrace(System.out);
        }
        System.out.println("---------------------------------------------------");
    }
}
