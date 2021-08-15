package pt.citeforma.java.javamaven.c8_ExFinal.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

            List<Transaction> transactionList = new ArrayList<Transaction>();
            MonetaryMovementGenerator movGen = new MonetaryMovementGenerator();
            Constants constants = new Constants();
            
            while(movementNumber < constants.maxTranactionNumber)
            {
                String description = movGen.descriptionGenerator();
                char type = movGen.typeAnalyser(description);
                double amount = movGen.amountGenerator();
                
                if(movementNumber == 0){
                    balance = amount;
                }
                else{
                    balance = movGen.accountBalance(amount, balance, type);
                }

                Transaction trans = new Transaction();
                
                trans.setMovementDate(movGen.movementDateGenerator());
                trans.setMovementDescription(description);
                trans.setMovementType(type);
                trans.setAmount(Math.round(amount));
                trans.setBalance(Math.round(balance));
                
                transactionList.add(trans);
                
                movementNumber++;
            }
            
            // <editor-fold defaultstate="expanded" desc="Header Writer customized"> 
            Header header = new Header();
            
            output.printf("%-10s :: %-26s :: %-4s :: %-8s :: %-9s %n",
                            header.getColumnDate(),
                            header.getColumnDescription(),
                            header.getColumnMovementType(),
                            header.getColumnAmount(),
                            header.getColumnBalance());
            // </editor-fold>
            
            // sort by date descending
            transactionList.sort(Comparator.comparing(Transaction::getMovementDate, Comparator.reverseOrder()));
            
            for(Transaction transaction : transactionList){
                
                // <editor-fold defaultstate="collapsed" desc="Traditional writer"> 
                /*
                output.println(transaction.getMovementDate() + constants.separator
                                + transaction.getMovementDescription() + constants.separator
                                + transaction.getMovementType() + constants.separator
                                + transaction.getAmount() + constants.euro + constants.separator
                                + transaction.getBalance() + constants.euro);
                */
                // </editor-fold>
                
                // <editor-fold defaultstate="expanded" desc="Writer customized"> 
                output.printf("%-10s :: %-26s :: %-4s :: %7.2f%c :: %8.2f%c %n",
                                transaction.getMovementDate(),
                                transaction.getMovementDescription(),
                                transaction.getMovementType(),
                                transaction.getAmount(), 
                                constants.euro, 
                                transaction.getBalance(), 
                                constants.euro);
                // </editor-fold>
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
