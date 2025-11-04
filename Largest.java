import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if (a>b){
            System.out.println("biggger"+a);
            if (b>c) {
                System.err.println("bigger"+b);
                if (a>c) {
                    System.err.println("bigger"+a);
                    
                }
                
            }
        }
    }
    
}
