import java.util.*;

public class Traffic{
    public static void main(String[] args) {
        String l;
       

        Scanner h=new Scanner(System.in);
         l=h.nextLine();
         l=l.toLowerCase();
         l=l.toUpperCase();
  

         if (l.equals("red") ) {
            System.out.println("STOP");
            
         }
         
         if (l.equals("yellow") ) {
            System.out.println("START");
            
         }
         if (l.equals("green") ) {
            System.out.println("GO");
            
         }
    }
} 