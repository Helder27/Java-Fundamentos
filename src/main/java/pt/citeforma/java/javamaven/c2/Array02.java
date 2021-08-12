package pt.citeforma.java.javamaven.c2;

public class Array02 {
    public static void main(String[] args)  {
        final int LINHA=6;
        final int COLUNA=2;
        float[][] numeros=new float[LINHA][COLUNA];
        numeros[0][0]= 1.0f;
        numeros[0][1]= 2.0f;
        numeros[1][0]= 3.0f;
        numeros[1][1]= 4.0f;
        numeros[2][0]= 5.0f;
        numeros[2][1]= 6.0f;
        numeros[3][0]= 7.0f;
        numeros[3][1]= 8.0f;
        numeros[4][0]= 9.0f;
        numeros[4][1]=10.0f;
        numeros[5][0]=11.0f;
        numeros[5][1]=12.0f;
        System.out.println("Array-->numero[" + LINHA + "][" + COLUNA + "]");
        for (int linha=0; linha<numeros.length; linha++)     {
            for (int coluna=0; coluna<numeros[0].length; coluna++) {
                System.out.printf("numero[%2d ][%2d ] = %.1f    ",linha ,coluna , numeros[linha][coluna]);
            }
            System.out.println("");
        }
        System.out.println("\nForma alternativa de percorrer o array:");
        for (float[] a : numeros) {
        	for (float b : a) {
        		System.out.print(b + "  \t");
        	}
        	System.out.println("");
        }
    }
}
