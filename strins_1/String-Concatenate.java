/ There were two best friends. They had a fight between them and they were not talked with each other. Help those two peoples to join again and let them enjoyed. Find the concatenation of given two strings using string library functions:

Input Format:

Input consist of 2 string.
Sample Input & Output:

Hello

all

Helloall/
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
        //String s2=s.concate(s1);
        System.out.print(s+s1);
    }
}
