/ QUESTION:
Xinyou has an in-built GPS system that gives its current position coordinates as input. Using these coordinates Xinyou gets the current weather information. Initially, Dr. Dexter wants Xinyou to drive only when it is sunny. The different weather conditions are 'sunny', 'rainy', and 'foggy'.

Given the weather condition, write a program to check whether Xinyou can drive or not.
 
INPUT FORMAT:

Input consists of a string, corresponding to the weather condition.

OUTPUT FORMAT:

Output is a string "Yes I can drive smile" or "Sorry invalid input :|" or "No I cant drive sad".
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT 1:
sunny
Yes I can drive :)
SAMPLE INPUT & OUTPUT 2:
misty
Sorry invalid input :|
SAMPLE INPUT & OUTPUT3:
rainy
No I cant drive :( /
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc=new Scanner(System.in); 
		//String s;
		String s1=sc.nextLine();
	//	String s2=sc.nextLine();
		//String s3=sc.nextLine();
		if(s1.equalsIgnoreCase("sunny")){
		    System.out.println("Yes I can drive :)");
		}
		else if(s1.equalsIgnoreCase("misty")){
		    System.out.println("Sorry invalid input :|");
		}
		else {
		    System.out.println("No I cant drive :(");
		}
		
		
	}
}
