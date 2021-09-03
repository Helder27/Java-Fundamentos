package pt.citeforma.java.javamaven.c8_ExFinal.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import pt.citeforma.java.javamaven.c8_ExFinal.config.Constants;
import pt.citeforma.java.javamaven.c8_ExFinal.resources.Header;
import pt.citeforma.java.javamaven.c8_ExFinal.resources.Transaction;

public class WriteFile {
    
    public static void  WriteFile(){
        
        try {
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("MovimentosContaBancaria.txt")));
            
            int movementNumber = 0;
            double balance = 0;
            LocalDateTime date = null;

            List<Transaction> transactionList = new ArrayList<Transaction>();
            MonetaryMovementGenerator movGen = new MonetaryMovementGenerator();
            
            while(movementNumber < Constants.MAX_TRANSACTION_NUMBER)
            {
                String description = movGen.descriptionGenerator();
                Constants.movType type = movGen.typeAnalyser(description);
                double amount = movGen.amountGenerator();
                
                if(movementNumber == 0){
                    date = movGen.movementDateGenerator();
                    balance = amount;
                }
                else{
                    date = date.plusMinutes(movGen.minutesGenerator());
                    balance = movGen.accountBalance(amount, balance, type);
                }

                Transaction trans = new Transaction();
                
                trans.setMovementDate(movGen.dateTimeFormatterToString(date));
                trans.setMovementDescription(description);
                trans.setMovementType(type.getCode());
                trans.setAmount(Math.round(amount));
                trans.setBalance(Math.round(balance));
                
                transactionList.add(trans);
                
                movementNumber++;
            }
            
            output.printf("%-16s :: %-26s :: %-4s :: %-8s :: %-9s %n",
                            Header.COLUMN_DATE,
                            Header.COLUMN_DESCRIPTION,
                            Header.COLUMN_MOVEMENT_TYPE,
                            Header.COLUMN_AMOUNT,
                            Header.COLUMN_BALANCE);
            
            // sort by date descending
            transactionList.sort(Comparator.comparing(Transaction::getMovementDate, Comparator.reverseOrder()));
            
            for(Transaction transaction : transactionList){
                
                // <editor-fold defaultstate="collapsed" desc="Traditional writer"> 
                /*
                output.println(transaction.getMovementDate() + Constants.SEPARADOR
                                + transaction.getMovementDescription() + Constants.SEPARADOR
                                + transaction.getMovementType() + Constants.SEPARADOR
                                + transaction.getAmount() + Constants.EURO + Constants.SEPARADOR
                                + transaction.getBalance() + Constants.EURO);
                */
                // </editor-fold>
                
                output.printf("%-16s :: %-26s :: %-4s :: %7.2f%c :: %8.2f%c %n",
                                transaction.getMovementDate(),
                                transaction.getMovementDescription(),
                                transaction.getMovementType(),
                                transaction.getAmount(), 
                                Constants.EURO, 
                                transaction.getBalance(), 
                                Constants.EURO);
            }
            output.close();
            
        } 
        catch (IOException e) {
            System.out.println("Problemas ao escrever dados no ficheiro.");
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }
}
