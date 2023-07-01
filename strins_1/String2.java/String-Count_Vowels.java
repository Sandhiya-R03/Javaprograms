/Write a program to count the number of vowels in the given string:

Input Format:

Input consist of 1 string.
Sample Input & Output:

hello

Number of vowels: 2/
  import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Write your code
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print("Number of vowels: "+count);
    }
}
