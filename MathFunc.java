import java.util.Scanner;

public class MathFunc {
    public static void main(String ar[]) {
        int a = 5;
        int b = 6;

        // Addition: 5 + 6 = 11
        int e;
        e = a + b; 
        
        // Subtraction: 5 - 6 = -1
        int f;
        f = a - b; 
        
        // Division: 5 / 6 = 0 (Integer division truncates the decimal)
        int g;
        g = a / b; 
        
        // Multiplication: 5 * 6 = 30
        int h;
        h = a * b; 

        // Corrected lines to print the *values* of the variables
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}