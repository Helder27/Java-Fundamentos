package pt.citeforma.java.javamaven.c8_ExFinal.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import pt.citeforma.java.javamaven.c8_ExFinal.resources.Transaction;

public class WriteFile {
    
    public static void  WriteFile(){
        
        try {
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("MovimentosContaBancaria.txt")));
            
            int movementNumber = 0;
            double balance = 0;

            List<Transaction> transactionList = new ArrayList<Transaction>();
            MonetaryMovementGenerator movGen = new MonetaryMovementGenerator();
            
            while(movementNumber < 7)
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
            
            // sort by date descending
            transactionList.sort(Comparator.comparing(Transaction::getMovementDate, Comparator.reverseOrder()));
            
            for(Transaction transaction : transactionList){
                
                output.println(transaction.getMovementDate() + transaction.separator
                                + transaction.getMovementDescription() + transaction.separator
                                + transaction.getMovementType() + transaction.separator
                                + transaction.getAmount() + transaction.euro + transaction.separator
                                + transaction.getBalance() + transaction.euro);
            }
                
            output.close();
            
        } catch (IOException e) {
            System.out.println("Problemas ao escrever dados no ficheiro.");
            e.printStackTrace(System.out);
            System.exit(-1);
        }
    }
}
