/ Write a program to generate the given pattern.
If n = 4,

1
2 2
3 3 3
4 4 4 4/
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		//get vals from user
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(i+" ");
		        //System.out.println("");
		    }
		  System.out.println();  
		}
	}
}
