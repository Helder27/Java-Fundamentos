package pt.citeforma.java.javamaven.c3;

public class ContaBancariaTeste {
    
    public static void main(String[] args) {
       
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        //conta1.setNumero(++ContaBancaria.ultimoNumero);
        conta1.setNumero();
        conta1.titular = "Carlos";
        conta1.saldo = 210.1f;
        //System.out.println(conta1.numero + " " + conta1.titular + " " + conta1.saldo);
        conta1.obterSaldo();
        
        //conta2.setNumero(ContaBancaria.lerProximoUltimoNumero());
        conta2.setNumero();
        conta2.titular = "Maria";
        conta2.saldo = 435.6f;
        //System.out.println(conta2.numero + " " + conta2.titular + " " + conta2.saldo);
        conta2.obterSaldo();
        
        System.out.println("\nA depositar 30.5 na Conta 1!");
        conta1.depositar(30.5f);
        
        System.out.println("A levantar 40.5 na Conta 1!");
        conta1.levantar(40.5f);
        System.out.println("\nSaldo Conta 1:");
        conta1.obterSaldo();

        System.out.println("\nA levantar 100.5 na Conta 2!");
        conta2.levantar(100.5f);
        System.out.println("A levantar 500 na Conta 2!");
        conta2.levantar(500);
        System.out.println("\nSaldo Conta 2:");
        conta2.obterSaldo();

        System.out.println("\nJuro Inicial: " + ContaBancaria.juro);
        System.out.println("A alterar Juro!");
        ContaBancaria.alterarJuro(0.08f);
        System.out.println("Obter Juro:");
        ContaBancaria.obterJuro();
    }
}
