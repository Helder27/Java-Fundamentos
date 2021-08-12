package pt.citeforma.java.javamaven.c3;

public class EmpregadoConsultor extends Empregado {
    
    public double salMensal;
    
    public EmpregadoConsultor(String nome, double salMensal){
        super(nome);
        this.salMensal = salMensal;
    }
    
    public double obterSalMensal() {
        return this.salMensal;
    }
    
    public void obterSalMensal(double novoSalMensal) {
        this.salMensal = novoSalMensal;
    }
    
    @Override
    public double calcularSalarioBruto(){
        double result = this.salMensal;
        return result;
    }
    
}
