package pt.citeforma.java.javamaven.c2;

public class Array04 {
    public static void main(String[] args) {
        float numero[][] = {
            {0.0f},
            {1.0f, 2.0f},
            {3.0f, 4.0f, 5.0f},
            {6.0f, 7.0f, 8.0f, 9.0f}
        };
        for (int i=0; i<4; i++) {
            for (int j=0; j<numero[i].length; j++) {
                System.out.print(numero[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }
}
