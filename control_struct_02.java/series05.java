/ QUESTION:
Write a program to generate the first n terms in the series.

4,5,9,18,34,.../
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		//get vals from user
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=4;
		int m,o;
		System.out.print(x);
		for(int i=1;i<=n-1;i++){
		    int y;
		    m=i*i;
		    o=x+m;
		    System.out.print(" " + o);
		    x = o;
		}
}}
