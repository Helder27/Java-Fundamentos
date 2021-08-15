package pt.citeforma.java.javamaven.c8_ExFinal.utils;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class MonetaryMovementGenerator {
    
    public String movementDateGenerator (){
        
        LocalDate date = LocalDate.now();        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        int randomDays = (int)(Math.random()*3);
        
        LocalDate dateRandom = date.plusDays(randomDays);
        
        return formatter.format(dateRandom);
    } 
    
    public String descriptionGenerator(){
        
        List<String> list = new ArrayList<>();
        
        // <editor-fold defaultstate="collapsed" desc="Description List"> 
        list.add("Levantamento no multibanco");
        list.add("Compra no Continente");
        list.add("Deposito de valores");
        list.add("Deposito de cheque");
        list.add("Compra no Pingo Doce");
        list.add("Pagamento bomba Repsol");
        list.add("Reembolso Pagamento");
        list.add("Compra online");
        list.add("Transferencia Recebida");
        list.add("Transferencia Efectuada");
        list.add("Pagamento Restaurante");
        // </editor-fold>
        
        // TODO - Ler lista de descricao a partir de um txt
        
        MonetaryMovementGenerator mov = new MonetaryMovementGenerator();
        String description = mov.getRandomDescription(list);
        
        return description;
    }

    public char typeAnalyser (String descricao){
        
        char type = '-';
        
        if(descricao.contains("Levantamento")) type = 'L';
        if(descricao.contains("Compra")) type = 'L';
        if(descricao.contains("Reembolso")) type = 'D';
        if(descricao.contains("Recebida")) type = 'L';
        if(descricao.contains("Deposito")) type = 'D';
        if(descricao.contains("Efectuada")) type = 'D';
        if(descricao.contains("Pagamento")) type = 'L';

        return type;
    }
    
    public double accountBalance (double amount, double balance, char movementType){
        
        double newAmount = 0;
        
        switch (movementType){
            case 'L':
                newAmount = balance - amount;
                break;
            
            case 'D':
                newAmount = balance + amount;
                break;
        }
        
        // TODO - Fazer verificacao, se negativo nao pode efectuar a transacao
        // if(newAmount < 0) newAmount = 0;
        
        return newAmount;
    }
    
    public double amountGenerator(){
        
        Random rand = new Random();
        double amount = rand.nextDouble()*1000;
        
        return amount;
    }
    
    private String getRandomDescription(List<String> list)
    {
        Random rand = new Random();
        String randomElement = null;
        int randomIndex = rand.nextInt(list.size());
        randomElement = list.get(randomIndex);
        
        return randomElement;
    }
}
