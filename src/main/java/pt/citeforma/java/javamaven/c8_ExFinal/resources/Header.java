package pt.citeforma.java.javamaven.c8_ExFinal.resources;

public class Header {
    
    private String columnDate;
    private String columnDescription;
    private String columnMovementType;
    private String columnAmount;
    private String columnBalance;
    
    public String getColumnDate() {
        return columnDate = "Data do movimento";
    }

    public void setColumnDate(String columnDate) {
        this.columnDate = columnDate;
    }
    
    public String getColumnDescription() {
        return columnDescription = "Descrição do movimento";
    }

    public void setColumnDescription(String columnDescription) {
        this.columnDescription = columnDescription;
    }
    
    public String getColumnMovementType() {
        return columnMovementType = "Tipo de movimento";
    }

    public void setColumnMovementType(String columnMovementType) {
        this.columnMovementType = columnMovementType;
    }
    
    public String getColumnAmount() {
        return columnAmount = "Montante movimentado";
    }

    public void setColumnAmount(String columnAmount) {
        this.columnAmount = columnAmount;
    }
    
    public String getColumnBalance() {
        return columnBalance = "Saldo da conta";
    }

    public void setColumnBalance(String columnBalance) {
        this.columnBalance = columnBalance;
    }
}
