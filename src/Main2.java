import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Employee> t1 = new TreeSet(new Salary()) ;
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Enter Employee id");
            int idd=s1.nextInt();
            System.out.println("Enter Employee Name");
            String nm=s1.next();
            System.out.println("Enter Employee Salary");
            double p=s1.nextDouble();
            t1.add(new Employee(idd,nm,p));

        }






        for(Employee p:t1){
            System.out.println(p);
        }
    }
}
