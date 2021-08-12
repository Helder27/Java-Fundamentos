package pt.citeforma.java.javamaven.c2;

public class Array03 {
    public static void main(String[] args) {
        float numero[][] = new float [4][];
        numero[0] = new float[1];
        numero[1] = new float[2];
        numero[2] = new float[3];
        numero[3] = new float[4];
        
        float k = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<numero[i].length; j++) {
                numero[i][j] = k;
                k++;
            }
        }
        
        for (int i=0; i<4; i++) {
            for (int j=0; j<numero[i].length; j++) {
                System.out.print(numero[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }
}
