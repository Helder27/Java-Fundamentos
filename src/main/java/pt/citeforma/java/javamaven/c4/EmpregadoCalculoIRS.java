package pt.citeforma.java.javamaven.c4;

public interface EmpregadoCalculoIRS {
    
    public final float[][] escaloesIRS = {
        {  5600f,  5.0f},
        { 14000f,  7.0f},
        { 40000f, 10.0f},
        {100000f, 15.0f},
    };
    
    public double calculoImposto(double salarioBruto);
    public double calculoSalarioLiquido(double salarioBruto);

}
