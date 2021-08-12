package pt.citeforma.java.javamaven.c3;

public class ContaBancaria {
    
    public static long ultimoNumero = 12345;
    public static float juro = 0.05f;
    
    private long numero;
    String titular;
    float saldo = 10;

    public ContaBancaria(String s, float sal) {
        this.numero = ++ultimoNumero;
        this.titular = s;
        this.saldo = sal;
        System.out.println("Conta: " + this.numero + 
                            "\nTitular: " + this.titular + 
                            "\nSaldo: " + this.saldo);
    }
    
    public ContaBancaria(String s) {
        this.numero = ++ultimoNumero;
        this.titular = s;
        this.saldo = 50f;
        System.out.println("Conta: " + this.numero + 
                            "\nTitular: " + this.titular + 
                            "\nSaldo: " + this.saldo);
    }

    //default
    public ContaBancaria() {
        this.numero = ++ultimoNumero;
        this.titular = "Desconhecido";
        this.saldo = 50f;
        System.out.println("Conta: " + this.numero + 
                            "\nTitular: " + this.titular + 
                            "\nSaldo: " + this.saldo);        
    }
    
    /*
    public void setNumero(long numero) {
        this.numero = numero;
    }
    */
    
    public void setNumero() {
        this.numero = ++ultimoNumero;
    }
    
    public static void alterarJuro(float novoJuro){
        
        ContaBancaria.juro = novoJuro;
        //obterJuro();
    }
    
    public static void obterJuro(){
        
        System.out.println("Juro = " + juro);
    }
    
    public void depositar(float montante){
        
        this.saldo += montante;
        this.obterSaldo();
        //this.saldo += (this.saldo * ContaBancaria.juro);
    }
    
    public void obterSaldo(){
        
        System.out.println("Numero = " + this.numero +
                    " | Titular = " + this.titular +
                    " | Saldo = " + this.saldo);
    }
    
    public static long lerProximoUltimoNumero(){
        
        return ++ContaBancaria.ultimoNumero;
    }
    
    public void levantar(float montante) {
        
        if (this.saldo >= montante) {
            this.saldo -= montante;
            this.obterSaldo();
        } else {
            System.out.print("Nao tem saldo suficiente!\n");
            //this.obterSaldo();
        }
    }
    
    public boolean levantar1(float montante){
        
        if(this.saldo >= montante){
            this.saldo = this.saldo - montante;
            return true;
        }
        else{
            System.out.println("Não tem saldo para fazer este levantamento!");
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();


        conta1.numero= ++ContaBancaria.ultimoNumero;
        conta1.titular = "Carlos";
        conta1.saldo = 210.1f;
        //System.out.println(conta1.numero + " " + conta1.titular + " " + conta1.saldo);
        conta1.obterSaldo();
        
        conta2.numero = ContaBancaria.lerProximoUltimoNumero();
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

        System.out.println("\nConstrutor Conta Bancaria Generico:");
        ContaBancaria contaGenerica = new ContaBancaria("Helder", 2.0f);
        contaGenerica.depositar(60f);
        contaGenerica.levantar(70f);

        System.out.println("\nConstrutor Conta Bancaria nome 'Desconhecido' e saldo default:");
        ContaBancaria contaSaldoDefault = new ContaBancaria("Helder");
        contaSaldoDefault.depositar(10f);
        
        System.out.println("\nConstrutor Default:");
        ContaBancaria contaDefault = new ContaBancaria();
        contaDefault.depositar(0f);
    }
}
