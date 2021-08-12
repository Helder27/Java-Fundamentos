package pt.citeforma.java.javamaven.c2;

public class VariablesEX1 {

    public static void main(String args[]) {
        int n1, n2, hex, oct;
        String total;
        n1 = 2;
        n2 = 3;
        hex = 0x000D;
        oct = 011;

        System.out.println("hex = " + hex + "\noct = " + oct);
        System.out.println("hex (em binario) = " + Integer.toBinaryString(hex));

        total = Integer.toString(n1 + n2 + hex + oct);
        System.out.println("total: " + total);

        total = "Total Numberic: ";
        System.out.println(total + (n1 + n2));
        System.out.println(total + n1 + n2);

        float f = 2.14f;
        double d = 3e10;
        char c = 'a';

        System.out.println("Float = " + f + "\n"
                + "Double = " + d + "\n"
                + "Double(no exponential) = " + Math.round(d) + "\n"
                + "Char = " + c);
    }
}
