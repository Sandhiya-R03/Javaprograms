/ Write a program to generate the given pattern.
if n = 4,
****
*  *
*  *
****/
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		//get n vals from user
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            if(i==0||j==0||i==n-1||j==n-1)
	            {
	                System.out.print("*");
	                
	            }
	                else
	                {
	                    System.out.print(" ");
	                    
	                }
	            }System.out.println();
		    
		}
	            //System.out.println();
	    }
	}
