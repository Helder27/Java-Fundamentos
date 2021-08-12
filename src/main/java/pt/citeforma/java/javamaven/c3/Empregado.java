package pt.citeforma.java.javamaven.c3;

import pt.citeforma.java.javamaven.c4.*;

public abstract class Empregado implements EmpregadoCalculoIRS{
    
    public static long ultimoNumEmp = 0;
    
    public String nome;
    public long numero;
    
    public Empregado() {
        this.nome = "Anonimo";
        this.numero = ++ultimoNumEmp;
    }
    
    public Empregado(String s) {
        //super();
        this.nome = s;
        this.numero = ++ultimoNumEmp;
    }
    
    public abstract double calcularSalarioBruto();
    
    @Override
    public double calculoImposto(double salarioBruto){
        float percentagemIRS = escaloesIRS[escaloesIRS.length - 1][1];
        
        for(int index = 0; index < escaloesIRS.length - 1; index++){
            
            if(salarioBruto <= escaloesIRS[index][0]){

                percentagemIRS = escaloesIRS[index][1];
                break;
            }
        }
        
        return Math.round(salarioBruto*(percentagemIRS/100)*100)/100;
    }
    
    @Override
    public double calculoSalarioLiquido(double salarioBruto){
        double result = salarioBruto - calculoImposto(salarioBruto);
        return Math.round(result * 100)/100;
    }
}
