/ Write a program to change the given string to uppercase without using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

good

GOOD/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(s.toUpperCase());
    }
}
