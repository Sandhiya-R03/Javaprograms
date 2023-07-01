/ Write a program to scan the string from the user and to print it.

Input Format:

Input consist of 1 string.
Sample Input & Output:

Hello World/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get strings from user
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //print the string
        System.out.print("The string is "+ s);
    }
}
