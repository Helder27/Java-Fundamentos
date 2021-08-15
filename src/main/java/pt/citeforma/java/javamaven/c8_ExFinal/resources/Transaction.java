package pt.citeforma.java.javamaven.c8_ExFinal.resources;

import java.util.Date;

public class Transaction {
    
    private String movementDate;
    private String movementDescription;
    private char movementType;
    private double amount;
    private double balance;
          
    public static final char euro = '\u20AC';
    public static final String separator = " :: ";
    
    public String getMovementDate (){
        return movementDate = movementDate;
    }
    
    public void setMovementDate (String movementDate){
        this.movementDate = movementDate;
    }
    
    public String getMovementDescription (){
        return movementDescription = movementDescription;
    }
    
    public void setMovementDescription (String movementDescription){
        this.movementDescription = movementDescription;
    }
    
    public char getMovementType (){
        return movementType = movementType;
    }
    
    public void setMovementType (char movementType){
        this.movementType = movementType;
    }
    
    public double getAmount (){
        return amount = amount;
    }
    
    public void setAmount (double amount){
        this.amount = amount;
    }
    
    public double getBalance (){
        return balance = balance;
    }
    
    public void setBalance (double balance){
        this.balance = balance;
    }
}
