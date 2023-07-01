/ Write a  program to find the length of the given string using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

Java

The length of Java is 4/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get strings from user
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //length of string
        //print the length of string 
        System.out.print("The length of "+ s + " is "+s.length());
    }
}
