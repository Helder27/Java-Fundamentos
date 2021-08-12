package pt.citeforma.java.javamaven.c2;

public class While01 {

    public static void main(String[] args) {
        int soma, a;
        soma = 0;
        a = 1;
        String resultA = "         a = ";

        while (a <= 4) {
            soma += a; //soma = soma + a -> acumula 'soma e incrementa 'a' na mesma instrucao
            if (soma >= 10) {
                resultA = resultA.substring(1);
            }

            System.out.println("Soma = " + soma + resultA + a);
            a++;    // a = a + 1; ++a;
        }
        System.out.println("Soma = " + soma);
    }
}
