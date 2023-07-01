/ Write a program to find whether the given string is palindrome or not without using string library functions:


Input Format:

Input consist of 1 string.
If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.
Sample Input & Output:
computer
Not a Palindrome/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       //String s1= s.reverse();
       StringBuffer s1=new StringBuffer(s);
       s1.reverse();
        if(s.equals(s1)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}
