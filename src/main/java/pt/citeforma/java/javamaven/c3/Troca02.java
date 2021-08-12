package pt.citeforma.java.javamaven.c3;

public class Troca02 {
    
    public float x = 2.0f, y = 3.0f;
    
    public void troca(String nome){
        
        float t;
        System.out.println(nome + " - Antes: x = " + this.x + " y = " + this.y);
        t = this.x; 
        this.x = this.y; 
        this.y = t;
        System.out.println(nome + " - Depois: x = " + this.x + " y = " + this.y + "\n");
    }
    
    public static void main(String[] s){
        
        Troca02 obj1 = new Troca02();
        obj1.troca("Objecto 1");
        
        Troca02 obj2 = new Troca02();
        obj2.troca("Objecto 2");
    }
}
