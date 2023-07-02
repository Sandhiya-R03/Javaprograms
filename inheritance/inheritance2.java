/ A company maintains a database that has the details of all the employees. There are two levels of employees where level 1 is the top management having salary more than 100 dollars and level 2 is the staffs who are getting a salary less than 100 dollars. Create a class named Employee with empId and salary as attributes. Create another class empLevel that extends employee and categorizes the employee into various levels.

Input Format
The input should contain only the employee id and salary of the employee separated by space.
Employee id should be of integer type and salary float type.

Output Format
The output of the program must display the employee id, salary, and level of the employee one below the other in the same order.

Sample Input
253 5.6
Sample Output
253
5.6
2/
  import java.util.Scanner;

class Employee{
    int empID;
    float salary;
}

class EmpLevel extends Employee{
    void level(){
        if(salary > 100){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EmpLevel e = new EmpLevel();
        
        e.empID = sc.nextInt();
        e.salary = sc.nextFloat();
        System.out.println(e.empID + "\n" + e.salary);
        e.level();
    }
}
