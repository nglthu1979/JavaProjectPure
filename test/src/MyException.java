import java.lang.RuntimeException;
public class MyException extends Exception{

   public static void g() {
        throw new RuntimeException("From g()"); //Line 5
    }
   public static void f() {
        g(); //Line 8
    }
    public static void main(String[] args) {
        f(); //Line 11
    }

   
    
}
