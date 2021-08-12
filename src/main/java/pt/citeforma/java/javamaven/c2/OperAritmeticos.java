package pt.citeforma.java.javamaven.c2;

public class OperAritmeticos {

    public static void main(String[] args) {
        OperAritmeticos();
        OperAritmComp();
        OptimizacaoLogica();
        BitaBit();
        OptimizacaoLogica2();
    }

    public static void OperAritmeticos() {
        int i = 3, j = 4;
        float a = 2.14f, b = 3.52f;

        System.out.println("\nOperAritmComp\n");
        System.out.println("i = " + i + "\nj = " + j);

        System.out.println("i+j <> " + i + j);  // -> nao soma pois concatena strings
        System.out.println("i+j = " + (i + j)); // -> ja faz a soma

        System.out.println("i-j = " + (i - j));
        System.out.println("i*j = " + (i * j));
        System.out.println("j/i = " + (j / i));
        System.out.println("j%i = " + (j % i));
        
        System.out.println("a = " + a + "\nb = " + b);
        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("b/a = " + (b / a));
        System.out.println("b%a = " + (b % a));
    }

    public static void OperAritmComp() {
        int i = 3, j = 3, k = 3, m = 3;

        System.out.println("\nOperAritmComp\n");
        System.out.println("i = " + i + "\nj = " + j + "\nk = " + k + "\nm = " + m);
        System.out.println("i++ = " + (i++) + " i = " + i);
        System.out.println("++j = " + (++j) + " j = " + j);
        System.out.println("k-- = " + (k--) + " k = " + k);
        System.out.println("--m = " + (--m) + " m = " + m);
    }

    public static void OptimizacaoLogica() {
        int b = 0;

        System.out.println("\nOptimizacaoLogica\n");
        System.out.println("Resultado = " + (2 > 3 && 4 / b > 0));
        System.out.println("Correu bem, nao houve divisao por zero");
    }
    
    public static void BitaBit() {
        int a = 3;
        int b = 2;

        System.out.println("\nBitaBit()\n");
        System.out.println("Resultado = " + (a & b));
    }
    
    public static void OptimizacaoLogica2 (){
        int b = 1;
        
        System.out.println("\nOptimizacaoLogica2\n");
        System.out.println("Resultado = " + (2 > 3 & 4/b > 0));
        System.out.println("Correu bem, nao houve divisao por zero");
    }
}
