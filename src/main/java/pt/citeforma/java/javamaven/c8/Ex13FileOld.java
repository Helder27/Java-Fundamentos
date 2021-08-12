package pt.citeforma.java.javamaven.c8;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex13FileOld {
    
    public static void main(String[] args) {
        
        File fic = new File(System.getProperty("user.dir"));
        mostraPropriedades(fic);
         
        fic = new File(System.getProperty("user.dir") + File.separatorChar
                + "classes" + File.separator + "capitulo6" + File.separatorChar
                + "File01.class");
        mostraPropriedades(fic);
    }
    
    private static void mostraPropriedades(File fic) {
        
    System.out.println("------------------------------------------------");

    try {
        System.out.println("Nome: " + fic.getName());
        System.out.println("Caminho: " + fic.getParent());
        System.out.println("Path: " + fic.getPath());
        System.out.println("Canonical name: " + fic.getCanonicalPath());
        System.out.println("Absolute path: " + fic.getAbsolutePath());
        System.out.println("");
        System.out.println("Existe? " + fic.exists());
        System.out.println("É uma directoria? " + fic.isDirectory());
        System.out.println("É um ficheiro? " + fic.isFile());
        System.out.println("Está escondido? " + fic.isHidden());
        System.out.println("Permissão de read? " + fic.canRead());
        System.out.println("Permissão de write? " + fic.canWrite());
        System.out.println("");
        System.out.println("Dimensão: " + fic.length());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd hh:mm:ss zzz");
        System.out.println("Data da última alteração: " + sdf.format(fic.lastModified()));
    } 
    catch (IOException e) {
        e.printStackTrace(System.out);
    }
    
    System.out.println("------------------------------------------------");
   }
}
