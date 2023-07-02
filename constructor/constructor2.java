/ The copy constructor is a constructor which creates an object by initializing it with an object of the same class, which has been created previously.
Create three class called Main, Student and Department.
public class Main{}
public class Studen{}
public classDepartment{}
In Main class, get all details of the student such as Name, id and Department.
In Department class only id and department fields are declared as private.
    private String name;
    private int id;
Include getter and setter for appropriate fields in Department class.
Create a constructor with two arguments id and department.
public Department(int id, String name) 
public Department(Department oldDepartment) 
In Student class create a constructor with three arguments Id, Name and Department object.
    private String name;
    private int id;
    private Department department;
Include getter and setter for appropriate fields in Student class.
Create an object for Department class and the constructor will be initialized.
        Department department = new Department(id,depar);
Create an object for Student class and the constructor will be initialized.
        Student originalEmployee = new Student(id,name, department);
Display the details of the student.
System.out.println("Original:- " + originalEmployee);
Then create a new object which copies the first constructor object.
       Student clonedEmployee = new Student(originalEmployee);
Display the details of the student after copy constructor is initialized.
System.out.println("Duplicate:- " + clonedEmployee);
public String toString() 
    {
        return "\nStudent Id: " + id + "\nStudent Name: " + name + ""+ department;
    }
 
Sample Input and Output 1:
Name
Sherin
Id
45
Department
CSE
Original:- 
Id: 45
Name: Sherin
Department Id: 45
Department: CSE
Duplicate:- 
Id: 45
Name: Sherin
Department Id: 45
Department: CSE

Sample Input and Output 2:
Name
Jeni
Id
678
Department
Civil
Original:- 
Id: 678
Name: Jeni
Department Id: 678
Department: Civil
Duplicate:- 
Id: 678
Name: Jeni
Department Id: 678
Department: Civil

Sample Input and Output 3:
Name
Eve
Id
345
Department
Mech
Original:- 
Id: 345
Name: Eve
Department Id: 345
Department: Mech
Duplicate:- 
Id: 345
Name: Eve
Department Id: 345 /
  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name\nId\nDepartment");
        String name = sc.nextLine();
        int id = sc.nextInt();
        String departmentName = sc.next();

        // Create Department object
        Department department = new Department(id, departmentName);

        // Create Student object
        Student originalStudent = new Student(id, name, department);

        // Display original student details
        System.out.println("Original:-" + originalStudent);

        // Create a new object using copy constructor
        Student clonedStudent = new Student(originalStudent);

        // Display cloned student details
        System.out.println("Duplicate:-" + clonedStudent);
    }
}

class Student {
    private String name;
    private int id;
    private Department department;

    public Student(int id, String name, Department department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Copy constructor
    public Student(Student originalStudent) {
        this.id = originalStudent.getId();
        this.name = originalStudent.getName();
        this.department = new Department(originalStudent.getDepartment());
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        return "\nId: " + id + "\nName: " + name + "\n" + department;
    }
}

class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    public Department(Department oldDepartment) {
        this.id = oldDepartment.getId();
        this.name = oldDepartment.getName();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Department Id: " + id + "\nDepartment:" + name;
    }
}
