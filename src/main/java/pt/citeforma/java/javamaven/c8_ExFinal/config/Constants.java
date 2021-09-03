package pt.citeforma.java.javamaven.c8_ExFinal.config;

public class Constants {
    
    public static final char EURO = '\u20AC';
    public static final String SEPARADOR = " :: ";
    public static final int MAX_TRANSACTION_NUMBER = 10;
    
    public enum movType{
        LEVANTAMENTO('L'),
        DEPOSITO('D');
        
        private char code;
        
        private movType(char code){
            this.code = code;
        } 
        
        public char getCode() {
            return code;
        }
    }
}
