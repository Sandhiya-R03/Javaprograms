/ QUESTION:


Now, Xinyou is quite well versed with driving skills. He now has to learn the traffic signals. Write a C program that instructs Xinyou in this regard.
 
INPUT & OUTPUT FORMAT:
Input consists of a string 's' corresponding to the color of the traffic light red, yellow or green.
Assume that the input consists of lowercase characters only.
Output consists of a single line, a string 'Go', 'Stop','Get Ready' or 'Invalid Input'.
Refer to the sample input and output for formatting specifications. 
SAMPLE INPUT & OUTPUT 1:
red
Stop
SAMPLE INPUT & OUTPUT 2:
blue
Invalid Input
SAMPLE INPUT & OUTPUT 3:
Blue
Invalid Input
/
  import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		//get vals from user
		//String s=sc.nextLine();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("red")||s.equals("yellow")||s.equalsIgnoreCase("green")){
		    if(s.equalsIgnoreCase("red")){
		        System.out.println("Stop");
		    }
		    else if(s.equalsIgnoreCase("green")){
		        System.out.println("Go");
		    }
		    else if(s.equalsIgnoreCase("yellow")){
		        System.out.println("Get Ready");
		    }
	}
	else {
	    System.out.println("Invalid Input");
	}
}}
