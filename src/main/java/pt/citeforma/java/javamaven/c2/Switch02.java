package pt.citeforma.java.javamaven.c2;

public class Switch02 {
    public static void main(String[] args) {
        int mes = 2, ano = 2100, numDias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if ((ano%4 == 0) && ((ano%100 != 0) || (ano%400 == 0))) {
                    numDias = 29;
                }else{
                    numDias = 28;
                }
                break;
                /*so funciona quando o ano e' >= 1752 */
            default:
                System.out.println("Nao e' um mes valido!");
                numDias = 0;
                break;
        }
        if (numDias != 0) {
            System.out.println("Numero de dias do mes = " + numDias);
        }
    }
}
