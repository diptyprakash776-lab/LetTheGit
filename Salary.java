import java.util.*;
public class Salary {
    public static void main(String[] args) {
        double basicSalary;
        double grossSalary;

        Scanner r=new Scanner(System.in);

        basicSalary=r.nextInt();
        grossSalary=r.nextInt();

        if (basicSalary<=10000) {

          grossSalary=100000+0;  
        }
        if (basicSalary<=50000 && basicSalary<=100001) {
            grossSalary=basicSalary+0.10;
            
        }
        if (basicSalary<=50000 && basicSalary<=100000) {
            grossSalary=basicSalary+0.20;
            
        }
        if (basicSalary>100000) {
            grossSalary=basicSalary+0.30;
            
        }
        System.out.println(grossSalary);
        
    }
    
}
