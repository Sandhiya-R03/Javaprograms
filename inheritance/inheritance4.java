/ Write a program by creating a class called "Bicycle" as a base class with the number of gears and speed of the bicycle as integer attributes and creating a class called "MontaneBike," a derived class that extends the Bicycle class with an attribute called "seat height" as an integer. Create a Test class to run the program and obtain the output on the console.

Note: Override the toString() method to display the details of the bicycle.

Input Format
The first line of the input consist of integer (Number of gears, Speed of bicycle, and Seat height).

Output Format
Display the number of gears and speed of the bicycle 

Constraints
integers only.

Sample Input
2 90 40
Sample Output
No of gears are 2
speed of bicycle is 90
seat height is 40
Sample Input
3 60 20
Sample Output
No of gears are 3
speed of bicycle is 60
seat height is 20
/
  import java.util.Scanner;

class Bicycle{
    int gears; int speed;
}

class MontaneBike extends Bicycle{
    int seat;
    public void display(){
        System.out.println("No of gears are " + gears);
        System.out.println("speed of bicycle is " + speed);
        System.out.println("seat height is " + seat);
    }
    
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MontaneBike mb = new MontaneBike();
        mb.gears = sc.nextInt();
        mb.speed = sc.nextInt();
        mb.seat = sc.nextInt();
        
        mb.display();
    }
}
