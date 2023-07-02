/ Write a Java program that prints a welcome message and a hello message using two different classes Message and Hello, each with a default constructor that outputs a specific message.

Input Format:
No console Input.

Output Format:
The Output Should display the Welcome Message 

Sample 1 Input:
No input values.

Sample 1 Output:
Welcome Hello/
  //import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //write your code
        Msg mg=new Msg();
        mg.Msg();
        Hello hl=new Hello();
        hl.Hello();
    }
}
class Msg{
    public void Msg(){
    System.out.println("Welcome Message");
}}
class Hello{
    public void Hello(){
    System.out.println("Welcome Hello");
}}
