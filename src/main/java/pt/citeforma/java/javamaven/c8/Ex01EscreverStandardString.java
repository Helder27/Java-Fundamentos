package pt.citeforma.java.javamaven.c8;

public class Ex01EscreverStandardString {
    
    public static void main(String args[]) {
        
        //%[argument_index$][with][flags]conversion
        //[argument_index$] 1$ primeiro argumento, 2$ segundo argumento. 
        //Permite escrever várias vezes o mesmo argumento ou trocar argumentos
        //[with] espaço minimo ocupado
        //[flag] ,-(esquerda)
        //conversion s
        //%n escreve new line dependente da plataforma 
        // (\n escreve sempre à moda do Unix)
        String s1 = "Ola", s2 = "Bom dia";
        System.out.printf("Escrever %% %n");
        System.out.printf("Duas strings...............: %s, %s! %n", s1, s2);
        System.out.printf("Duas strings ordem inversa.: %2$s, %1$s! %n", s1, s2);
        System.out.printf("Duas vezes a mesma variavel: %1$s, %1$s! %n", s1);
        System.out.printf("String com 30 espaços......: %30s |%n", s1);
        System.out.printf("String alinhada à esquerda.: %-30s |%n", s1);
   }
}
