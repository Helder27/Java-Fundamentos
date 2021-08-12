package pt.citeforma.java.javamaven.c3;

public class EmpregadoEmpresa {
    
    public static void main(String[] args) {
        System.out.println("========== EmpregadoAssalariado =================");
        EmpregadoAssalariado assal1= new EmpregadoAssalariado("António", 176.5f, 3.5f);
        System.out.println("Nome........... = " + assal1.nome);
        System.out.println("Numero......... = " + assal1.numero);
        System.out.println("Numero de Horas = " + assal1.numHoras);
        System.out.println("Salario Hora... = " + assal1.salHora);
        System.out.println("Salario Bruto.. = " + assal1.calcularSalarioBruto());
        System.out.println("Calculo Imposto IRS.. = " + assal1.calculoImposto(assal1.calcularSalarioBruto()));
        System.out.println("Salario Liquido.. = " + assal1.calculoSalarioLiquido(assal1.calcularSalarioBruto()));

        System.out.println("=== Assalariado com novo nome, mais horas e mais salario/hora");
        assal1.numHoras = 200f;
        assal1.salHora = 4.75f;
        assal1.nome="António Gonçalves";
        System.out.println("Nome........... = " + assal1.nome);
        System.out.println("Numero......... = " + assal1.numero);
        System.out.println("Numero de Horas = " + assal1.numHoras);
        System.out.println("Salario Hora... = " + assal1.salHora);
        System.out.println("Salario Bruto.. = " + assal1.calcularSalarioBruto());
        System.out.println("Calculo Imposto IRS.. = " + assal1.calculoImposto(assal1.calcularSalarioBruto()));
        System.out.println("Salario Liquido.. = " + assal1.calculoSalarioLiquido(assal1.calcularSalarioBruto()));
        
        System.out.println("\n=========== EmpregadoVendedor ===================");
        System.out.println("\"filho\" de assalariado \"neto\" de empregado");
        EmpregadoVendedor vendedor1= new EmpregadoVendedor("Carlos", 100f, 3.5f, 10f, 3000f);
        System.out.println("Nome................ = " + vendedor1.nome);
        System.out.println("Numero.............. = " + vendedor1.numero);
        System.out.println("Numero de Horas..... = " + vendedor1.numHoras);
        System.out.println("Salario Hora........ = " + vendedor1.salHora);
        System.out.println("Comissao............ = " + vendedor1.comissao);
        System.out.println("Vendas.............. = " + vendedor1.vendas);
        System.out.println("Salario em comissoes = " + vendedor1.calcularComissaoVendas());
        System.out.println("Salario Bruto....... = " + vendedor1.calcularSalarioBruto());
        System.out.println("Calculo Imposto IRS.. = " + vendedor1.calculoImposto(vendedor1.calcularSalarioBruto()));
        System.out.println("Salario Liquido.. = " + vendedor1.calculoSalarioLiquido(vendedor1.calcularSalarioBruto()));
        System.out.println("=== O vendedor trabalhou mais e foi aumentado...");
        vendedor1.vendas = 3500f;
        vendedor1.numHoras = 300f;
        vendedor1.salHora = 5.75f;
        System.out.println("Nome................ = " + vendedor1.nome);
        System.out.println("Numero.............. = " + vendedor1.numero);
        System.out.println("Numero de Horas..... = " + vendedor1.numHoras);
        System.out.println("Salario Hora........ = " + vendedor1.salHora);
        System.out.println("Comissao............ = " + vendedor1.comissao);
        System.out.println("Vendas.............. = " + vendedor1.vendas);
        System.out.println("Salario em Comissoes = " + vendedor1.calcularComissaoVendas());
        System.out.println("Salario Bruto....... = " + vendedor1.calcularSalarioBruto());
        System.out.println("Calculo Imposto IRS.. = " + vendedor1.calculoImposto(vendedor1.calcularSalarioBruto()));
        System.out.println("Salario Liquido.. = " + vendedor1.calculoSalarioLiquido(vendedor1.calcularSalarioBruto()));

        System.out.println("\n====== EmpregadoConsultor ======================");
        EmpregadoConsultor consult1 = new EmpregadoConsultor("Carlos Muralhas", 2000f);
        System.out.println("Nome.......... = " + consult1.nome);
        System.out.println("Numero........ = " + consult1.numero);
        System.out.println("Salario Mensal = " + consult1.salMensal);
        System.out.println("Salario Bruto. = " + consult1.calcularSalarioBruto());
        System.out.println("Calculo Imposto IRS.. = " + consult1.calculoImposto(consult1.calcularSalarioBruto()));
        System.out.println("Salario Liquido.. = " + consult1.calculoSalarioLiquido(consult1.calcularSalarioBruto()));
        System.out.println("=== O consultor foi aumentado...");
        consult1.salMensal = 3000f;
        System.out.println("Nome.......... = " + consult1.nome);
        System.out.println("Numero........ = " + consult1.numero);
        System.out.println("Salario Mensal = " + consult1.salMensal);
        System.out.println("Salario Bruto. = " + consult1.calcularSalarioBruto());
        System.out.println("Calculo Imposto IRS.. = " + consult1.calculoImposto(consult1.calcularSalarioBruto()));
        System.out.println("Salario Liquido.. = " + consult1.calculoSalarioLiquido(consult1.calcularSalarioBruto()));
    }
}
