/ Write a program to scan the string from the user and to print it.

Input Format:

Input consist of 1 string.
Sample Input & Output:

Hello

The string is Hello

/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get string vals from user
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //split the strings
          //String[] res=s.spilt(" ");
        //String res1=res[0];
        System.out.print("The string is " +s);
    }
}
