package pt.citeforma.java.javamaven.c8_ExFinal.resources;

public class Header {
    
    private String columnDate;
    private String columnDescription;
    private String columnMovementType;
    private String columnAmount;
    private String columnBalance;
    
    public static final String separator = " :: ";
    
    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public String getColumnDate() {
        return columnDate = "Data";
    }

    public String getColumnDescription() {
        return columnDescription = "Descricao";
    }
    
    public String getColumnMovementType() {
        return columnMovementType = "Tipo";
    }

    public String getColumnAmount() {
        return columnAmount = "Montante";
    }
    
    public String getColumnBalance() {
        return columnBalance = "Saldo";
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters"> 
    public void setColumnDate(String columnDate) {
        this.columnDate = columnDate;
    }
    
    public void setColumnDescription(String columnDescription) {
        this.columnDescription = columnDescription;
    }
    
    public void setColumnMovementType(String columnMovementType) {
        this.columnMovementType = columnMovementType;
    }
    
    public void setColumnAmount(String columnAmount) {
        this.columnAmount = columnAmount;
    }

    public void setColumnBalance(String columnBalance) {
        this.columnBalance = columnBalance;
    }
    // </editor-fold>
}
