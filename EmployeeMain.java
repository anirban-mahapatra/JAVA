/*CREATE A CLASS EMPLOYEE WITH FOLLOWING PROPERTIES AND METHODS :
SALARY(PROPERTY)(INT)
GET SALARY(METHOD RETURNING INT)
NAME(PROPERTY)(STRING)
GET NAME(METHOD RETURNING STRING)
SET NAME(METHOD CHANGING NAME)
 */
package question_solution;
import java.util.*;

class Employee{
    Scanner sc=new Scanner(System.in);
    String name;
    int salary;
    public void getname(){
        System.out.print("Enter the Name of the employee :");
        name= sc.next();
    }
    public String setname(){
        return name;
    }
    public int getsalary(){
        System.out.print("Enter the salary of the employee :");
        salary=sc.nextInt();
        return salary;
    }
}

public class EmployeeMain {
    public static void main(String[] args){
        Employee ani=new Employee();
        ani.getname();
        System.out.println("\nThe name of the employee is "+ani.setname()+"\nSalary = "+ani.getsalary()+" k");
    }
}
