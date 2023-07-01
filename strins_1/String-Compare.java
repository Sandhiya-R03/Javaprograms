/ Write a  program to find whether the given two strings are same or not using string library functions:

Input& Output Format:

Input consist of 2 string.
If two strings are same display “Strings are same”,else display “Strings are not same”.
Sample Input & Output:

hello

hello

Strings are same/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get strings from user
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        if(s.equals(s1)){
            System.out.print("Strings are same");
        }
        else{
            System.out.print("Strings are not same");
        }
    }
}
