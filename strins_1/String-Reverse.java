/ Write a  program to find the reverse of the given without string using string library functions:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

The reversed String is olleh/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        //get strings from user
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
      //  String s1=s.reverse();
      //  s.reverse();
      StringBuffer s1= new StringBuffer(s);
      s1.reverse();
        System.out.print("The reversed string is "+s1);
    }
}
