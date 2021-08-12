package pt.citeforma.java.javamaven.c2;

public class String01 {
    public static void main(String[] args) {
        String s1 = "Helder";
        String s2 = "Helder";
        String s3 = s2.substring(0,4)+"er";
        System.out.println(s3);
        
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        if (s1 == s3) {
            System.out.println("s1 == s3");
        } else {
            System.out.println("s1 != s3");
        }
        if (s1.equals(s3) && s1.equals(s2)) {
            System.out.println("Os conteúdos são iguais\n");
        } else {
            System.out.println("Os conteúdos são diferentes\n");
        }
        
        System.out.println("Comparar com Helton");
        if (s1.equals("Helton")) {
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
