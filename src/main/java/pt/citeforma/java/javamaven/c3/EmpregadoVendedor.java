package pt.citeforma.java.javamaven.c3;

public class EmpregadoVendedor extends EmpregadoAssalariado{
    
    public double vendas;    //total de vendas feitas pelo vendedor, em euros
    public double comissao;  //percentagem do total de vendas

    public EmpregadoVendedor(String nomeEmp, double numHoras, double salHora, double vendas, double comissão){
        super(nomeEmp, numHoras, salHora);
        this.vendas = vendas;
        this.comissao = comissão;
    }
    
    public double calcularComissaoVendas() {
        double result = (this.vendas * this.comissao/100);
        return result;
    }
    
    public double obterVendas() {
        return this.vendas;
    }
    
    public void alterarVendas(double novaVenda) {
        this.vendas = novaVenda;
    }
    
    public double obterComissao() {
        return this.comissao;
    }
    
    public void alterarComissao(double novaComissao) {
        this.comissao = novaComissao;
    }
    
    @Override
    public double calcularSalarioBruto(){
        double result =  super.calcularSalarioBruto() + calcularComissaoVendas();
        return result;
    }
    
}
