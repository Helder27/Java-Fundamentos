package pt.citeforma.java.javamaven.c2;

public class Array01 {
    public static void main(String[] args){
        final int MAX = 6;
        int[] numeros = CriarArray(MAX);
        numeros[0] = 3;
        numeros[1] = 4;
        numeros[2] = 0;
        numeros[3] = -3;
        numeros[4] = 1;
        numeros[5] = 5;
        System.out.println("Array com " + MAX + " posicoes");
        for (int i=0; i<numeros.length; i++) {
            System.out.printf("numeros[%2d ] =%2d %n", i, numeros[i]);
        }
        System.out.println("Forma alternativa de percorrer o array:");
        for (int item : numeros) {
        	System.out.println(item);
        }
    }
    
    public static int[] CriarArray(int dimension){
        int [] result =  new int[dimension];
        return result;
    }
}
