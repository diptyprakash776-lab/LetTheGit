import java.util.Scanner;

public class IfElseFive {
    public static void main(String ar[]){

        int a;
        int b;
        int c;
        int d;
        int e;
        Scanner s=new Scanner (System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();
        if (a>b & a>c & a>d & a>e){
            System.out.println(a); 
            }

        if (b>a & b>c & a>e & a>d){
         System.out.println(b);
         }
    
        
    }
    
}
