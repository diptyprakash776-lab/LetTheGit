import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        if (a==b && a==c) {
            System.out.println("traingle");
            
        }
        else if
            (a==b || b==c || c==a)
        {
            System.out.println("isoscene");
        }
        else{
            System.out.println("scalene");
        }

    }
    
}
