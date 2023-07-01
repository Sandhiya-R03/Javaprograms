/ QUESTION:
Write a program to generate the first n terms in the series 

0.5,1.5,4.5,13.5,.../
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double a=0.5;
	System.out.print(a);
	for(int i=0;i<n-1;i++){
	    a*=3;
	    System.out.print(" "+a);
	}
	}
}
