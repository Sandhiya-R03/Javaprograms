/ Constructor is a special method that has same name as its same class name.
Default Constructor is a constructor that has no arguments or if it has parameters it will have default values.
Create a class Main with the following member variables
int length
int breadth
int height
int radius
In Main class, get the details of the values of all variables and pass it to the shape class
Create a class Shape with the following member variables
int length
int breadth
int height
int radius
The values are passed from Main class as parameters to the constructors in Shape class. 
In Shape class, create four constructors. 
First constructor is default constructor.Shape(){}
Second constructor is for cube, which receives length, breadth and height as arguments.
Shape(int lenght,int breadth,int height){constructor body}
Third constructor is for sphere, which receives radius as arguments.

Shape(int radius){constructor body}
Fourth constructor is for cylinder, which receives radius and height as arguments.
Shape(int radius, int height){Constructor body}
Include three methods in Shape class namely
public float calculateAreaOfCylinder()
public float calculateAreaOfSphere()
public Integer calculateAreaOfCube()  to calculate the area of each shapes.
Sample Input and Output 1 :
1.Cube
2.Sphere
3.Cylinder
Enter the choice
1
length
10
breadth
20
height
30
Area of Cube is 6000

Sample Input and Output 2:
1.Cube
2.Sphere
3.Cylinder
Enter the choice
2
radius
10
Area of sphere is 4186.67

Sample Input and Output 3:
1.Cube
2.Sphere
3.Cylinder
Enter the choice
3
radius
10
height
5
Area of Cylinders is 1570.0/
  import java.util.Scanner;
class Cube{
          int volume;
          Cube(int length,int breadth,int height){
             volume = length*breadth*height;}
          void displayCube(){System.out.println("Area of Cube is "+volume);}}
class Sphere{          
          double volume;
          Sphere(int radius){
             volume = ((4.0/3.0)*3.14*radius*radius*radius);
          } void displaySphere(){System.out.printf("Area of Sphere is "+"%.2f",volume);}}
class Cylinder{          
           double volume;
           Cylinder(int radius,int height){
             volume = (3.14*radius*radius*height);
          } void displayCylinder(){System.out.println("Area of Cylinders is "+volume);}
      }

class Main{
    public static void main(String[]args){
        System.out.println("Enter the choice");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         if(a==1){
             System.out.println("length");
             int length = sc.nextInt();
             System.out.println("breadth");
             int breadth = sc.nextInt();
             System.out.println("height");
             int height = sc.nextInt();
             Cube c = new Cube(length,breadth,height);
             c.displayCube();
        }else if(a==2){
            System.out.println("radius");
            int radius = sc.nextInt();
            Sphere s = new Sphere(radius);
            s.displaySphere();
        }else{
            System.out.println("radius");
            int radius = sc.nextInt();
            System.out.println("height");
            int height = sc.nextInt();
            Cylinder g = new Cylinder(radius,height);
            g.displayCylinder();
        }
    }    
 }
