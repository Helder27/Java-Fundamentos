package pt.citeforma.java.javamaven.c2;

public class VariablesEx2 {

    public static void main(String[] args) {
        byte b = 3;
        short s;
        int i;
        long l;
        float f = 3.0f;
        double d;
        char c = 'a';
        String str;

        //byte em short
        s = b;
        System.out.println("byte -> short = " + s);

        //short em int
        i = s;
        System.out.println("short -> int = " + i);

        //char em int
        i = c;
        System.out.println("char -> int = " + i);

        //int em long
        l = i;
        System.out.println("int -> long = " + l);

        //int em float
        f = i;
        System.out.println("float  -> int = " + f);

        //long em float
        f = l;
        System.out.println("long -> float = " + f);

        //float em double
        d = f;
        System.out.println("float -> double = " + d);

        //long em double
        d = l;
        System.out.println("long -> double = " + d);

        //char em string
        str = String.valueOf(c);
        System.out.println("String = " + str);

        // Exemplos sem perda de precisão...
        float x = f + i;
        System.out.println("float = " + x);
        
        // float + int = int
        int y = (int) f + i;
        System.out.println("int = " + y);

        // Exemplos com perda de precisão... --> Atenção!
        i = 16777217;
        f = i;
        System.out.println(f);
    }
}
