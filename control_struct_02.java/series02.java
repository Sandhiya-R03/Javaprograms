/ QUESTION:
Write a program to generate the first n terms in the series 

121,225,361,.../
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		// get vals from user
		int x=11;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int n=4;
		System.out.print(x*x);
		for( int i=1;i<n;i++){
		 x+=4;
		        System.out.print(" "+x*x);
		       // x+=4;
		 
		        
		    }
		}
	}
