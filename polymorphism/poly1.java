/ METHOD OVERLOADING

Create a Java class called 'Hello' with method named 'sayHello' that demonstrate method overloading:

A method named 'sayHello' without any parameters that prints "Hello" to the console.
A second method named 'sayHello' with one parameter that takes a String argument 'name' and prints "Hello [name]" to the console.
Input Format
The input contains a string.

Output Format
The first line of the output should display 'Hello'
The second line of the output should display 'Hello <input>'

Sample Input
John
Sample Output
Hello
Hello John
Sample Input
Ramya
Sample Output
Hello
Hello Ramya/
  import java.util.Scanner;

class Hello{
    public void sayHello(){
        System.out.println("Hello");
    }
    
    public void sayHello(String s){
        System.out.printf("Hello %s",s);
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Hello h = new Hello();
        h.sayHello();
        h.sayHello(s);
    }
}
