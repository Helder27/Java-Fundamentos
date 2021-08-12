package pt.citeforma.java.javamaven.c3;

public class This01 {
    
    int x;
    
    public void m1(int x){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
         /*
        Button b = new Button("Save");
        b.addActionListener((ActionListener) this);
        */
    }
    
    public static void main(String[] args) {
        This01 obj1 = new This01();
        obj1.x = 3;
        obj1.m1(4);
    }
}
