import java.util.*;

class Employee{
    int eNo;
    String eName;
    double eSalary;

    Employee(int e,String n,double s){
        eNo=e;
        eName=n;
        eSalary=s;
    }

    void display(){
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);;
    }


}

public class AOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int no = sc.nextInt();

        Employee Emp[]=new Employee[no];

        for(int i=0;i<no;i++){
            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.println("Enter Employee No: ");
            int e=sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String n = sc.next();

            System.out.print("Enter Employee Salary: ");
            double s = sc.nextDouble();

            Emp[i]=new Employee(e, n, s);

        }
        System.out.print("\nEnter employee number to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for(int i=0;i<no;i++){
            if(key==Emp[i].eNo){
                Emp[i].display();
                found=true;
                break;
            }
        
        }
        if(!found){
            System.out.println("Employee doesnt exist");
        }
    }
}
