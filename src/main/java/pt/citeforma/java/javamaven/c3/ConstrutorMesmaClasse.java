package pt.citeforma.java.javamaven.c3;

public class ConstrutorMesmaClasse {
    static final int MAX = 4;
    int [] impares,pares;
    
    public ConstrutorMesmaClasse() {
        this(2,3);
    }
    
    public ConstrutorMesmaClasse(int n) {
        this(n,n);
    }
    
    public ConstrutorMesmaClasse(int par,int impar) {
        if (par%2 != 0) {
            par++;
        }
        if (impar%2 == 0) {
            impar++;
        }
        this.pares = new int[MAX];
        this.impares = new int[MAX];
        
        for (int i=0; i<MAX; i++) {
            this.pares[i] = par; par += 2;
            this.impares[i] = impar; impar += 2;
        }
    }

    public void ver() {
        for (int i=0; i<this.pares.length; i++) {
            System.out.println("pares[" + i + "]=" + this.pares[i] + "\t  impares["+i+"]="
                    +this.impares[i]);
        }
        System.out.println("-----------------------");
    }
    
    public static void main(String[] a) {
        ConstrutorMesmaClasse o1 = new ConstrutorMesmaClasse(60,60);
        o1.ver();
        ConstrutorMesmaClasse o2 = new ConstrutorMesmaClasse();
        o2.ver();
        ConstrutorMesmaClasse o3 = new ConstrutorMesmaClasse(10);
        o3.ver();
    }
}
