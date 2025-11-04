import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
           int y;
           double Salary;
        Scanner r=new Scanner(System.in);
        y=r.nextInt();
        Salary=r.nextInt();
        if (y>5) {
          Salary=Salary+.5;  
        }
        System.out.println(Salary);
    }
    
}
