package pt.citeforma.java.javamaven.c8_ExFinal.resources;

import java.util.Date;
import pt.citeforma.java.javamaven.c8_ExFinal.config.Constants;

public class Transaction {
    
    private String movementDate;
    private String movementDescription;
    private char movementType;
    private double amount;
    private double balance;
    
    // <editor-fold defaultstate="collapsed" desc="Getters"> 
    public String getMovementDate (){
        return movementDate = movementDate;
    }
    
    public String getMovementDescription (){
        return movementDescription = movementDescription;
    }
    
    public char getMovementType (){
        return movementType = movementType;
    }
    
    public double getAmount (){
        return amount = amount;
    }
    
    public double getBalance (){
        return balance = balance;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setMovementDate (String movementDate){
        this.movementDate = movementDate;
    }
    
    public void setMovementDescription (String movementDescription){
        this.movementDescription = movementDescription;
    }
    
    public void setMovementType (char movementType){
        this.movementType = movementType;
    }
    
    public void setAmount (double amount){
        this.amount = amount;
    }
    
    public void setBalance (double balance){
        this.balance = balance;
    }
    // </editor-fold>
}
