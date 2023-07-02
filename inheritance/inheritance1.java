/ Given a Book class and the main class, write a MyBook class that does the following:

Inherits from the book and has a parameterized constructor taking these 3 parameters:

string title
string author
int price
Implements the Book class' abstract display() method so it prints the title, author, and price.

Input Format
The first line of the input consists of a string
The second line of the input consists of a string
The third line of the input consists of an integer

Output Format
Display the book details.

Constraints
Strings and integers only.

Sample Input
love
jack
300

Sample Output
Title: love
Author: jack
Price: 300
Sample Input
stars
juno
150
Sample Output
Title: stars
Author: juno
Price: 150
/
  import java.util.Scanner;
class Book{
    public void display(){
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        int n=sc.nextInt();
    System.out.println("Title : "+s);
    System.out.println("Author : "+s1);
    System.out.println("Price " +n);
}}
class MyBook extends Book{
    MyBook(){}
}
public class Main{
    public static void main(String[] args){
         MyBook mb=new MyBook();
    mb.display();
        
    }
}
