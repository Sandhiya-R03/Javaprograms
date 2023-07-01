/ QUESTION:

Dr. Dexter's car's seat belt detectors have been corrupted. So he wants you to build a module which checks if all the seat belts are worn. If and only if all the seat belts are worn Xinyou must start driving.
Write a program module that checks if all the seat belts have been worn.

 
INPUT FORMAT:

Input consists of 3 lines.
The 3 lines consist of strings 'yes' or 'no' corresponding to whether the seat belts have been worn or not.
OUTPUT FORMAT:
Output consists of a single string 'Yes I can drive' or 'No I can't drive' or 'Invalid Input'
Refer to the sample input and output for formatting specifications. 
Assume that all inputs consist of lowercase characters only.
[All text in bold corresponds to input and the rest to output.]

SAMPLE INPUT & OUTPUT 1:
yes
yes
yes
Yes I can drive  
SAMPLE INPUT & OUTPUT 2:
No
Yes
Yes
Invalid Input
/
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		// get vals from user
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		if(a.equalsIgnoreCase("yes")&&b.equalsIgnoreCase("yes")&&c.equalsIgnoreCase("yes")){
		    System.out.println("Yes I can drive");
		}
		else if(a.equalsIgnoreCase("no")&&b.equalsIgnoreCase("no")&&c.equalsIgnoreCase("no")){
		    System.out.println("No I can't drive");
		}
		else{
		    System.out.println("Invalid Input");
		}
	}
}
