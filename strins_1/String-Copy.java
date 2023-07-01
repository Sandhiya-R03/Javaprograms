/ Write a  program to copy a string from one variable to other using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

The copied String is hello. /
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get strings from user
    Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//copy string 
String s1=s;
//print the o/p
System.out.print("The copied String is "+ s1);
        
    }
}
