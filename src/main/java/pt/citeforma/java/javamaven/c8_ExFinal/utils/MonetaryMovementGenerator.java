package pt.citeforma.java.javamaven.c8_ExFinal.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import pt.citeforma.java.javamaven.c8_ExFinal.config.Constants;

public class MonetaryMovementGenerator {
    
    public LocalDateTime movementDateGenerator(){
        
        LocalDateTime date = LocalDateTime.now();        
        
        int randomDays = (int)(Math.random()*3);
        
        LocalDateTime dateRandom = date.plusDays(randomDays);
        
        return dateRandom;
    } 
    
    public String dateTimeFormatterToString(LocalDateTime dateRandom){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        return formatter.format(dateRandom);
    }
    
    public long minutesGenerator(){
        
        //1 dia = 1440 min
        long randomMin = (long)(Math.random()*1440);
        
        return randomMin;
    }
    
    public String descriptionGenerator(){
        
        List<String> list = new ArrayList<>();
        
        // <editor-fold defaultstate="collapsed" desc="Description List"> 
        /*
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
        */
        // </editor-fold>
        
        // Ler lista de descricao a partir de um txt
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("DescriptionList.txt"));
            
            String line;
            
            while ((line = fileReader.readLine()) != null) {

                list.add(line);
            }
            
            if (fileReader != null) {
                
                fileReader.close();
            }
        } 
        catch (IOException e) {
            System.out.println("Problemas ao ler os dados no ficheiro DescriptionList.txt");
            e.printStackTrace(System.out);
            System.exit(-1);
        }

        
        MonetaryMovementGenerator mov = new MonetaryMovementGenerator();
        String description = mov.getRandomDescription(list);
        
        return description;
    }

    public Constants.movType typeAnalyser(String descricao){
        
        Constants.movType type = null;
        
        if(descricao.contains("Levantamento")) type = Constants.movType.LEVANTAMENTO;
        if(descricao.contains("Compra")) type = Constants.movType.LEVANTAMENTO;
        if(descricao.contains("Reembolso")) type = Constants.movType.DEPOSITO;
        if(descricao.contains("Recebida")) type = Constants.movType.LEVANTAMENTO;
        if(descricao.contains("Deposito")) type = Constants.movType.DEPOSITO;
        if(descricao.contains("Efectuada")) type = Constants.movType.DEPOSITO;
        if(descricao.contains("Pagamento")) type = Constants.movType.LEVANTAMENTO;

        return type;
    }
    
    public double accountBalance(double amount, double balance, Constants.movType movementType){
        
        double newAmount = 0;
        
        switch (movementType){
            case LEVANTAMENTO:
                newAmount = balance - amount;
                break;
            
            case DEPOSITO:
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
