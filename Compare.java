import java.util.Scanner;

public class Compare {
    public static void main(String[] args, int i) {
        int a;
        int b;

        Scanner s=new Scanner (System.in);
        a=s.nextInt();
        b=s.nextInt();
        if (a>b) {
            System.out.println(a);
            
        }
        if (a==i){
            System.out.println("similar",a);
        }
        if(a<b){
            System.out.println("Smaller",a);
        }
    }
    
}
