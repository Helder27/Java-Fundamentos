package pt.citeforma.java.javamaven.c3;

public class EmpregadoAssalariado extends Empregado{
    
    protected double numHoras;
    protected double salHora;
    protected double salarioBruto;

    
    public EmpregadoAssalariado(String nomeEmp, double numHoras, double salHora){
        super(nomeEmp);
        this.numHoras = numHoras;
        this.salHora = salHora;
    }
    
    public double obterNumHoras() {
        return this.numHoras;
    }
    
    public void alterarNumHoras(double novasHoras) {
        this.numHoras = novasHoras;
    }
    
    public double obterSalHora() {
        return this.salHora;
    }
    
    public void alterarSalHora(double novoSalHora) {
        this.salHora = novoSalHora;
    }
    
    @Override
    public double calcularSalarioBruto(){
        double result = this.numHoras * this.salHora;
        return result;
    }
}
