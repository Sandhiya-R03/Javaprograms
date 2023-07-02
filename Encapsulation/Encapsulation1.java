/ Employee Details:

Create a class called "Employee" in which the employee's name, ID, and salary are declared as private attributes and the company name is a static variable. The data types of the members are as follows:

String eName; 
int eId; 
int eSalary; 
String companyName ; // static variable

Note: Use the public setter and getter methods to set and read the value of the attributes.
Initial companyName = "ABC Corp"

Input Format
The first input represents the number of employee details to be entered.
The next n inputs represent employee details with name, ID, and salary.
The last input represents the company name to be updated.

Output Format
Display the employee details entered by the user and also display the updated employee details.
Refer to the sample input and output for format specifications.

Sample Input 
2
Sachin
40
90000
Dhoni
42
95000
XYZCorp
Sample Output
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: ABC Corp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: ABC Corp
Updated Details
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: XYZCorp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: XYZCorp
Sample Input
3
Sachin
40
90000
Dhoni
42
95000
Angel
30
98000
ERPCorp
Sample Output
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: ABC Corp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: ABC Corp
Employee Name: Angel
Employee ID: 30
Employee Salary: 98000
Employee Company Name: ABC Corp
Updated Details
Employee Name: Sachin
Employee ID: 40
Employee Salary: 90000
Employee Company Name: ERPCorp
Employee Name: Dhoni
Employee ID: 42
Employee Salary: 95000
Employee Company Name: ERPCorp
Employee Name: Angel
Employee ID: 30
Employee Salary: 98000
Employee Company Name: ERPCorp
/
  import java.util.Scanner;

class Employee{
    private String name;
    private int id,salary;
    private String cname = "ABC Corp";
    
    public void setDetails(String a, int b, int c){
        this.name = a;
        this.id = b;
        this.salary = c;
    }
    
    public void setC(String comp){
        this.cname = comp;
    }
    
    public void get(){
        System.out.printf("Employee Name: %s\nEmployee ID: %d\nEmployee Salary: %d\nEmployee Company Name: %s\n",name,id,salary,cname);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee[] emps = new Employee[n];
        
        for(int i = 0; i < n; i++){
            Employee e = new Employee();
            String a = sc.next();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            e.setDetails(a,b,c);
            emps[i] = e;
            e.get();
        }
        String comp = sc.next();
        for(int i = 0; i < n; i++){
            emps[i].setC(comp);
        }
        
        System.out.println("Updated Details");
        for(int i = 0; i < n; i++){
            emps[i].get();
        }
    }
}
